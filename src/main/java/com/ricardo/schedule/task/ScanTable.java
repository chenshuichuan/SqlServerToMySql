package com.ricardo.schedule.task;

import com.ricardo.domain.mysqldata.jpa.ShipTableRepository;
import com.ricardo.domain.mysqldata.jpa.WorkersRepository;
import com.ricardo.domain.sqlserverdata.bean.UpdateTable;
import com.ricardo.domain.sqlserverdata.jpa.UpdateTableRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/4/4
 * Time: 12:33
 */
@Component
public class ScanTable {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private List<String> tableNameList;

    @Autowired
    private  UpdateTableRepository updateTableRepository;

    @Autowired
    private WorkersRepository workersRepository;
    @Autowired
    private ShipTableRepository shipTableRepository;

    public ScanTable() {
        this.tableNameList = new ArrayList<>();
        tableNameList.add("Pipe");
        tableNameList.add("PipeBatch");
        tableNameList.add("PipeComponent");
        tableNameList.add("PipeCutting");
        tableNameList.add("PipeManage");
        tableNameList.add("PipeMaterial");
        tableNameList.add("PipeStore");
        tableNameList.add("PipeUnit");
        tableNameList.add("ShipManage");
        tableNameList.add("WorkPipe");
    }

    /**
     *@Author: Ricardo
     *@Description: 上一个调用完成后再次调用，延时三分钟调用
     *@Date: 16:20 2018/4/6
     *@param:
     * fixedDelay:上一个调用完成后再次调用，延时三分钟调用
     **/
    @Scheduled(fixedDelay = 1000*3 )
    public void fixedDelay() throws Exception
    {
        logger.debug("------将要扫描中间数据库------");
        //Thread.sleep(2000);

        //表级别的扫描
        this.scanDelete();//扫描数据库是否需要删除表
        this.scanUpdate();//扫描数据库是否需要更新表

        logger.debug("------中间数据库扫描完成------");
    }

    /**
     *@Author: Ricardo
     *@Description: 对每个要更新的数据表进行更新操作
     *@Date: 16:20 2018/4/6
     *@param:
     **/
    private void scanUpdate(){
        List<UpdateTable> updateTableList = updateTableRepository.findByIsUpdate(Boolean.TRUE);
        if (updateTableList!=null&&updateTableList.size()>0){
            for (int i=0;i<updateTableList.size();i++){
                logger.debug("table:"+updateTableList.get(i).getTableName()+" isUpdate");
                String tableName= updateTableList.get(i).getTableName();
                switch (tableName){
                    case "Pipe":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "PipeBatch":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "PipeComponent":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "PipeCutting":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "PipeManage":{

                    }
                    case "PipeMaterial":{

                    }
                    case "PipeStore":{

                    }
                    case "PipeUnit":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "ShipManage":{
                        workersRepository.findAll();
                        shipTableRepository.findAll();
                        shipTableRepository.findOne(1);
                        updateTableRepository.findAll();
                    }
                    case "WorkPipe":{

                    }
                }
            }
        }
        else {
            logger.debug("没有数据表被设置要更新!");
        }
    }

    /**
     *@Author: Ricardo
     *@Description: 如果对应数据表要被删除，进行相应操作
     *@Date: 16:29 2018/4/6
     *@param:
     **/
    private void scanDelete(){
        List<UpdateTable> updateTableList = updateTableRepository.findByIsDelete(Boolean.TRUE);
        if (updateTableList!=null&&updateTableList.size()>0){
            for (int i=0;i<updateTableList.size();i++){
                logger.debug("table:"+updateTableList.get(i).getTableName()+" isDelete");

                String tableName= updateTableList.get(i).getTableName();
                switch (tableName){
                    case "Pipe":{

                    }
                    case "PipeBatch":{

                    }
                    case "PipeComponent":{

                    }
                    case "PipeCutting":{

                    }
                    case "PipeManage":{

                    }
                    case "PipeMaterial":{

                    }
                    case "PipeStore":{

                    }
                    case "PipeUnit":{

                    }
                    case "ShipManage":{

                    }
                    case "WorkPipe":{

                    }
                }
            }
        }
        else {
            logger.debug("没有数据表被设置要删除!");
        }
    }
}
