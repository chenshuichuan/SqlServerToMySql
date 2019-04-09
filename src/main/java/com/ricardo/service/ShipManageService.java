package com.ricardo.service;

import com.ricardo.domain.mysqldata.pipe.ship.Ship;

import java.util.List;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface ShipManageService {

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的ShipManage中所有需要更新的数据，更新到MySQL中
     *              返回新添加的ship
     *@Date: 10:29 2018/4/7
     *@param:
     **/
    List<Ship> update();

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的ShipManage中需要删除的数据，进行删除操作
     *@Date: 10:31 2018/4/7
     *@param:
     **/
    void delete();

    /**
     * 统计船下所有批次包含的所有单元包含的管件
     *
     * */
    int calPipeNumberOfUnitsByShip(Ship ship);
    /**
     * 统计船下所有批次包含的所有单元
     * */
    public int calUnitNumberOfBatchsByShip(Ship ship);
    /**
     * 统计船下所有批次数
     * */
    public int calBatchNumberOfShip(Ship ship);
}
