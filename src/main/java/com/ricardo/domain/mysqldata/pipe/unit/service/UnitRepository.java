package com.ricardo.domain.mysqldata.pipe.unit.service;


import com.ricardo.domain.mysqldata.pipe.unit.Unit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface UnitRepository extends JpaRepository<Unit,Integer> {
    List<Unit> findByAndBatchId(int batchId);
    int countByBatchId(int batchId);
}
