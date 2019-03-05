package com.ricardo.domain.mysqldata.pipe.processPlan;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 下料计划，不包含后续加工，后续加工计划请查看pipe_process_plan表 pipe_process_plan
 * 
 * @author ricardo
 * @date 2019-03-02
 */
@Entity
@Table(name="pipe_process_plan")
public class ProcessPlan extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** plan id */
	@Id
	@Column(name = "id")
	private Integer id;
	/** 序号 */
	@Column(name = "serial_number")
	private String serialNumber;
	/** 上传的计划名称 */
	@Column(name = "plan_name")
	private String planName;
	/** 船名 */
	@Column(name = "ship_name")
	private String shipName;
	/** 加工批次 */
	@Column(name = "batch_name")
	private String batchName;
	/** 加工批次描述 */
	@Column(name = "batch_description")
	private String batchDescription;
	/** 上传时间 */
	@Column(name = "create_time")
	private Date createTime;
	/** 更新时间 */
	@Column(name = "update_time")
	private Date updateTime;
	/** 包含托盘 */
	@Column(name = "stocks")
	private String stocks;
	/** 包含分段 */
	@Column(name = "sections")
	private String sections;
	/** 加工点，工段 */
	@Column(name = "process_place")
	private String processPlace;
	/** 加工管件数量 */
	@Column(name = "number")
	private Integer number;
	/** 含光身管 */
	@Column(name = "light_body_pipe")
	private String lightBodyPipe;
	/** 计划结束时间 */
	@Column(name = "plan_start")
	private Date planStart;
	/** 计划开始时间 */
	@Column(name = "plan_end")
	private Date planEnd;
	/** 实际开始时间 */
	@Column(name = "actual_start")
	private Date actualStart;
	/** 实际结束时间 */
	@Column(name = "actual_end")
	private Date actualEnd;
	/** 10-12计划 */
	@Column(name = "middle_date")
	private Date middleDate;
	/** 发图时间 */
	@Column(name = "send_pic_time")
	private Date sendPicTime;
	/**  */
	@Column(name = "remark")
	private String remark;
	/** 是否完工 */
	@Column(name = "is_finished")
	private Integer isFinished;

	public ProcessPlan() {
		this.createTime = new Date();
		this.updateTime = new Date();
		this.number = 0;
		this.isFinished = 0;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setSerialNumber(String serialNumber) 
	{
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() 
	{
		return serialNumber;
	}
	public void setPlanName(String planName) 
	{
		this.planName = planName;
	}

	public String getPlanName() 
	{
		return planName;
	}
	public void setShipName(String shipName) 
	{
		this.shipName = shipName;
	}

	public String getShipName() 
	{
		return shipName;
	}
	public void setBatchName(String batchName) 
	{
		this.batchName = batchName;
	}

	public String getBatchName() 
	{
		return batchName;
	}
	public void setBatchDescription(String batchDescription) 
	{
		this.batchDescription = batchDescription;
	}

	public String getBatchDescription() 
	{
		return batchDescription;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setStocks(String stocks) 
	{
		this.stocks = stocks;
	}

	public String getStocks() 
	{
		return stocks;
	}
	public void setSections(String sections) 
	{
		this.sections = sections;
	}

	public String getSections() 
	{
		return sections;
	}
	public void setProcessPlace(String processPlace) 
	{
		this.processPlace = processPlace;
	}

	public String getProcessPlace() 
	{
		return processPlace;
	}
	public void setNumber(Integer number) 
	{
		this.number = number;
	}

	public Integer getNumber() 
	{
		return number;
	}
	public void setLightBodyPipe(String lightBodyPipe) 
	{
		this.lightBodyPipe = lightBodyPipe;
	}

	public String getLightBodyPipe() 
	{
		return lightBodyPipe;
	}
	public void setPlanStart(Date planStart) 
	{
		this.planStart = planStart;
	}

	public Date getPlanStart() 
	{
		return planStart;
	}
	public void setPlanEnd(Date planEnd) 
	{
		this.planEnd = planEnd;
	}

	public Date getPlanEnd() 
	{
		return planEnd;
	}
	public void setActualStart(Date actualStart) 
	{
		this.actualStart = actualStart;
	}

	public Date getActualStart() 
	{
		return actualStart;
	}
	public void setActualEnd(Date actualEnd) 
	{
		this.actualEnd = actualEnd;
	}

	public Date getActualEnd() 
	{
		return actualEnd;
	}
	public void setMiddleDate(Date middleDate) 
	{
		this.middleDate = middleDate;
	}

	public Date getMiddleDate() 
	{
		return middleDate;
	}
	public void setSendPicTime(Date sendPicTime) 
	{
		this.sendPicTime = sendPicTime;
	}

	public Date getSendPicTime() 
	{
		return sendPicTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
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
            .append("serialNumber", getSerialNumber())
            .append("planName", getPlanName())
            .append("shipName", getShipName())
            .append("batchName", getBatchName())
            .append("batchDescription", getBatchDescription())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .append("stocks", getStocks())
            .append("sections", getSections())
            .append("processPlace", getProcessPlace())
            .append("number", getNumber())
            .append("lightBodyPipe", getLightBodyPipe())
            .append("planStart", getPlanStart())
            .append("planEnd", getPlanEnd())
            .append("actualStart", getActualStart())
            .append("actualEnd", getActualEnd())
            .append("middleDate", getMiddleDate())
            .append("sendPicTime", getSendPicTime())
            .append("remark", getRemark())
            .append("isFinished", getIsFinished())
            .toString();
    }
}
