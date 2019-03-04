package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeMaterialRepository extends JpaRepository<SqlPipeMaterial,Integer> {

    List<SqlPipeMaterial> findByIsDelete(Boolean isDelete);
    List<SqlPipeMaterial> findByIsUpdate(Boolean isUpdate);
}