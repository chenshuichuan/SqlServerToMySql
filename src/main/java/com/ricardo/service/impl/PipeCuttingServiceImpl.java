package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.batch.service.BatchRepository;
import com.ricardo.domain.mysqldata.pipe.pipCutting.PipCutting;
import com.ricardo.domain.mysqldata.pipe.pipCutting.service.PipCuttingRepository;
import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;
import com.ricardo.domain.mysqldata.pipe.pipe.service.PipeRepository;
import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import com.ricardo.domain.mysqldata.pipe.unit.service.UnitRepository;
import com.ricardo.domain.sqlserverdata.bean.*;
import com.ricardo.domain.sqlserverdata.jpa.*;
import com.ricardo.service.PipeCuttingService;
import com.ricardo.service.PipeUnitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
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
    private SqlPipeUnitRepository sqlPipeUnitRepository;
    @Autowired
    private  SqlPipeBatchRepository sqlPipeBatchRepository;

    @Autowired
    private SqlPipeRepository sqlPipeRepository;


    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private PipCuttingRepository pipCuttingRepository;

    @Autowired
    private PipeRepository pipeRepository;


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

                    //更新pipe_pipe 表
                    updatePipe(temp);

                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeCuttingRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "PipeCutting 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipeCutting,temp.toString(),Constants.OP_UPDATE);
                    DataException dataException = new DataException(infor+e.getMessage());
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

    /**
     *根据构想，以pipeCutting表的号船id和装配管ID确定一根管，那么pipeCutting的OID作为pipe_pipe的id
     */
    private void updatePipe(SqlPipeCutting sqlPipeCutting)throws Exception{
        SqlPipeUnit sqlPipeUnit = sqlPipeUnitRepository.findOne(sqlPipeCutting.getProcessUnitId());
        SqlPipeBatch sqlPipeBatch = sqlPipeBatchRepository.findOne(sqlPipeUnit.getProcessBatchId());
        if(sqlPipeBatch.getCallShipId()!=sqlPipeCutting.getCallShipId()){
            throw new Exception("构建pipe_pipe的数据不匹配！");
        }
        SqlShipManage sqlShipManage = sqlShipManageRepository.findOne(sqlPipeBatch.getCallShipId());
        SqlPipe sqlPipe = sqlPipeRepository.findOne(sqlPipeCutting.getAssemblyId());
        //不存在则新建
        Pipe pipe = pipeRepository.findOne(sqlPipeCutting.getOldId());
        if(pipe ==null){
            pipe = new Pipe(sqlPipeCutting);
            pipe.setShipCode(sqlShipManage.getCallShipCode());
            pipe.setBatchId(sqlPipeUnit.getProcessBatchId());
            pipe.setCollecteCode(sqlPipe.getSetCode());

            pipeRepository.save(pipe);
        }
        //存在则更新
        else{
            //一般不会产生这个样的情况吧，老哥！
            if(pipe.getCallShipId()==sqlPipeCutting.getCallShipId()&&pipe.getAssemblyPipeId()==sqlPipeCutting.getAssemblyId()){
                pipe.setUnitId(sqlPipeCutting.getProcessUnitId());
                pipe.setShipCode(sqlShipManage.getCallShipCode());
                pipe.setBatchId(sqlPipeUnit.getProcessBatchId());
                pipe.setCollecteCode(sqlPipe.getSetCode());
                pipe.setUpdateTime(new Date());
                pipeRepository.save(pipe);
            }
            else{
                //更新其他 表？

                /////更新其他数据库表？
                ////
                ///注意啊老哥

                String infor = "更改 号船ID和装配管ID 将涉及大量数据！";
                logger.error(infor);
                throw new DataException(infor);
            }

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
