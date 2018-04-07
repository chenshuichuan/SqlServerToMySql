package com.ricardo.service.impl;

import com.ricardo.domain.sqlserverdata.bean.WorkPipe;
import com.ricardo.domain.sqlserverdata.jpa.WorkPipeRepository;
import com.ricardo.service.PipeService;
import com.ricardo.service.WorkPipeService;
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
public class WorkPipeServiceImpl implements WorkPipeService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate mysqlJdbc;//mysql myuser

    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate sqlserverJdbc;///sqlserver book

    @Autowired
    private WorkPipeRepository workPipeRepository;

    @Override
    public void update() {
        List<WorkPipe> workPipeList = workPipeRepository.findByIsUpdate(Boolean.TRUE);
        if(workPipeList!=null&&workPipeList.size()>0){
            for (int i = 0; i < workPipeList.size(); i++) {
                WorkPipe temp = workPipeList.get(i);
                try{

                    //1.更新mysql

                    //2.更新SQL server
                    temp.setUpdate(Boolean.FALSE);
                    workPipeRepository.save(temp);

                }catch (Exception e){
                    logger.error("id="+workPipeList.get(i)+"的workpipe数据更新错误！");
                    logger.error(e.toString());
                }
            }
        }
        //按理说不应该进入这行，因为scanTable已经过滤是否需要更新了，再进入就说明有问题
        else logger.error("没有需要更新的WorkPipe数据！");

    }

    @Override
    public void delete() {
      List<WorkPipe> workPipeList = workPipeRepository.findByIsDelete(Boolean.TRUE);
      if(workPipeList!=null&&workPipeList.size()>0){
          for (int i = 0; i < workPipeList.size(); i++) {
              try{

                  //1.更新mysql

                  //2.更新SQL server

                  //这里应该同时删除MySQL的数据吗？
                  workPipeRepository.delete(workPipeList.get(i));
              }catch (Exception e){
                  logger.error("id="+workPipeList.get(i)+"的workpipe数据删除错误！");
                  logger.error(e.toString());
              }
          }
      }
      //按理说不应该进入这行，因为scanTable已经过滤是否需要删除了，再进入就说明有问题
      else logger.error("没有需要删除的WorkPipe数据！");
    }

    /**
     *@Author: Ricardo
     *@Description: 根据id列表，设置更新状态：
     *              如已经成功更新到MySQL数据库，则设置其更新状态为false，否则设置为true
     *@Date: 10:13 2018/4/7
     *@param: idList： workPipe对象的主键id
     *        flag：更新状态标记
     **/
    public void setIsUpdate(List<Integer>idList,Boolean flag){
        for (int i = 0; i < idList.size(); i++) {
            try{
                //workPipeRepository.delete(idList.get(i));
            }catch (Exception e){

                logger.error(e.toString());
            }

        }
    }



}
