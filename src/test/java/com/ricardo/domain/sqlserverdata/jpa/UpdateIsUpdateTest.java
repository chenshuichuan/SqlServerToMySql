package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeBatch;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by:Ricardo
 * Description: 测试更新isUpdate字段是否成功
 * Date: 2018/4/7
 * Time: 10:57
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateIsUpdateTest {
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


    @Test
    @Transactional
    public void pipeBatch_setIsUpdateById(){
        PipeBatch pipeBatch =new PipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getMidId(),is(1));
        pipeBatchRepository.setIsUpdateById(FALSE,1);
//        pipeBatch.setUpdate(FALSE);
//        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getUpdate(),is(FALSE));
    }




}