package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.batch.service.BatchRepository;
import com.ricardo.domain.mysqldata.pipe.pipCutting.PipCutting;
import com.ricardo.domain.mysqldata.pipe.pipCutting.service.PipCuttingRepository;
import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import com.ricardo.domain.mysqldata.pipe.unit.service.UnitRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeBatch;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeCutting;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeUnit;
import com.ricardo.domain.sqlserverdata.bean.SqlShipManage;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeCuttingRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeUnitRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlShipManageRepository;
import com.ricardo.service.PipeCuttingService;
import com.ricardo.service.PipeUnitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 *@Author: Ricardo
 *@Description:  pipe_pip_cutting和  PipeCutting通过id-OID 对应唯一数据
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class PipeCuttingServiceImpl implements PipeCuttingService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SqlShipManageRepository sqlShipManageRepository;
    @Autowired
    private SqlPipeCuttingRepository sqlPipeCuttingRepository;

    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private PipCuttingRepository pipCuttingRepository;


    @Transactional(rollbackFor = DataException.class)
    private void updateData()throws DataException {
        System.out.println("--updateData()");
        List<SqlPipeCutting> objectList = sqlPipeCuttingRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlPipeCutting temp = objectList.get(i);
                try{
                    //1.更新mysql
                    PipCutting object =new PipCutting(temp);
                    pipCuttingRepository.save(object);
                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeCuttingRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "PipeCutting 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipeCutting,temp.toString(),Constants.OP_UPDATE);
                    DataException dataException = new DataException(infor);
                    dataException.setMiddleStatus(middleStatus);
                    logger.error(infor+temp+e.getMessage());
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
