package com.ricardo.domain.mysqldata.pipe.pipStore.service;


import com.ricardo.domain.mysqldata.pipe.pipStore.PipStore;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface PipStoreRepository extends JpaRepository<PipStore,Integer> {


}
