package com.ricardo.domain.mysqldata.pipe.cutPlan.service;


import com.ricardo.domain.mysqldata.pipe.cutPlan.CutPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface CutPlanRepository extends JpaRepository<CutPlan,Integer> {


}
