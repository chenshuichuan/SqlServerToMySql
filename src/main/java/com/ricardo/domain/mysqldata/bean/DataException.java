package com.ricardo.domain.mysqldata.bean;

/**
 * 更新数据信息异常类
 * 
 * @author ricardo
 */
public class DataException extends BaseException
{
    private static final long serialVersionUID = 1L;

    public DataException(String code)
    {
        super("user", code, null, null);
    }

    /**
    *鞋带的错误信息，用于写入数据库
     */
    private MiddleStatus middleStatus;

    public MiddleStatus getMiddleStatus() {
        return middleStatus;
    }

    public void setMiddleStatus(MiddleStatus middleStatus) {
        this.middleStatus = middleStatus;
    }
}
