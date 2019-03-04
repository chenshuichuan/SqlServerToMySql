package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeStoreRepository extends JpaRepository<SqlPipeStore,Integer> {

    List<SqlPipeStore> findByIsDelete(Boolean isDelete);
    List<SqlPipeStore> findByIsUpdate(Boolean isUpdate);
}