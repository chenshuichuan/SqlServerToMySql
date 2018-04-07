package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeManage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeManageRepository extends JpaRepository<PipeManage,Integer> {

    List<PipeManage> findByIsDelete(Boolean isDelete);
    List<PipeManage> findByIsUpdate(Boolean isUpdate);
}