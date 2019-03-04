package com.ricardo.domain.mysqldata.pipe.batch;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


import javax.persistence.*;
import java.util.Date;

/**
 * 加工批次表 pipe_batch
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_batch")
public class Batch extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 批次编号 */
	@Id
	@GeneratedValue
    @Column(name = "id")
	private Integer id;
	/** 批次名称 */
    @Column(name = "name")
	private String name;
	/** 批次描述 */
    @Column(name = "remark")
	private String remark;
	/** 船名代码 */
    @Column(name = "ship_code")
	private String shipCode;
	/** 包含单元数 */
    @Column(name = "unit_number")
	private Integer unitNumber;
	/** j加工中单元数 */
    @Column(name = "processing_number")
	private Integer processingNumber;
	/** 未开工单元数 */
    @Column(name = "unprocess_number")
	private Integer unprocessNumber;
	/** 完工单元数 */
    @Column(name = "processed_number")
	private Integer processedNumber;
	/** 更新时间 */
    @Column(name = "update_time")
	private Date updateTime;
	/** 批次缺件单元数 */
    @Column(name = "lackUnit_number")
	private Integer lackUnitNumber;
	/** 批次缺件管件数 */
    @Column(name = "lackPipe_number")
	private Integer lackPipeNumber;
	/** 是否完工 */
    @Column(name = "is_finished")
	private Integer isFinished;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	@Override
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	@Override
	public String getRemark() 
	{
		return remark;
	}
	public void setShipCode(String shipCode) 
	{
		this.shipCode = shipCode;
	}

	public String getShipCode() 
	{
		return shipCode;
	}
	public void setUnitNumber(Integer unitNumber) 
	{
		this.unitNumber = unitNumber;
	}

	public Integer getUnitNumber() 
	{
		return unitNumber;
	}
	public void setProcessingNumber(Integer processingNumber) 
	{
		this.processingNumber = processingNumber;
	}

	public Integer getProcessingNumber() 
	{
		return processingNumber;
	}
	public void setUnprocessNumber(Integer unprocessNumber) 
	{
		this.unprocessNumber = unprocessNumber;
	}

	public Integer getUnprocessNumber() 
	{
		return unprocessNumber;
	}
	public void setProcessedNumber(Integer processedNumber) 
	{
		this.processedNumber = processedNumber;
	}

	public Integer getProcessedNumber() 
	{
		return processedNumber;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setLackUnitNumber(Integer lackUnitNumber) 
	{
		this.lackUnitNumber = lackUnitNumber;
	}

	public Integer getLackUnitNumber() 
	{
		return lackUnitNumber;
	}
	public void setLackPipeNumber(Integer lackPipeNumber) 
	{
		this.lackPipeNumber = lackPipeNumber;
	}

	public Integer getLackPipeNumber() 
	{
		return lackPipeNumber;
	}
	public void setIsFinished(Integer isFinished) 
	{
		this.isFinished = isFinished;
	}

	public Integer getIsFinished() 
	{
		return isFinished;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("remark", getRemark())
            .append("shipCode", getShipCode())
            .append("unitNumber", getUnitNumber())
            .append("processingNumber", getProcessingNumber())
            .append("unprocessNumber", getUnprocessNumber())
            .append("processedNumber", getProcessedNumber())
            .append("updateTime", getUpdateTime())
            .append("lackUnitNumber", getLackUnitNumber())
            .append("lackPipeNumber", getLackPipeNumber())
            .append("isFinished", getIsFinished())
            .toString();
    }
}
