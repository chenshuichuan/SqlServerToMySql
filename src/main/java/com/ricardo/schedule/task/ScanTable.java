package com.ricardo.schedule.task;

import com.ricardo.domain.mysqldata.bean.Constants;
import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import com.ricardo.domain.mysqldata.pipe.batch.service.BatchRepository;
import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;
import com.ricardo.domain.mysqldata.pipe.ship.Ship;
import com.ricardo.domain.mysqldata.pipe.ship.service.ShipRepository;
import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import com.ricardo.domain.mysqldata.pipe.unit.service.UnitRepository;
import com.ricardo.domain.sqlserverdata.bean.UpdateTable;
import com.ricardo.domain.sqlserverdata.jpa.UpdateTableRepository;
import com.ricardo.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


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
    @Autowired
    private PipeBatchService pipeBatchService;
    @Autowired
    private PipeCuttingService pipeCuttingService;
    @Autowired
    private PipeUnitService pipeUnitService;
    @Autowired
    private PipeManageService pipeManageService;
    @Autowired
    private PipeMaterialService pipeMaterialService;
    @Autowired
    private PipeStoreService pipeStoreService;
    @Autowired
    private SqlWorkPipeService workPipeService;
    @Autowired
    private PipePipeService pipPipeService;
    @Autowired
    private ShipRepository shipRepository;
    @Autowired
    private BatchRepository batchRepository;
    @Autowired
    private UnitRepository unitRepository;

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
     *@Description: 对每个要更新的数据表进行更新操作，更新表的内容应该有个先后顺序？
     *              这个问题要和管业公司沟通好，更新时间间隔，或是要求红帆吧所有表更新完之后再写入 updateTable表，就不需要考虑顺序了
     *@Date: 16:20 2018/4/6
     *@param:
     **/
    private void scanUpdate(){
        List<UpdateTable> updateTableList = updateTableRepository.findByIsUpdate(Boolean.TRUE);

        //是否应该更新计算数量操作
        boolean shouldCalFlag = false;
        List<Pipe> pipeList = new ArrayList<>() ;
        List<Unit> unitList = new ArrayList<>() ;
        List<Batch> batchList = new ArrayList<>();
        List<Ship> shipList = new ArrayList<>();

        if (updateTableList!=null&&updateTableList.size()>0){

            for (int i=0;i<updateTableList.size();i++){
                UpdateTable updateTable =updateTableList.get(i);
                logger.debug("表格:"+updateTable.getTableName()+" isUpdate");
                String tableName= updateTableList.get(i).getTableName();
                switch (tableName){
                    case Constants.TB_sqlPipe:{
                        //updateTableRepository.findAll();
                        pipPipeService.update();
                    }break;
                    case Constants.TB_sqlPipeBatch:{
                        batchList =  pipeBatchService.update();
                    }break;
                    case Constants.TB_sqlPipeComponent:{

                    }break;
                    case Constants.TB_sqlPipeCutting:{
                        pipeList = pipeCuttingService.update();
                    }break;
                    case Constants.TB_sqlPipeManage:{
                        pipeManageService.update();
                    }break;
                    case Constants.TB_sqlPipeMaterial:{
                        pipeMaterialService.update();
                    }break;
                    case Constants.TB_sqlPipeStore:{
                        pipeStoreService.update();
                    }break;
                    case Constants.TB_sqlPipeUnit:{
                        unitList = pipeUnitService.update();

                    }break;
                    case Constants.TB_sqlWorkPipe:{
                        workPipeService.update();
                    }break;
                    case Constants.TB_sqlShipManage:{
                        shipList = shipManageService.update();
                    }break;
                    case Constants.TB_sqlShipTypeManage:{

                    }break;
                    default:{

                    }
                }//switch 结束
                updateTable.setUpdate(Boolean.FALSE);
                updateTableRepository.save(updateTable);
            }//for循环结束

            //更新ship/batch/unit的统计数据
            updateCalNumber(shipList,batchList,unitList, pipeList);
        }
        else {
            logger.debug("没有数据表被设置要更新!");
        }
    }

    /**
     * 计算各级包含下级数量*/
    private void updateCalNumber(List<Ship>shipList, List<Batch> batchList, List<Unit> unitList,List<Pipe> pipeList){

        //根据更新的pipe去更新unit
        if(null !=unitList){
            Set<Integer> unitSet = new TreeSet<>();
            for (Pipe pipe: pipeList){
                unitSet.add(pipe.getUnitId());
            }
            //根据更新的pipe去更新unit
            for (Integer integer: unitSet){
                Unit unit = unitRepository.findOne(integer);
                pipeUnitService.calPipeNumberOfUnit(unit);
            }
        }

        //计算单元包含管件数量
        if(null !=unitList){
            Set<Integer> batchSet = new TreeSet<>();
            for (Unit unit: unitList){
                pipeUnitService.calPipeNumberOfUnit(unit);
                batchSet.add(unit.getBatchId());
            }
            //根据涉及的batch去更新
            for (Integer integer: batchSet){
                Batch batch = batchRepository.findOne(integer);
                pipeBatchService.calUnitNumberOfBatch(batch);
            }
        }
        //计算批次包含单元数量
        if(null !=batchList){
            Set<String> shipSet = new TreeSet<>();
            for (Batch batch: batchList){
                pipeBatchService.calUnitNumberOfBatch(batch);
                shipSet.add(batch.getShipCode());
            }
            //根据涉及的ship去更新
            for (String shipcode: shipSet){
                Ship ship = shipRepository.findByShipCode(shipcode);
                shipManageService.calBatchNumberOfShip(ship);
            }
        }
        //计算船舶包含批次数量
        if(null !=shipList){
            for (Ship ship: shipList){
                shipManageService.calBatchNumberOfShip(ship);
            }
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
