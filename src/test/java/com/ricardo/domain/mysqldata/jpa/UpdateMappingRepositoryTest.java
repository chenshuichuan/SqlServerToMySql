package com.ricardo.domain.mysqldata.jpa;

import com.ricardo.domain.mysqldata.bean.UpdateMapping;
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
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/4/18
 * Time: 11:24
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UpdateMappingRepositoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UpdateMappingRepository updateMappingRepository;

    @Test
    @Transactional
    public void updateMappingTestSave() throws Exception {
        Date date = new Date(System.currentTimeMillis());

        UpdateMapping updateMapping= new UpdateMapping(3,2,2,
                "pipe",2,date);

        updateMappingRepository.save(updateMapping);
        Assert.assertThat(updateMappingRepository.findOne(3).getTablename(),
                is("pipe"));
    }

    @Test
    @Transactional
    public void updateMappingTestFindByOID()throws Exception {
        Date date = new Date(System.currentTimeMillis());

        UpdateMapping updateMapping= new UpdateMapping(2,2,2,
                "pipe",2,date);

        updateMappingRepository.save(updateMapping);
        Assert.assertThat(updateMappingRepository.findByOId(2).getTablename(),
                is("pipe"));
        Assert.assertThat(updateMappingRepository
                        .findByOIdAndMidOIdAndTablename(2,2,"pipe")
                        .getMysqlId(),
                is(2));

        //int result = updateMappingRepository.deleteByOIdAndMidOIdAndTablename(2,2,"pipe");
        int id= updateMappingRepository.findByOIdAndMidOIdAndTablename(2,2,"pipe").getId();
        updateMappingRepository.delete(id);
//        logger.debug("deleteByOIdAndMidOIdAndTablename,result="+result);
//        System.out.println("deleteByOIdAndMidOIdAndTablename,result="+result);
        Assert.assertThat(updateMappingRepository
                        .findByOIdAndMidOIdAndTablename(2,2,"pipe"),
                is(nullValue()));
//        updateMappingRepository.save(updateMapping);
//        Assert.assertThat(updateMappingRepository.findByOID(2).getTablename(),
//                is("pipe"));
    }

}