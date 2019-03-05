package com.ricardo.service.impl;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.bean.DataException;
import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.jpa.MiddleStatusRepository;
import com.ricardo.domain.mysqldata.pipe.pipManage.PipManage;
import com.ricardo.domain.mysqldata.pipe.pipManage.service.PipManageRepository;
import com.ricardo.domain.mysqldata.pipe.pipMaterial.PipMaterial;
import com.ricardo.domain.mysqldata.pipe.pipMaterial.service.PipMaterialRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeManage;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeMaterial;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeManageRepository;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeMaterialRepository;
import com.ricardo.service.PipeManageService;
import com.ricardo.service.PipeMaterialService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 *@Author: Ricardo
 *@Description:  pipe_unit和  PipeUnit通过id-OID 对应唯一数据
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class PipeMaterialServiceImpl implements PipeMaterialService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MiddleStatusRepository middleStatusRepository;
    @Autowired
    private SqlPipeMaterialRepository sqlPipeMaterialRepository;

    @Autowired
    private PipMaterialRepository pipMaterialRepository;


    @Transactional(rollbackFor = DataException.class)
    private void updateData()throws DataException {
        System.out.println("--updateData()");
        List<SqlPipeMaterial> objectList = sqlPipeMaterialRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                SqlPipeMaterial temp = objectList.get(i);
                try{
                    //1.更新mysql
                    PipMaterial object =new PipMaterial(temp);
                    pipMaterialRepository.save(object);
                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    sqlPipeMaterialRepository.save(temp);
                }catch (Exception e){
                    //产生异常则保存一份异常信息
                    String infor = "PipeMaterial 更新失败！";
                    System.out.println("--updateData() "+infor);

                    MiddleStatus middleStatus = new MiddleStatus(infor,Constants.TB_sqlPipeMaterial,temp.toString(),Constants.OP_UPDATE);
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
