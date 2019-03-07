package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import com.ricardo.domain.mysqldata.pipe.batch.service.BatchRepository;
import com.ricardo.domain.mysqldata.pipe.ship.Ship;
import com.ricardo.domain.mysqldata.pipe.ship.service.ShipRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeBatch;
import com.ricardo.domain.sqlserverdata.bean.SqlShipManage;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlShipManageRepository;
import com.ricardo.service.PipeBatchService;
import com.ricardo.service.ShipManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;


/**
 *@Author: Ricardo
 *@Description:  pipe_batch和  PipeBatch通过id-OID 对应唯一数据
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class PipeBatchServiceImpl implements PipeBatchService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SqlPipeBatchRepository sqlPipeBatchRepository;
    @Autowired
    private BatchRepository batchRepository;
    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private SqlShipManageRepository sqlShipManageRepository;

    @Transactional(rollbackFor = DataException.class)
    private void updateData()throws DataException {
        System.out.println("--updateData()");
        List<SqlPipeBatch> objectList = sqlPipeBatchRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlPipeBatch temp = objectList.get(i);
                try{
                    System.out.println("--updateData() try{"+temp.getProcessingBatch());
                    //1.更新mysql
                    Batch object =batchRepository.findOne(temp.getOldId());

                    //根据号船ID拿到号船代号
                    SqlShipManage sqlShipManage = sqlShipManageRepository.findOne(temp.getCallShipId());
                    //不存在则新建
                    if(object ==null){
                        System.out.println("--updateData() 新建:"+temp.getProcessingBatch());

                        object = new Batch(temp.getOldId(),temp.getProcessingBatch(),temp.getDescription(),sqlShipManage.getCallShipCode());
                        batchRepository.save(object);
                    }
                    //存在则更新
                    else{
                        System.out.println("--updateData() 更新"+temp.getProcessingBatch());

                        object.setShipCode(sqlShipManage.getCallShipCode());
                        object.setName(temp.getProcessingBatch());
                        object.setRemark(temp.getDescription());
                        object.setUpdateTime(new Date());
                        batchRepository.save(object);

                        //更新其他数据库表？

                    }
                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeBatchRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "batch 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipeBatch,temp.toString(),Constants.OP_UPDATE);
                    DataException dataException = new DataException(infor);
                    dataException.setMiddleStatus(middleStatus);
                    logger.info(infor+temp+e.getMessage());
                    //重新抛出异常使得数据库回滚？
                    throw dataException;
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要更新了，再进入就说明有问题
        else {
            logger.error("没有需要更新的PipeBatch数据！");
        }

    }


    @Transactional(rollbackFor = DataException.class)
    public void deleteData()throws DataException {
        List<SqlShipManage> objectList = sqlShipManageRepository.findByIsDelete(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要删除了，再进入就说明有问题
        else {
            logger.error("没有需要删除的ShipManage数据！");
        }
    }
    @Override
    public void update(){
        try{
            updateData();
        }
        catch (DataException d){
            middleStatusRepository.save(d.getMiddleStatus());
        }
    }
    @Override
    public void delete(){
        try{
            deleteData();
        }
        catch (DataException d){
            middleStatusRepository.save(d.getMiddleStatus());
        }
    }
}
