package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeUnitRepository extends JpaRepository<SqlPipeUnit,Integer> {

    List<SqlPipeUnit> findByIsDelete(Boolean isDelete);
    List<SqlPipeUnit> findByIsUpdate(Boolean isUpdate);
}