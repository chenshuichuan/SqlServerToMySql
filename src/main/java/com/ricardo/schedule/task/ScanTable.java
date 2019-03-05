package com.ricardo.schedule.task;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.sqlserverdata.bean.UpdateTable;
import com.ricardo.domain.sqlserverdata.jpa.UpdateTableRepository;
import com.ricardo.service.ShipManageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
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
    private ShipManageService shipManageService;

    public ScanTable() {
        this.tableNameList = new ArrayList<>();
        tableNameList.add(Constants.TB_sqlPipe);
        tableNameList.add(Constants.TB_sqlPipeBatch);
        tableNameList.add(Constants.TB_sqlPipeComponent);
        tableNameList.add(Constants.TB_sqlPipeManage);
        tableNameList.add(Constants.TB_sqlPipeMaterial);
        tableNameList.add(Constants.TB_sqlPipeCutting);
        tableNameList.add(Constants.TB_sqlPipeStore);
        tableNameList.add(Constants.TB_sqlPipeSurface);
        tableNameList.add(Constants.TB_sqlPipeUnit);
        tableNameList.add(Constants.TB_sqlShipManage);

        tableNameList.add(Constants.TB_sqlWorkPipe);
        tableNameList.add(Constants.TB_sqlShipTypeManage);
    }

    /**
     *@Author: Ricardo
     *@Description: 上一个调用完成后再次调用，延时三分钟调用
     *@Date: 16:20 2018/4/6
     *@param:
     * fixedDelay:上一个调用完成后再次调用，延时三分钟调用
     **/
    @Scheduled(fixedDelay = 60*1000*1 )
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
                UpdateTable updateTable =updateTableList.get(i);
                logger.debug("表格:"+updateTable.getTableName()+" isUpdate");
                String tableName= updateTableList.get(i).getTableName();
                switch (tableName){
                    case Constants.TB_sqlPipe:{

                        updateTableRepository.findAll();
                    }break;
                    case Constants.TB_sqlPipeBatch:{

                    }break;
                    case Constants.TB_sqlPipeComponent:{

                    }break;
                    case Constants.TB_sqlPipeCutting:{

                    }break;
                    case Constants.TB_sqlPipeManage:{

                    }break;
                    case Constants.TB_sqlPipeMaterial:{

                    }break;
                    case Constants.TB_sqlPipeStore:{

                    }break;
                    case Constants.TB_sqlPipeUnit:{


                    }break;
                    case Constants.TB_sqlWorkPipe:{

                    }break;
                    case Constants.TB_sqlShipManage:{
                        shipManageService.update();
                    }break;
                    case Constants.TB_sqlShipTypeManage:{
                        break;
                    }
                    default:{

                    }
                }//switch 结束
                updateTable.setUpdate(Boolean.FALSE);
                updateTableRepository.save(updateTable);
            }//for循环结束
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
                    case "SqlPipe":{

                    }break;
                    case "PipeBatch":{

                    }break;
                    case "PipeComponent":{

                    }break;
                    case "PipeCutting":{

                    }break;
                    case "PipeManage":{

                    }break;
                    case "PipeMaterial":{

                    }break;
                    case "PipeStore":{

                    }break;
                    case "PipeUnit":{

                    }break;
                    case "ShipManage":{

                    }break;
                    case "SqlWorkPipe":{

                    }break;
                    case "SqlShipTypeManage":{

                    }break;
                    default:{

                    }
                }
            }
        }
        else {
            logger.debug("没有数据表被设置要删除!");
        }
    }
}
