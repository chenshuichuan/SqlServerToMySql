package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeRepository extends JpaRepository<SqlPipe,Integer> {

    List<SqlPipe> findByIsDelete(Boolean isDelete);
    List<SqlPipe> findByIsUpdate(Boolean isUpdate);

}