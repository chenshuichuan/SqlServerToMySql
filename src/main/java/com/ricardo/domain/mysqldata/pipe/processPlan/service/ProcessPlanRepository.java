package com.ricardo.domain.mysqldata.pipe.processPlan.service;


import com.ricardo.domain.mysqldata.pipe.processPlan.ProcessPlan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface ProcessPlanRepository extends JpaRepository<ProcessPlan,Integer> {


}
