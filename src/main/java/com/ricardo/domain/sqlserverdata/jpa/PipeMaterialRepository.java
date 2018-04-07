package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeMaterialRepository extends JpaRepository<PipeMaterial,Integer> {

    List<PipeMaterial> findByIsDelete(Boolean isDelete);
    List<PipeMaterial> findByIsUpdate(Boolean isUpdate);
}