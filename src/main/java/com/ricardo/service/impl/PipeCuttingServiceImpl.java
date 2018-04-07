package com.ricardo.service.impl;

import com.ricardo.domain.sqlserverdata.bean.PipeCutting;
import com.ricardo.domain.sqlserverdata.jpa.PipeCuttingRepository;
import com.ricardo.service.PipeCuttingService;
import com.ricardo.service.PipeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 *@Author: Ricardo
 *@Description:
 *@Date: 23:54 2018/4/6
 *
 **/
@Service
public class PipeCuttingServiceImpl implements PipeCuttingService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate mysqlJdbc;//mysql myuser

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate sqlserverJdbc;///sqlserver book

    @Autowired
    private PipeCuttingRepository pipeCuttingRepository;

    @Override
    public void update() {
        List<PipeCutting> objectList = pipeCuttingRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                PipeCutting temp = objectList.get(i);
                try{

                    //1.更新mysql

                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    pipeCuttingRepository.save(temp);

                }catch (Exception e){
                    logger.error("id="+objectList.get(i)+"的PipeCutting数据更新错误！");
                    logger.error(e.toString());
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要更新了，再进入就说明有问题
        else logger.error("没有需要更新的PipeCutting数据！");

    }

    @Override
    public void delete() {
        List<PipeCutting> objectList = pipeCuttingRepository.findByIsDelete(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                try{

                    //1.更新mysql

                    //2.更新SQL server

                    //这里应该同时删除MySQL的数据吗？
                    pipeCuttingRepository.delete(objectList.get(i));
                }catch (Exception e){
                    logger.error("id="+objectList.get(i)+"的PipeCutting数据删除错误！");
                    logger.error(e.toString());
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要删除了，再进入就说明有问题
        else logger.error("没有需要删除的PipeCutting数据！");
    }

}
