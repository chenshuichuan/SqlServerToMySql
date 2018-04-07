package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeStoreRepository extends JpaRepository<PipeStore,Integer> {

    List<PipeStore> findByIsDelete(Boolean isDelete);
    List<PipeStore> findByIsUpdate(Boolean isUpdate);
}