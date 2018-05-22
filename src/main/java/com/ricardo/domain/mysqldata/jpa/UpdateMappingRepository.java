package com.ricardo.domain.mysqldata.jpa;


import com.ricardo.domain.mysqldata.bean.UpdateMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 23:33
 */

public interface UpdateMappingRepository extends JpaRepository<UpdateMapping,Integer> {

    UpdateMapping findByOId(int oid);
    /*
    * 通过查询OID、MidOID以及mysql的tablename，检查sql server的记录是否已经存在于mysql中
    * 存在，则中间表更新为修改更新，
    * 不存在则为添加更新*/
     UpdateMapping findByOIdAndMidOIdAndTablename(int oId,int midOId,String tablename);

     int deleteByOIdAndMidOIdAndTablename(int oId,int midOId,String tablename);
}