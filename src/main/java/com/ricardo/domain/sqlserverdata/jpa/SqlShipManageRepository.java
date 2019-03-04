package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlShipManage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlShipManageRepository extends JpaRepository<SqlShipManage,Integer> {

    List<SqlShipManage> findByIsDelete(Boolean isDelete);
    List<SqlShipManage> findByIsUpdate(Boolean isUpdate);
}