package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;
import com.ricardo.domain.mysqldata.pipe.workPipe.service.WorkPipeRepository;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeBatch;
import com.ricardo.domain.sqlserverdata.bean.SqlWorkPipe;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

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
    private SqlWorkPipeRepository sqlWorkPipeRepository;
    @Autowired
    private WorkPipeRepository workPipeRepository;

    @Test
    @Transactional
    public void pipeBatch_setIsUpdateById(){
        SqlPipeBatch pipeBatch =new SqlPipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getMidId(),is(1));
        pipeBatchRepository.setIsUpdateById(FALSE,1);
//        pipeBatch.setUpdate(FALSE);
//        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getUpdate(),is(FALSE));
    }
    @Test
    public void workPipeRepository() {
        List<SqlWorkPipe> pipeList = sqlWorkPipeRepository.findAll();
        Assert.assertThat(pipeList,notNullValue());
        //Assert.assertThat(pipeList.size(),greaterThan(0));
        System.out.println("find size = "+pipeList.size());
    }

    @Test
    public void findOne() {
        SqlWorkPipe sqlWorkPipe = sqlWorkPipeRepository.findOne(6767);
        Assert.assertThat(sqlWorkPipe,notNullValue());

        System.out.println("find  = "+sqlWorkPipe);

        WorkPipe workPipe = new WorkPipe(sqlWorkPipe);
        workPipe = workPipeRepository.save(workPipe);
        Assert.assertThat(workPipe,notNullValue());
        System.out.println(workPipe);

    }

}