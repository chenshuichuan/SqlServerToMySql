package com.ricardo.domain.mysqldata.pipe.pipManage.service;


import com.ricardo.domain.mysqldata.pipe.pipManage.PipManage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface PipManageRepository extends JpaRepository<PipManage,Integer> {


}
