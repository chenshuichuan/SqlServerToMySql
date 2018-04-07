package com.ricardo.service.impl;

import com.ricardo.domain.sqlserverdata.bean.PipeManage;
import com.ricardo.domain.sqlserverdata.jpa.PipeManageRepository;
import com.ricardo.service.PipeManageService;
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
public class PipeManageServiceImpl implements PipeManageService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate mysqlJdbc;//mysql myuser

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate sqlserverJdbc;///sqlserver book

    @Autowired
    private PipeManageRepository pipeManageRepository;

    @Override
    public void update() {
        List<PipeManage> objectList = pipeManageRepository.findByIsUpdate(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                PipeManage temp = objectList.get(i);
                try{

                    //1.更新mysql

                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    pipeManageRepository.save(temp);

                }catch (Exception e){
                    logger.error("id="+objectList.get(i)+"的PipeManage数据更新错误！");
                    logger.error(e.toString());
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要更新了，再进入就说明有问题
        else logger.error("没有需要更新的PipeManage数据！");

    }

    @Override
    public void delete() {
        List<PipeManage> objectList = pipeManageRepository.findByIsDelete(Boolean.TRUE);
        if(objectList!=null&&objectList.size()>0){
            for (int i = 0; i < objectList.size(); i++) {
                try{

                    //1.更新mysql

                    //2.更新SQL server

                    //这里应该同时删除MySQL的数据吗？
                    pipeManageRepository.delete(objectList.get(i));
                }catch (Exception e){
                    logger.error("id="+objectList.get(i)+"的PipeManage数据删除错误！");
                    logger.error(e.toString());
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要删除了，再进入就说明有问题
        else logger.error("没有需要删除的PipeManage数据！");
    }
}
