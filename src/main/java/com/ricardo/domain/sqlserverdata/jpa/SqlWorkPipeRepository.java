package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlWorkPipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlWorkPipeRepository extends JpaRepository<SqlWorkPipe,Integer> {

    List<SqlWorkPipe> findByIsDelete(Boolean isDelete);
    List<SqlWorkPipe> findByIsUpdate(Boolean isUpdate);
}