package com.ricardo.domain.mysqldata.pipe.unit;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 加工单元表 pipe_unit
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_unit")
public class Unit extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** id */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Integer id;
	/** 单元名称 */
    @Column(name = "name")
	private String name;
	/** 号船代号 */
    @Column(name = "ship-ode")
	private String shipCode;
	/** p批次id */
    @Column(name = "batch_id")
	private Integer batchId;
	/** 批次名称 */
    @Column(name = "batch_name")
	private String batchName;
	/** 计划id-process_id */
    @Column(name = "plan_id")
	private Integer planId;
	/** 备注 */
    @Column(name = "remark")
	private String remark;
	/** 管形态 */
    @Column(name = "pipe_shape")
	private String pipeShape;
	/** 包含管件数 */
    @Column(name = "pipe_number")
	private Integer pipeNumber;
	/** 下料工段 */
    @Column(name = "cut_section")
	private String cutSection;
	/** j加工工段 */
    @Column(name = "process_section")
	private String processSection;
	/** 加工顺序id */
    @Column(name = "process_order_id")
	private Integer processOrderId;
	/** 当前所在工序id */
    @Column(name = "process_stage_id")
	private Integer processStageId;
	/** 下一工序id */
    @Column(name = "next_stage_id")
	private Integer nextStageId;
	/** 未加工管数量 */
    @Column(name = "unprocess_number")
	private Integer unprocessNumber;
	/** j加工中管数 */
    @Column(name = "processing_number")
	private Integer processingNumber;
	/** 加工完成管数量 */
    @Column(name = "processed_number")
	private Integer processedNumber;
	/** 更新时间 */
    @Column(name = "update_nime")
	private Date updateTime;
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
	public void setShipCode(String shipCode) 
	{
		this.shipCode = shipCode;
	}

	public String getShipCode() 
	{
		return shipCode;
	}
	public void setBatchId(Integer batchId) 
	{
		this.batchId = batchId;
	}

	public Integer getBatchId() 
	{
		return batchId;
	}
	public void setBatchName(String batchName) 
	{
		this.batchName = batchName;
	}

	public String getBatchName() 
	{
		return batchName;
	}
	public void setPlanId(Integer planId) 
	{
		this.planId = planId;
	}

	public Integer getPlanId() 
	{
		return planId;
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
	public void setPipeShape(String pipeShape) 
	{
		this.pipeShape = pipeShape;
	}

	public String getPipeShape() 
	{
		return pipeShape;
	}
	public void setPipeNumber(Integer pipeNumber) 
	{
		this.pipeNumber = pipeNumber;
	}

	public Integer getPipeNumber() 
	{
		return pipeNumber;
	}
	public void setCutSection(String cutSection) 
	{
		this.cutSection = cutSection;
	}

	public String getCutSection() 
	{
		return cutSection;
	}
	public void setProcessSection(String processSection) 
	{
		this.processSection = processSection;
	}

	public String getProcessSection() 
	{
		return processSection;
	}
	public void setProcessOrderId(Integer processOrderId) 
	{
		this.processOrderId = processOrderId;
	}

	public Integer getProcessOrderId() 
	{
		return processOrderId;
	}
	public void setProcessStageId(Integer processStageId) 
	{
		this.processStageId = processStageId;
	}

	public Integer getProcessStageId() 
	{
		return processStageId;
	}
	public void setNextStageId(Integer nextStageId) 
	{
		this.nextStageId = nextStageId;
	}

	public Integer getNextStageId() 
	{
		return nextStageId;
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
	@Override
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	@Override
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
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("shipCode", getShipCode())
            .append("batchId", getBatchId())
            .append("batchName", getBatchName())
            .append("planId", getPlanId())
            .append("remark", getRemark())
            .append("pipeShape", getPipeShape())
            .append("pipeNumber", getPipeNumber())
            .append("cutSection", getCutSection())
            .append("processSection", getProcessSection())
            .append("processOrderId", getProcessOrderId())
            .append("processStageId", getProcessStageId())
            .append("nextStageId", getNextStageId())
            .append("unprocessNumber", getUnprocessNumber())
            .append("processingNumber", getProcessingNumber())
            .append("processedNumber", getProcessedNumber())
            .append("updateTime", getUpdateTime())
            .append("isFinished", getIsFinished())
            .toString();
    }
}
