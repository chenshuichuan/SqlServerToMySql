package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeUnitRepository extends JpaRepository<PipeUnit,Integer> {

    List<PipeUnit> findByIsDelete(Boolean isDelete);
    List<PipeUnit> findByIsUpdate(Boolean isUpdate);
}