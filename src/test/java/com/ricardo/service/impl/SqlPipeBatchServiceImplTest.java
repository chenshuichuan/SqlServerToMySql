package com.ricardo.service.impl;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeBatch;
import com.ricardo.domain.sqlserverdata.jpa.SqlPipeBatchRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.lang.Boolean.TRUE;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/4/7
 * Time: 15:11
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlPipeBatchServiceImplTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    SqlPipeBatchRepository pipeBatchRepository;

    @Test
    @Transactional
    public void update() throws Exception {
        SqlPipeBatch pipeBatch =new SqlPipeBatch(1,1,TRUE,TRUE,
                123,"加工批次","description");
        pipeBatchRepository.save(pipeBatch);
        Assert.assertThat(pipeBatchRepository.findOne(1).getDescription(),is("description"));

        List<SqlPipeBatch>pipeBatchList = pipeBatchRepository.findByIsUpdate(TRUE);
        if (pipeBatchList==null)
           logger.debug("pipeBatchList is null!");
        Assert.assertThat(pipeBatchList.size(),is(0));
    }

    @Test
    public void delete() throws Exception {

    }

}