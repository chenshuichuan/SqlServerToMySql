package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;
import com.ricardo.domain.mysqldata.pipe.workPipe.service.WorkPipeRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlWorkPipe;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeUnitRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlWorkPipeRepository;
import com.ricardo.service.SqlWorkPipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 *@Author: Ricardo
 *@Description:  pipe_WorkPipe和  WorkPipe通过id-OID 对应唯一数据
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class SqlWorkPipeServiceImpl implements SqlWorkPipeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SqlPipeUnitRepository sqlPipeUnitRepository;
    @Autowired
    private SqlPipeBatchRepository sqlPipeBatchRepository;
    @Autowired
    private WorkPipeRepository workPipeRepository;
    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private SqlWorkPipeRepository sqlWorkPipeRepository;

    @Transactional(rollbackFor = DataException.class)
    private void updateData()throws DataException {
        System.out.println("--updateData()");
        List<SqlWorkPipe> objectList = sqlWorkPipeRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlWorkPipe temp = objectList.get(i);
                try{
                    //1.更新mysql
                    WorkPipe object =workPipeRepository.findOne(temp.getOldId());
                    //不存在则新建
                    if(object ==null){
                        object = new WorkPipe(temp);
                        workPipeRepository.save(object);
                    }
                    //存在则更新
                    else{
                        object = new WorkPipe(temp);
                        workPipeRepository.save(object);
                        //更新其他数据库表？

                    }
                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlWorkPipeRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "batch 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlWorkPipe,temp.toString(),Constants.OP_UPDATE);
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
