package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import com.ricardo.domain.mysqldata.pipe.batch.service.BatchRepository;
import com.ricardo.domain.mysqldata.pipe.pipe.service.PipeRepository;
import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import com.ricardo.domain.mysqldata.pipe.unit.service.UnitRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeBatch;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeUnit;
import com.ricardo.domain.sqlserverdata.bean.SqlShipManage;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeUnitRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlShipManageRepository;
import com.ricardo.service.PipeUnitService;
import com.ricardo.service.ShipManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 *@Author: Ricardo
 *@Description:  pipe_unit和  PipeUnit通过id-OID 对应唯一数据
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class PipeUnitServiceImpl implements PipeUnitService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SqlPipeUnitRepository sqlPipeUnitRepository;
    @Autowired
    private SqlPipeBatchRepository sqlPipeBatchRepository;
    @Autowired
    private UnitRepository unitRepository;
    @Autowired
    private BatchRepository batchRepository;
    @Autowired
    private PipeRepository pipeRepository;
    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private SqlShipManageRepository sqlShipManageRepository;

    @Transactional(rollbackFor = DataException.class)
    private List<Unit> updateData()throws DataException {
        List<Unit> unitList = new ArrayList<>();
        System.out.println("--updateData()");
        List<SqlPipeUnit> objectList = sqlPipeUnitRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlPipeUnit temp = objectList.get(i);
                try{
                    System.out.println("--updateData() try{"+temp.getProcessUnit());
                    //1.更新mysql
                    Unit object =unitRepository.findOne(temp.getOldId());
                    //根据号船ID拿到号船代号
                    SqlShipManage sqlShipManage = sqlShipManageRepository.findOne(temp.getCallShipId());
                    SqlPipeBatch sqlPipeBatch = sqlPipeBatchRepository.findOne(temp.getProcessBatchId());
//                    if(sqlShipManage==null || sqlPipeBatch==null){
//                        logger.error("单元所属船或批次不存在！");
//                        throw new Exception("单元所属船或批次不存在！");
//                    }
                    //不存在则新建
                    if(object ==null){
                        System.out.println("--updateData() 新建:"+temp.getProcessUnit());

                        object = new Unit(temp.getOldId(),temp.getProcessUnit(),sqlShipManage.getCallShipCode()
                                ,sqlPipeBatch.getOldId(),sqlPipeBatch.getProcessingBatch(),temp.getDescription());
                        //保存
                        unitList.add(object);
                        unitRepository.save(object);
                    }
                    //存在则更新
                    else{
                        System.out.println("--updateData() 更新"+temp.getProcessUnit());

                        object.setShipCode(sqlShipManage.getCallShipCode());
                        object.setName(temp.getProcessUnit());
                        object.setRemark(temp.getDescription());
                        object.setBatchId(sqlPipeBatch.getOldId());
                        object.setBatchName(sqlPipeBatch.getProcessingBatch());
                        object.setUpdateTime(new Date());
                        //保存
                        unitRepository.save(object);
                        //更新其他数据库表？

                    }

                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeUnitRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "batch 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipeUnit,temp.toString(),Constants.OP_UPDATE);
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
        return unitList;

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
    public List<Unit> update(){
        List<Unit> unitList = null;
        try{
            unitList = updateData();
        }
        catch (DataException d){
            middleStatusRepository.save(d.getMiddleStatus());
        }
        return unitList;
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

    /**
     * 计算单元的管件数*/
    @Override
    public int calPipeNumberOfUnit(Unit unit) {
        if(null == unit){
            return 0;
        }
        int number = pipeRepository.countByBatchIdAndUnitId(unit.getBatchId(),unit.getId());
        unit.setPipeNumber(number);
        unitRepository.save(unit);
        return number;
    }


}
