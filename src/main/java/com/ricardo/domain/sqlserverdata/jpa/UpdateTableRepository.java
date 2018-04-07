package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.UpdateTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface UpdateTableRepository extends JpaRepository<UpdateTable,Integer> {

    List<UpdateTable> findByIsDelete(Boolean isDelete);
    List<UpdateTable> findByIsUpdate(Boolean isUpdate);
}