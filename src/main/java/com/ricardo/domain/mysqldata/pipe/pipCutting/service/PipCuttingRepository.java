package com.ricardo.domain.mysqldata.pipe.pipCutting.service;


import com.ricardo.domain.mysqldata.pipe.pipCutting.PipCutting;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface PipCuttingRepository extends JpaRepository<PipCutting,Integer> {


}
