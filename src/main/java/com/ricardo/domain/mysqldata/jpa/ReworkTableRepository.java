package com.ricardo.domain.mysqldata.jpa;


import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.mysqldata.bean.ReworkTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface ReworkTableRepository extends JpaRepository<ReworkTable,Integer> {

}