package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.ShipManage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface ShipManageRepository extends JpaRepository<ShipManage,Integer> {

    List<ShipManage> findByIsDelete(Boolean isDelete);
    List<ShipManage> findByIsUpdate(Boolean isUpdate);
}