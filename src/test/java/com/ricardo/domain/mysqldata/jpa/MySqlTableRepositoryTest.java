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
public class MySqlTableRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ArrangementTableRepository arrangementTableRepository;
    @Autowired
    private AttachmentHubBodyRepository attachmentHubBodyRepository;
    @Autowired
    private AttachmentHubHeaderRepository attachmentHubHeaderRepository;
    @Autowired
    private BatchProcessingRepository batchProcessingRepository;

    @Autowired
    private BatchTableRepository batchTableRepository;
    @Autowired
    private ConnectorRepository connectorRepository;

    @Autowired
    private DepartmentsRepository departmentsRepository;
    @Autowired
    private ElbowTableRepository elbowTableRepository;

    @Autowired
    private FactoryDistributionRepository factoryDistributionRepository;

    @Autowired
    private LoadsRepository loadsRepository;

    @Autowired
    private MachiningListRepository machiningListRepository;

    @Test
    @Transactional
    public void arrangementTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        ArrangementTable arrangementTable=new ArrangementTable(1234,1234,
                1234,2345,1,2345,1,
                date,1234);

        arrangementTableRepository.save(arrangementTable);
        Assert.assertThat(arrangementTableRepository.findOne(1234).getRole(),
                is(1234));
    }

    @Test
    @Transactional
    public void attachmentHubBody() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        AttachmentHubBody attachmentHubBody = new AttachmentHubBody(1234,1234,"hubnum",
                "resourcenum","name","sp","imagenum","piece",
                "materail",1234,1234,date,1244,
                "remarks",date,"extend",1);
        attachmentHubBodyRepository.save(attachmentHubBody);
        Assert.assertThat(attachmentHubBodyRepository.findOne(1234).getExtend(),is("extend"));
    }

    @Test
    @Transactional
    public void attachmentHubHeader() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        AttachmentHubHeader attachmentHubHeader = new AttachmentHubHeader(1234,1234,"shipname",
                "batch","hubnum",1234,"warehouse","wa mana",
                "contact","palce","receive","recieve depart",date,date,
                1,"extend");
        attachmentHubHeaderRepository.save(attachmentHubHeader);
        Assert.assertThat(attachmentHubHeaderRepository.findOne(1234).getExtend(),is("extend"));
    }

    @Test
    @Transactional
    public void batchProcessing() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        BatchProcessing batchProcessing =new BatchProcessing(1234,"shipcode","batch name",1234,123,
                124,122,233,date,TRUE,1,date,"extend");
        batchProcessingRepository.save(batchProcessing);

        Assert.assertThat(batchProcessingRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void batchTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        BatchTable batchTable =new BatchTable(1234,"batch name","batch des",
                "shipcode","extend");
        batchTableRepository.save(batchTable);
        Assert.assertThat(batchTableRepository.findOne(1234).getExtend(),
                is("extend"));
    }

    @Test
    @Transactional
    public void connector() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        Connector connector = new Connector(1234,"pipeid");
        connectorRepository.save(connector);
        Assert.assertThat(connectorRepository.findOne(1234).getPipeId(),
                is("pipeid"));
    }

    @Test
    @Transactional
    public void departments() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        Departments departments =new Departments(1234,"dname",1234,
                234,"description",date,1234);
        departmentsRepository.save(departments);
        Assert.assertThat(departmentsRepository.findOne(1234).getDname(),
                is("dname"));
    }

    @Test
    @Transactional
    public void elbowTable() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        Float f=11f;
        ElbowTable elbowTable =new ElbowTable(1234,"pipe","pipenum",12,f,
                333,4,555,666, 777,
                88,99,10,11,12);
        elbowTableRepository.save(elbowTable);
        Assert.assertThat(elbowTableRepository.findOne(1234).getPipe(),
                is("pipe"));
    }

    @Test
    @Transactional
    public void factoryDistribution() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        FactoryDistribution factoryDistribution =new FactoryDistribution(1234,222,"shipname",
                "shipcode",333,"batch","need wrok","comp id","comp name",
                "specifi","imagenum","material","piece",
                "supplier",date,date,date,"delivery",
                444,555,date,"remarks",66,date,"extend",
                date,123);
        factoryDistributionRepository.save(factoryDistribution);
        Assert.assertThat(factoryDistributionRepository.findOne(1234).getExtend(),
                is("extend"));
    }


    @Test
    @Transactional
    public void loads() throws Exception {
        Date date = new Date(System.currentTimeMillis());
       Loads loads = new Loads(1234,222,333,444,555);
        loadsRepository.save(loads);
        Assert.assertThat(loadsRepository.findOne(1234).getYearLoad(),
                is(555));
    }


    @Test
    @Transactional
    public void machiningList() throws Exception {
        Date date = new Date(System.currentTimeMillis());
        MachiningList machiningList =new MachiningList(1234,"batch name",222,"unit",
                333,"pipematerial",1,444,"pipeId","shape",
                "surface treat","surface name",555,466,TRUE,1,date,
                "extend");
        machiningListRepository.save(machiningList);
        Assert.assertThat(machiningListRepository.findOne(1234).getExtend(),
                is("extend"));
    }


}