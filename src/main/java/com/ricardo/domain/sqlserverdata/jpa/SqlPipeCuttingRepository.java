package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeCutting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeCuttingRepository extends JpaRepository<SqlPipeCutting,Integer> {

    List<SqlPipeCutting> findByIsDelete(Boolean isDelete);
    List<SqlPipeCutting> findByIsUpdate(Boolean isUpdate);
}