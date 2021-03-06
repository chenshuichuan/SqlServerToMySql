package com.ricardo.service;

import com.ricardo.domain.mysqldata.pipe.pipe.Pipe;

import java.util.List;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface PipeCuttingService {

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的PipeCutting中所有需要更新的数据，更新到MySQL中
     *@Date: 10:29 2018/4/7
     *@param:
     **/
    List<Pipe> update();

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的PipeCutting中需要删除的数据，进行删除操作
     *@Date: 10:31 2018/4/7
     *@param:
     **/
    void delete();

}
