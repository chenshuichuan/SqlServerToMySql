package com.ricardo.domain.mysqldata.pipe.workPipe.service;


import com.ricardo.domain.mysqldata.pipe.workPipe.WorkPipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ricardo
 * Created by: ricardo
 * Description: 下料类的repository类
 * Date: 2018/8/22
 */
public interface WorkPipeRepository extends JpaRepository<WorkPipe,Integer> {


}
