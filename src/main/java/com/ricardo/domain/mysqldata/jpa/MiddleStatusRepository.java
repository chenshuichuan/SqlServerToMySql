package com.ricardo.domain.mysqldata.jpa;


import com.ricardo.domain.mysqldata.bean.MiddleStatus;
import com.ricardo.domain.mysqldata.bean.UpdateMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */
public interface MiddleStatusRepository extends JpaRepository<MiddleStatus,Integer> {


}