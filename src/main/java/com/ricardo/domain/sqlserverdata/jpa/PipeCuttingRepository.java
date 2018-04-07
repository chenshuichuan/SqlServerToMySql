package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeCutting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeCuttingRepository extends JpaRepository<PipeCutting,Integer> {

    List<PipeCutting> findByIsDelete(Boolean isDelete);
    List<PipeCutting> findByIsUpdate(Boolean isUpdate);
}