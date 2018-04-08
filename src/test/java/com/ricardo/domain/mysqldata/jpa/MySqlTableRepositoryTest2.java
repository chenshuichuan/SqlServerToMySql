package com.ricardo.domain.mysqldata.jpa;

import com.ricardo.domain.mysqldata.bean.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by:Ricardo
 * Description: 测试MySQL数据库的实体及jpa 接口
 * Date: 2018/4/7
 * Time: 19:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MySqlTableRepositoryTest2 {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PipeProcessingRepository pipeProcessingRepository;

    @Autowired
    private PipeTableRepository pipeTableRepository;

    @Autowired
    private PlanTableRepository planTableRepository;
    @Autowired
    private ProcessOrderRepository processOrderRepository;
    @Autowired
    private ReworkTableRepository reworkTableRepository;
    @Autowired
    private ShipProcessingRepository shipProcessingRepository;
    @Autowired
    private ShipTableRepository shipTableRepository;
    @Autowired
    private UnitComponentsRepository unitComponentsRepository;
    @Autowired
    private UnitProcessingRepository unitProcessingRepository;
    @Autowired
    private UnitTableRepository unitTableRepository;
    @Autowired
    private WarehousingListRepository warehousingListRepository;
    @Autowired
    private WorkersRepository workersRepository;
    @Autowired
    private WorkerTaskRepository workerTaskRepository;
    @Autowired
    private YearsPlanRepository yearsPlanRepository;


    @Test
    @Transactional
    public void pipeProcessing() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        PipeProcessing pipeProcessing = new PipeProcessing(1234,"shipcode","batchname",
                1,"unitname","pipenum",1,1,
                1,1,1,1,2,
                date,date,date,date,
                1,date,"extend");
        pipeProcessingRepository.save(pipeProcessing);
        Assert.assertThat(pipeProcessingRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void pipeTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        PipeTable pipeTable = new PipeTable(1234,"shipcode","batchname","unitname",
                "pipename","extend");
        pipeTableRepository.save(pipeTable);
        Assert.assertThat(pipeTableRepository.findOne(1234).getExtend(),is("extend"));
    }

    @Test
    @Transactional
    public void planTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        PlanTable planTable =new PlanTable(1234,1234,"planname",222,
                "shipname",
                "batch","batchDes","stacks","section","process",
                123,222,date,date,date,date,date,
                "remark", date,1,"extend",date,1,1,1,1,
                2,2,"cutremark");
        planTableRepository.save(planTable);
        Assert.assertThat(planTableRepository.findOne(1234).getExtend(),is("extend"));
    }

    @Test
    @Transactional
    public void processOrder() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        ProcessOrder processOrder = new ProcessOrder(1234,"name","list");
        processOrderRepository.save(processOrder);
        Assert.assertThat(processOrderRepository.findOne(1234).getName(),
                is("name"));
    }

    @Test
    @Transactional
    public void reworkTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        ReworkTable reworkTable = new ReworkTable(1234,1,"name","shipcode",
                "batchname","pipe id","workplace",
                1,1,date,"extend","reason");
        reworkTableRepository.save(reworkTable);
        Assert.assertThat(reworkTableRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void shipProcessing() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        ShipProcessing shipProcessing = new ShipProcessing(1234,"shipname","shipcode",
                111,"not begin","begined","finish",1,
                date,"extend");
        shipProcessingRepository.save(shipProcessing);
        Assert.assertThat(shipProcessingRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void shipTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        ShipTable shipTable = new ShipTable(1234,"shipname","shipcode","extend");
        shipTableRepository.save(shipTable);
        Assert.assertThat(shipTableRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void unitComponents() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        UnitComponents unitComponents = new UnitComponents(1234,"shipcode","batchname","unitname",
                "material","ssnum","material","piece",
                111,11f,"source","extend");
        unitComponentsRepository.save(unitComponents);
        Assert.assertThat(unitComponentsRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void unitProcessing() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        UnitProcessing unitProcessing = new UnitProcessing(1234,1,"shipcode","shipname",
                "batch",1,"unit",1,"pipeship",
                122,1,1,date,23,
                date,date,1,date,date,
                1,date,date,1,date,
                1,date,"extend");
        unitProcessingRepository.save(unitProcessing);
        Assert.assertThat(unitProcessingRepository.findOne(1234).getExtend(),
                is("extend"));
    }


    @Test
    @Transactional
    public void unitTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        UnitTable unitTable = new UnitTable(1234,"unitname","shipcode",
                "batch","extend");
        unitTableRepository.save(unitTable);
        Assert.assertThat(unitTableRepository.findOne(1234).getExtend(),
                is("extend"));
    }


    @Test
    @Transactional
    public void warehousingList() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        WarehousingList warehousingList = new WarehousingList(1234,"batch",
                "unit","tray","pipeid","typesp",
                111,"shape","outmarker","surface",
                "finish","work",date,date,date,date,
                1,date,"extend");
        warehousingListRepository.save(warehousingList);
        Assert.assertThat(warehousingListRepository.findOne(1234).getExtend(),
                is("extend"));
    }


    @Test
    @Transactional
    public void workerTask() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        WorkerTask workerTask = new WorkerTask(1234,1,"name","cut",
                "bend","proof","weld",1,date,"extend");
        workerTaskRepository.save(workerTask);
        Assert.assertThat(workerTaskRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void workers() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        Workers workers = new Workers(1234,"name",123,"passwd","job",
                111f,1,111,"department",date,"extend");
        workersRepository.save(workers);
        Assert.assertThat(workersRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void yearsPlan() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        YearsPlan yearsPlan = new YearsPlan(1234,date,11,1,"plandes");
        yearsPlanRepository.save(yearsPlan);
        Assert.assertThat(yearsPlanRepository.findOne(1234).getPlanDes(),
                is("plandes"));
    }



}