package com.ricardo.service;

import com.ricardo.domain.mysqldata.pipe.batch.Batch;

import java.util.List;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface PipeBatchService {

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的 PipeBatch中所有需要更新的数据，更新到MySQL中
     *@Date: 10:29 2018/4/7
     *@param:
     **/
    List<Batch> update();

    /**
     *@Author: Ricardo
     *@Description: 获取SQL server的 PipeBatch中需要删除的数据，进行删除操作
     *@Date: 10:31 2018/4/7
     *@param:
     **/
    void delete();


    /**
     * 统计批次吓所有单元数
     *
     * */
    int calUnitNumberOfBatch(Batch batch);

    /**
     * 统计批次吓所有单元包含的管件
     *
     * */
    int calPipeNumberOfUnitsByBatch(Batch batch);
}
