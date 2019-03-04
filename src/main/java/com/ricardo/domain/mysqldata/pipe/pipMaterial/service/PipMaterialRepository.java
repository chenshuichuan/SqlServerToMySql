package com.ricardo.domain.mysqldata.pipe.pipMaterial.service;


import com.ricardo.domain.mysqldata.pipe.pipMaterial.PipMaterial;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface PipMaterialRepository extends JpaRepository<PipMaterial,Integer> {


}
