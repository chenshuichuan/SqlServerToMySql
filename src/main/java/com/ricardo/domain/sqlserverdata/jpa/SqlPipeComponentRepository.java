package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.SqlPipeComponent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface SqlPipeComponentRepository extends JpaRepository<SqlPipeComponent,Integer> {
    //PipeComponent 表没有更新、删除标志
//    List<PipeComponent> findByIsDelete(Boolean isDelete);
//    List<PipeComponent> findByIsUpdate(Boolean isUpdate);
}