package com.ricardo.domain.mysqldata.pipe.pipPipe.service;

import com.ricardo.domain.mysqldata.pipe.pipPipe.domain.PipPipe;
import com.ricardo.domain.mysqldata.pipe.pipStore.PipStore;
import com.ricardo.domain.mysqldata.pipe.pipStore.service.PipStoreRepository;
import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;
import com.ricardo.domain.mysqldata.pipe.pipe.service.PipeRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.core.IsNull.notNullValue;
import static org.hamcrest.number.OrderingComparison.greaterThan;
import static org.junit.Assert.*;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2019/3/7
 * Time: 11:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PipPipeRepositoryTest {
    @Autowired
    private PipPipeRepository pipeRepository;
    @Test
    public void findBySuffix() {
        List<PipPipe> pipeList = pipeRepository.findAll();
        Assert.assertThat(pipeList,notNullValue());
        Assert.assertThat(pipeList.size(),greaterThan(0));
        System.out.println("find size = "+pipeList.size());
    }

    @Autowired
    private PipStoreRepository pipStoreRepository;
    @Test
    public void pipeStore() {
        List<PipStore> pipeList = pipStoreRepository.findAll();
        Assert.assertThat(pipeList,notNullValue());
        Assert.assertThat(pipeList.size(),greaterThan(0));
        System.out.println("find size = "+pipeList.size());
    }

    @Autowired
    private PipeRepository myPipeRepository;
    @Test
    public void countPipe() {
        int count = myPipeRepository.countByBatchIdAndUnitId(5,5);
        Assert.assertThat(count,greaterThan(0));

        System.out.println("find size = "+count);
    }

}
