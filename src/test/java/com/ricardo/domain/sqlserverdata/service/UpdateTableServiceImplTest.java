package com.ricardo.domain.sqlserverdata.service;

import com.ricardo.domain.mysqldata.pipe.ship.Ship;
import com.ricardo.domain.mysqldata.pipe.ship.service.ShipRepository;
import com.ricardo.domain.sqlserverdata.bean.*;
import com.ricardo.domain.sqlserverdata.jpa.*;
import com.ricardo.service.ShipManageService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/4/6
 * Time: 16:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateTableServiceImplTest {
    @Autowired
    private SqlPipeRepository pipeRepository;
    @Autowired
    private SqlPipeBatchRepository pipeBatchRepository;
    @Autowired
    private SqlPipeComponentRepository pipeComponentRepository;
    @Autowired
    private SqlPipeCuttingRepository pipeCuttingRepository;
    @Autowired
    private SqlPipeManageRepository pipeManageRepository;
    @Autowired
    private SqlPipeMaterialRepository pipeMaterialRepository;
    @Autowired
    private SqlPipeStoreRepository pipeStoreRepository;
    @Autowired
    private SqlPipeUnitRepository pipeUnitRepository;
    @Autowired
    private SqlShipManageRepository shipManageRepository;
    @Autowired
    private UpdateTableRepository updateTableRepository;
    @Autowired
    private SqlWorkPipeRepository workPipeRepository;

    @Autowired
    private ShipRepository shipRepository;
    @Autowired
    private ShipManageService shipManageService;

//    @Test
//    public void addUser() throws Exception {
//        Myuser myuser=new Myuser(10,"test","969396");
//        Assert.assertThat("",is("嘟嘟MD独立博客"));
//    }

    /*
    * 测试Pipe实体
    * */
    @Test
    @Transactional
    public void pipe_add() throws Exception {
        String test="test";
        SqlPipe pipe=new SqlPipe(1,1, TRUE,TRUE,
                "pipe","test","test","test",
                "ji pei guan hao");
        pipeRepository.save(pipe);
        Assert.assertThat(pipeRepository.findOne(1).getDesignAreaCode(),is("pipe"));
    }
    @Test
    @Transactional
    public void pipe_findUpdate() throws Exception {
        String test="test";
        SqlPipe pipe=new SqlPipe(1,1, TRUE,TRUE,
                "pipe","test","test","test",
                "ji pei guan hao");
        pipeRepository.save(pipe);
        Assert.assertThat(pipeRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }


    /*
    * 测试pipeBatch实体
    * */
    @Test
    @Transactional
    public void pipeBatch_add() throws Exception {
        String test="test";
        SqlPipeBatch pipeBatch =new SqlPipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getDescription(),is("description"));
    }
    @Test
    @Transactional
    public void pipeBatch_findUpdate() throws Exception {
        String test="test";
        SqlPipeBatch pipeBatch =new SqlPipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }






    /*
   * 测试pipeCutting实体
   * */
    @Test
    @Transactional
    public void pipeCutting_add() throws Exception {
        String test="test";
        SqlPipeCutting pipeCutting=new SqlPipeCutting(1,1, TRUE,TRUE,
                1,"test",11,111,
                "hhh","hhh",
                1,"ddd","ddd");
        pipeCuttingRepository.save(pipeCutting);
        Assert.assertThat(pipeCuttingRepository.findOne(1).getMachiningBatch(),is(test));
    }
    @Test
    @Transactional
    public void pipeCutting_findUpdate() throws Exception {
        String test="test";
        SqlPipeCutting pipeCutting=new SqlPipeCutting(1,1, TRUE,TRUE,
                1,"test",11,111,
                "hhh","hhh",
                1,"ddd","ddd");
        pipeCuttingRepository.save(pipeCutting);
        Assert.assertThat(pipeCuttingRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
    * 测试pipeMaterial实体
    * */
    @Test
    @Transactional
    public void pipeMaterial_add() throws Exception {
        String test="test";
        SqlPipeMaterial pipeMaterial=new SqlPipeMaterial(1,1, TRUE,TRUE,
                1,1,"test",1,111,11.11,
                '1');
        pipeMaterialRepository.save(pipeMaterial);
        Assert.assertThat(pipeMaterialRepository.findOne(1).getPipeEndFlag(),is("test"));
    }
    @Test
    @Transactional
    public void pipeMaterial_findUpdate() throws Exception {
        String test="test";
        SqlPipeMaterial pipeMaterial=new SqlPipeMaterial(1,1, TRUE,TRUE,
                1,1,"test",1,111,11.11,
                '1');
        pipeMaterialRepository.save(pipeMaterial);
        Assert.assertThat(pipeMaterialRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
    * 测试PipeStore实体
    * */
    @Test
    @Transactional
    public void pipeStore_add() throws Exception {
        String test="test";
        Date date = new Date(System.currentTimeMillis());
        SqlPipeStore pipeStore=new SqlPipeStore(1,1, TRUE,TRUE,
                1,1,1,
                "test",date,date,date);
        pipeStoreRepository.save(pipeStore);
        Assert.assertThat(pipeStoreRepository.findOne(1).getStorePlace(),is("test"));
    }
    @Test
    @Transactional
    public void pipeStore_findUpdate() throws Exception {
        String test="test";
        Date date = new Date(System.currentTimeMillis());
        SqlPipeStore pipeStore=new SqlPipeStore(1,1, TRUE,TRUE,
                1,1,1,
                "test",date,date,date);
        pipeStoreRepository.save(pipeStore);
        Assert.assertThat(pipeStoreRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
    * 测试PipeUnit实体
    * */
    @Test
    @Transactional
    public void pipeUnit_add() throws Exception {
        String test="test";
        SqlPipeUnit pipeUnit=new SqlPipeUnit(1,1, TRUE,TRUE,
                1,1,"test","description");
        pipeUnitRepository.save(pipeUnit);
        Assert.assertThat(pipeUnitRepository.findOne(1).getProcessUnit(),is("test"));
    }
    @Test
    @Transactional
    public void pipeUnit_findUpdate() throws Exception {
        String test="test";
        SqlPipeUnit pipeUnit=new SqlPipeUnit(1,1, TRUE,TRUE,
                1,1,"test","description");
        pipeUnitRepository.save(pipeUnit);
        Assert.assertThat(pipeUnitRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }




    /*
    * 测试updateTable实体
    * */
    @Test
    public void updateTable_add() throws Exception {
        String test="test";
        UpdateTable updateTable = new UpdateTable(11,"test",TRUE,TRUE);
        updateTableRepository.save(updateTable);
        Assert.assertThat(updateTableRepository.findOne(11).getTableName(),is("test"));
    }
    @Test
    @Transactional
    public void updateTable_findUpdate() throws Exception {
        String test="test";
        UpdateTable updateTable = new UpdateTable(11,"test",TRUE,TRUE);
        updateTableRepository.save(updateTable);
        Assert.assertThat(updateTableRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
    * 测试WorkPipe实体
    * */
    @Test
    @Transactional
    public void workPipe_add() throws Exception {
        String test="test";
        SqlWorkPipe workPipe=new SqlWorkPipe(1,1, TRUE,TRUE,
                1,1,11.11,11.11,11.11,
                "test","test2","test3","test4",
                22.22,"ttt","yy");
        workPipeRepository.save(workPipe);
        Assert.assertThat(workPipeRepository.findOne(1).getPipeMaterial(),is("test"));
    }
    @Test
    @Transactional
    public void workPipe_findUpdate() throws Exception {
        String test="test";
        SqlWorkPipe workPipe=new SqlWorkPipe(1,1, TRUE,TRUE,
                1,1,11.11,11.11,11.11,
                "test","test2","test3","test4",
                22.22,"ttt","y");
        workPipeRepository.save(workPipe);
        Assert.assertThat(workPipeRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }

    @Test
    @Transactional
    public void testSet() throws Exception {
        Set<Integer> batchSet = new TreeSet<>();
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(2);
        integerList.add(1);
        for (Integer unit: integerList){

            batchSet.add(unit);
        }
        Assert.assertThat(batchSet.size(),greaterThan(0));
        Assert.assertThat(batchSet.size(),equalTo(4));
    }

    @Test
    public void updateCal() throws Exception {
        Ship ship = shipRepository.findOne(10);
        //shipManageService.calPipeNumberOfUnitsByShip(ship);
        //shipManageService.calUnitNumberOfBatchsByShip(ship);
        shipManageService.calBatchNumberOfShip(ship);

    }

}