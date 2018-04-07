package com.ricardo.domain.sqlserverdata.jpa;

import com.ricardo.domain.sqlserverdata.bean.PipeBatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

@Transactional
public interface PipeBatchRepository extends JpaRepository<PipeBatch,Integer> {

    /**
     *@Author: Ricardo
     *@Description: 获取所有isDelete状态的数据
     *@Date: 10:39 2018/4/7
     **/
    List<PipeBatch> findByIsDelete(Boolean isDelete);

    /**
     *@Author: Ricardo
     *@Description: 获取所有idUpdate状态的数据
     *@Date: 10:40 2018/4/7
     **/
    List<PipeBatch> findByIsUpdate(Boolean isUpdate);


    /**
     *@Author: Ricardo
     *@Description: 根据id，更新isUpdate状态
     *@Date: 10:41 2018/4/7
     *@param: isUpdate
     **/
    @Modifying
    @Query(value = "update PipeBatch set 是否更新=?1 where OID=?2",nativeQuery = true)
    void setIsUpdateById(Boolean isUpdate,int id);

}