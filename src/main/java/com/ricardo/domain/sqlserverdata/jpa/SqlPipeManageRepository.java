package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeManage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeManageRepository extends JpaRepository<SqlPipeManage,Integer> {

    List<SqlPipeManage> findByIsDelete(Boolean isDelete);
    List<SqlPipeManage> findByIsUpdate(Boolean isUpdate);
}