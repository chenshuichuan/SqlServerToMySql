package com.ricardo.service.impl;


import com.ricardo.domain.sqlserverdata.bean.PipeComponent;
import com.ricardo.domain.sqlserverdata.jpa.PipeComponentRepository;
import com.ricardo.service.PipeComponentService;
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
public class PipeComponentServiceImpl implements PipeComponentService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate mysqlJdbc;//mysql myuser

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate sqlserverJdbc;///sqlserver book

    @Autowired
    private PipeComponentRepository pipeComponentRepository;

    //PipeComponent 表没有更新、删除标志
    //那么，如何得到新数据？直接对两个数据库？
    @Override
    public void update() {
//        List<PipeComponent> objectList = pipeComponentRepository.findByIsUpdate(Boolean.TRUE);
//        if(objectList!=null&&objectList.size()>0){
//            for (int i = 0; i < objectList.size(); i++) {
//                PipeComponent workPipe = objectList.get(i);
//                try{
//
//                    //1.更新mysql
//
//                    //2.更新SQL server
//                    pipeComponentRepository.save(workPipe);
//
//                }catch (Exception e){
//                    logger.error("id="+objectList.get(i)+"的PipeComponent数据更新错误！");
//                    logger.error(e.toString());
//                }
//            }
//        }
//        //按理说不应该进入这行，因为scanTable已经过滤是否需要更新了，再进入就说明有问题
//        else logger.error("没有需要更新的PipeComponent数据！");

    }

    @Override
    public void delete() {
//        List<PipeComponent> objectList = pipeComponentRepository.findByIsDelete(Boolean.TRUE);
//        if(objectList!=null&&objectList.size()>0){
//            for (int i = 0; i < objectList.size(); i++) {
//                try{
//
//                    //1.更新mysql
//
//                    //2.更新SQL server
//
//                    //这里应该同时删除MySQL的数据吗？
//                    pipeComponentRepository.delete(objectList.get(i));
//                }catch (Exception e){
//                    logger.error("id="+objectList.get(i)+"的PipeComponent数据删除错误！");
//                    logger.error(e.toString());
//                }
//            }
//        }
//        //按理说不应该进入这行，因为scanTable已经过滤是否需要删除了，再进入就说明有问题
//        else logger.error("没有需要删除的PipeComponent数据！");
    }
}
