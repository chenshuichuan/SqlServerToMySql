package com.ricardo.service;

import com.ricardo.domain.mysqldata.pipe.batch.Batch;
import com.ricardo.domain.mysqldata.pipe.unit.Unit;

import java.util.List;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface PipeUnitService {

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的PipeUnit中所有需要更新的数据，更新到MySQL中
     *@Date: 10:29 2018/4/7
     *@param:
     **/
    List<Unit> update();

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的PipeUnit中需要删除的数据，进行删除操作
     *@Date: 10:31 2018/4/7
     *@param:
     **/
    void delete();

    /**
     * 统计单元包含的管件
     *
     * */
    int calPipeNumberOfUnit(Unit unit);


}
