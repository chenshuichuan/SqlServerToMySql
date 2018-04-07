package com.ricardo.service;

import com.ricardo.domain.mysqldata.bean.Myuser;
import com.ricardo.domain.sqlserverdata.bean.Book;

/**
 * @author Ricardo
 *
 * @Description
 *
 * Date: 2018/3/14
 * Time: 22:25
 */

public interface PipeService {

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
