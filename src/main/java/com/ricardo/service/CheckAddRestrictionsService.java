package com.ricardo.service;

/**
 * @author Ricardo
 *
 * @Description 检查添加记录约束条件是否满足
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface CheckAddRestrictionsService {

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的Pipe中所有需要更新的数据，更新到MySQL中
     *@Date: 10:29 2018/4/7
     *@param:
     **/
    void update();

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的Pipe中需要删除的数据，进行删除操作
     *@Date: 10:31 2018/4/7
     *@param:
     **/
    void delete();

}
