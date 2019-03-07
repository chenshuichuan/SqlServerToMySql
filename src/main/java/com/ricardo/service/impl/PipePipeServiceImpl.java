package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.pipPipe.domain.PipPipe;
import com.ricardo.domain.mysqldata.pipe.pipPipe.service.PipPipeRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipe;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeUnitRepository;
import com.ricardo.service.PipePipeService;
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
public class PipePipeServiceImpl implements PipePipeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private SqlPipeUnitRepository sqlPipeUnitRepository;
    @Autowired
    private SqlPipeBatchRepository sqlPipeBatchRepository;
    @Autowired
    private PipPipeRepository pipPipeRepository;
    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private SqlPipeRepository sqlPipeRepository;

    @Transactional(rollbackFor = DataException.class)
    private void updateData()throws DataException {
        System.out.println("--updateData()");
        List<SqlPipe> objectList = sqlPipeRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlPipe temp = objectList.get(i);
                try{
                    //System.out.println("--updateData() try{"+temp.ge());
                    //1.更新mysql
                    PipPipe object = new PipPipe(temp);
                    pipPipeRepository.save(object);
                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "batch 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipe,temp.toString(),Constants.OP_UPDATE);
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
