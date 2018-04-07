package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeComponent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface PipeComponentRepository extends JpaRepository<PipeComponent,Integer> {
    //PipeComponent 表没有更新、删除标志
//    List<PipeComponent> findByIsDelete(Boolean isDelete);
//    List<PipeComponent> findByIsUpdate(Boolean isUpdate);
}