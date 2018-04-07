package com.ricardo.domain.sqlserverdata.service;

import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.sqlserverdata.bean.*;
import com.ricardo.domain.sqlserverdata.jpa.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

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
    private PipeRepository pipeRepository;
    @Autowired
    private PipeBatchRepository pipeBatchRepository;
    @Autowired
    private PipeComponentRepository pipeComponentRepository;
    @Autowired
    private PipeCuttingRepository pipeCuttingRepository;
    @Autowired
    private PipeManageRepository pipeManageRepository;
    @Autowired
    private PipeMaterialRepository pipeMaterialRepository;
    @Autowired
    private PipeStoreRepository pipeStoreRepository;
    @Autowired
    private PipeUnitRepository pipeUnitRepository;
    @Autowired
    private ShipManageRepository shipManageRepository;
    @Autowired
    private UpdateTableRepository updateTableRepository;
    @Autowired
    private WorkPipeRepository workPipeRepository;


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
        Pipe pipe=new Pipe(1,1, TRUE,TRUE,
                "pipe","test","test","test",
                "ji pei guan hao");
        pipeRepository.save(pipe);
        Assert.assertThat(pipeRepository.findOne(1).getDesignAreaCode(),is("pipe"));
    }
    @Test
    @Transactional
    public void pipe_findUpdate() throws Exception {
        String test="test";
        Pipe pipe=new Pipe(1,1, TRUE,TRUE,
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
        PipeBatch pipeBatch =new PipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getDescription(),is("description"));
    }
    @Test
    @Transactional
    public void pipeBatch_findUpdate() throws Exception {
        String test="test";
        PipeBatch pipeBatch =new PipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }




    /*
    * 测试pipeComponent实体
    * */
    @Test
    @Transactional
    public void pipeComponent_add() throws Exception {
        String test="test";
        PipeComponent pipeComponent =new PipeComponent(1,"bujianid",
                "pipe","test","test","材质");
        pipeComponentRepository.save(pipeComponent);
        Assert.assertThat(pipeComponentRepository.findOne(1).getProcessingBatch(),is("bujianid"));
    }
    @Test
    @Transactional
    public void pipeComponent_findUpdate() throws Exception {
        String test="test";
        PipeComponent pipeComponent =new PipeComponent(1,"bujianid",
                "pipe","test","test","材质");
        pipeComponentRepository.save(pipeComponent);
        Assert.assertThat(pipeRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
   * 测试pipeCutting实体
   * */
    @Test
    @Transactional
    public void pipeCutting_add() throws Exception {
        String test="test";
        PipeCutting pipeCutting=new PipeCutting(1,1, TRUE,TRUE,
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
        PipeCutting pipeCutting=new PipeCutting(1,1, TRUE,TRUE,
                1,"test",11,111,
                "hhh","hhh",
                1,"ddd","ddd");
        pipeCuttingRepository.save(pipeCutting);
        Assert.assertThat(pipeCuttingRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }

    /*
    * 测试pipeManage实体
    * */
    @Test
    @Transactional
    public void pipeManage_add() throws Exception {
        String test="test";
        PipeManage pipeManage=new PipeManage(1,1, TRUE,TRUE,
                1,1,1,"test");
        pipeManageRepository.save(pipeManage);
        Assert.assertThat(pipeManageRepository.findOne(1).getDispatchList(),is(test));
    }
    @Test
    @Transactional
    public void pipeManage_findUpdate() throws Exception {
        String test="test";
        PipeManage pipeManage=new PipeManage(1,1, TRUE,TRUE,
                1,1,1,"test");
        pipeManageRepository.save(pipeManage);
        Assert.assertThat(pipeManageRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }


    /*
    * 测试pipeMaterial实体
    * */
    @Test
    @Transactional
    public void pipeMaterial_add() throws Exception {
        String test="test";
        PipeMaterial pipeMaterial=new PipeMaterial(1,1, TRUE,TRUE,
                1,1,"test",1,111,11.11,
                '1');
        pipeMaterialRepository.save(pipeMaterial);
        Assert.assertThat(pipeMaterialRepository.findOne(1).getPipeEndFlag(),is("test"));
    }
    @Test
    @Transactional
    public void pipeMaterial_findUpdate() throws Exception {
        String test="test";
        PipeMaterial pipeMaterial=new PipeMaterial(1,1, TRUE,TRUE,
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
        PipeStore pipeStore=new PipeStore(1,1, TRUE,TRUE,
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
        PipeStore pipeStore=new PipeStore(1,1, TRUE,TRUE,
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
        PipeUnit pipeUnit=new PipeUnit(1,1, TRUE,TRUE,
                1,1,"test","description");
        pipeUnitRepository.save(pipeUnit);
        Assert.assertThat(pipeUnitRepository.findOne(1).getProcessUnit(),is("test"));
    }
    @Test
    @Transactional
    public void pipeUnit_findUpdate() throws Exception {
        String test="test";
        PipeUnit pipeUnit=new PipeUnit(1,1, TRUE,TRUE,
                1,1,"test","description");
        pipeUnitRepository.save(pipeUnit);
        Assert.assertThat(pipeUnitRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }



    /*
    * 测试shipManage实体
    * */
    @Test
    @Transactional
    public void shipManage_add() throws Exception {
        String test="test";
        ShipManage shipManage =new ShipManage(1,1,TRUE,TRUE,
                "test","callship");
        shipManageRepository.save(shipManage);
        Assert.assertThat(shipManageRepository.findOne(1).getShapeShipCode(),is("test"));
    }
    @Test
    @Transactional
    public void shipManage_findUpdate() throws Exception {
        String test="test";
        ShipManage shipManage =new ShipManage(1,1,TRUE,TRUE,
                "test","callship");
        shipManageRepository.save(shipManage);
        Assert.assertThat(shipManageRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
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
        WorkPipe workPipe=new WorkPipe(1,1, TRUE,TRUE,
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
        WorkPipe workPipe=new WorkPipe(1,1, TRUE,TRUE,
                1,1,11.11,11.11,11.11,
                "test","test2","test3","test4",
                22.22,"ttt","y");
        workPipeRepository.save(workPipe);
        Assert.assertThat(workPipeRepository.findByIsUpdate(TRUE).size(),greaterThan(0));
    }


}