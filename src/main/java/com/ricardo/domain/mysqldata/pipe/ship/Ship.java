package com.ricardo.domain.mysqldata.pipe.ship;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 号船表 pipe_ship
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_ship")
public class Ship extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	/** 船名代码 */
    @Column(name = "ship_code")
	private String shipCode;
	/** 船名 */
    @Column(name = "ship_name")
	private String shipName;
	/** 型船id */
    @Column(name = "shape_ship_id")
	private String shapeShipId;
	/** 包含批次数 */
    @Column(name = "batch_number")
	private Integer batchNumber;
	/** 未开工批次数 */
    @Column(name = "unprocess_number")
	private Integer unprocessNumber;
	/** 加工中批次数 */
    @Column(name = "processing_number")
	private Integer processingNumber;
	/** 完工批次数 */
    @Column(name = "processed_number")
	private Integer processedNumber;
	/** 更新时间 */
    @Column(name = "update_time")
	private Date updateTime;
	/** 是否完成 */
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
	public void setShipCode(String shipCode) 
	{
		this.shipCode = shipCode;
	}

	public String getShipCode() 
	{
		return shipCode;
	}
	public void setShipName(String shipName) 
	{
		this.shipName = shipName;
	}

	public String getShipName() 
	{
		return shipName;
	}
	public void setShapeShipId(String shapeShipId) 
	{
		this.shapeShipId = shapeShipId;
	}

	public String getShapeShipId() 
	{
		return shapeShipId;
	}
	public void setBatchNumber(Integer batchNumber) 
	{
		this.batchNumber = batchNumber;
	}

	public Integer getBatchNumber() 
	{
		return batchNumber;
	}
	public void setUnprocessNumber(Integer unprocessNumber) 
	{
		this.unprocessNumber = unprocessNumber;
	}

	public Integer getUnprocessNumber() 
	{
		return unprocessNumber;
	}
	public void setProcessingNumber(Integer processingNumber) 
	{
		this.processingNumber = processingNumber;
	}

	public Integer getProcessingNumber() 
	{
		return processingNumber;
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
	public void setIsFinished(Integer isFinished) 
	{
		this.isFinished = isFinished;
	}

	public Integer getIsFinished() 
	{
		return isFinished;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shipCode", getShipCode())
            .append("shipName", getShipName())
            .append("shapeShipId", getShapeShipId())
            .append("batchNumber", getBatchNumber())
            .append("unprocessNumber", getUnprocessNumber())
            .append("processingNumber", getProcessingNumber())
            .append("processedNumber", getProcessedNumber())
            .append("updateTime", getUpdateTime())
            .append("isFinished", getIsFinished())
            .toString();
    }
}
