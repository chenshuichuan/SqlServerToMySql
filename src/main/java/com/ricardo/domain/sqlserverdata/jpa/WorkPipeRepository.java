package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.WorkPipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface WorkPipeRepository extends JpaRepository<WorkPipe,Integer> {

    List<WorkPipe> findByIsDelete(Boolean isDelete);
    List<WorkPipe> findByIsUpdate(Boolean isUpdate);
}