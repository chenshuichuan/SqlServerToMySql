package com.ricardo.domain.mysqldata.pipe.batch.service;


import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface BatchRepository extends JpaRepository<Batch,Integer> {


}
