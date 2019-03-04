package com.ricardo.domain.mysqldata.pipe.cutPlan;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 加工计划，不包含下料计划，下料计划请查看pipe_cut_plan表 pipe_cut_plan
 * 
 * @author ricardo
 * @date 2019-03-02
 */
@Entity
@Table(name="pipe_cut_plan")
public class CutPlan extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** plan id *///@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	/** 更新时间 */
	@Column(name = "update_time")
	private Date updateTime;
	/** 备注 */
	@Column(name = "remark")
	private String remark;
	/** 是否完工 */
	@Column(name = "is_finished")
	private Integer isFinished;
	/** 完工时间 */
	@Column(name = "finished_date")
	private Date finishedDate;
	/** 该次计划下料总数 */
	@Column(name = "total_cut_number")
	private Integer totalCutNumber;
	/** 一部大管工段下料-加工管数 */
	@Column(name = "onebig_cut_number")
	private Integer onebigCutNumber;
	/** 一部大管工段下料-下料完成数 */
	@Column(name = "onebig_cut_finished")
	private Integer onebigCutFinished;
	/** 一部下料工段-弯管下料数 */
	@Column(name = "one_bend_cut_number")
	private Integer oneBendCutNumber;
	/** 一部下料工段-直管下料数 */
	@Column(name = "one_ver_cut_number")
	private Integer oneVerCutNumber;
	/** 一部下料工段-大管下料数 */
	@Column(name = "one_big_cut_number")
	private Integer oneBigCutNumber;
	/** 一部下料工段-下料总数 */
	@Column(name = "one_total_number")
	private Integer oneTotalNumber;
	/** 一部下料工段-完成总数 */
	@Column(name = "one_total_finished")
	private Integer oneTotalFinished;
	/** 二部下料工段-弯管下料数 */
	@Column(name = "two_bend_number")
	private Integer twoBendNumber;
	/** 二部下料工段-直管下料数 */
	@Column(name = "two_ver_number")
	private Integer twoVerNumber;
	/** 二部下料工段-下料总数 */
	@Column(name = "two_total_number")
	private Integer twoTotalNumber;
	/** 二部下料工段-完成总数 */
	@Column(name = "two_total_finished")
	private Integer twoTotalFinished;

	public CutPlan() {
		this.updateTime = new Date();
		this.isFinished = 0;
		this.totalCutNumber = 0;
		this.onebigCutNumber = 0;
		this.onebigCutFinished = 0;
		this.oneBendCutNumber = 0;
		this.oneVerCutNumber = 0;
		this.oneBigCutNumber = 0;
		this.oneTotalNumber = 0;
		this.oneTotalFinished = 0;
		this.twoBendNumber = 0;
		this.twoVerNumber = 0;
		this.twoTotalNumber = 0;
		this.twoTotalFinished = 0;
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
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
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
	public void setFinishedDate(Date finishedDate) 
	{
		this.finishedDate = finishedDate;
	}

	public Date getFinishedDate() 
	{
		return finishedDate;
	}
	public void setTotalCutNumber(Integer totalCutNumber) 
	{
		this.totalCutNumber = totalCutNumber;
	}

	public Integer getTotalCutNumber() 
	{
		return totalCutNumber;
	}
	public void setOnebigCutNumber(Integer onebigCutNumber) 
	{
		this.onebigCutNumber = onebigCutNumber;
	}

	public Integer getOnebigCutNumber() 
	{
		return onebigCutNumber;
	}
	public void setOnebigCutFinished(Integer onebigCutFinished) 
	{
		this.onebigCutFinished = onebigCutFinished;
	}

	public Integer getOnebigCutFinished() 
	{
		return onebigCutFinished;
	}
	public void setOneBendCutNumber(Integer oneBendCutNumber) 
	{
		this.oneBendCutNumber = oneBendCutNumber;
	}

	public Integer getOneBendCutNumber() 
	{
		return oneBendCutNumber;
	}
	public void setOneVerCutNumber(Integer oneVerCutNumber) 
	{
		this.oneVerCutNumber = oneVerCutNumber;
	}

	public Integer getOneVerCutNumber() 
	{
		return oneVerCutNumber;
	}
	public void setOneBigCutNumber(Integer oneBigCutNumber) 
	{
		this.oneBigCutNumber = oneBigCutNumber;
	}

	public Integer getOneBigCutNumber() 
	{
		return oneBigCutNumber;
	}
	public void setOneTotalNumber(Integer oneTotalNumber) 
	{
		this.oneTotalNumber = oneTotalNumber;
	}

	public Integer getOneTotalNumber() 
	{
		return oneTotalNumber;
	}
	public void setOneTotalFinished(Integer oneTotalFinished) 
	{
		this.oneTotalFinished = oneTotalFinished;
	}

	public Integer getOneTotalFinished() 
	{
		return oneTotalFinished;
	}
	public void setTwoBendNumber(Integer twoBendNumber) 
	{
		this.twoBendNumber = twoBendNumber;
	}

	public Integer getTwoBendNumber() 
	{
		return twoBendNumber;
	}
	public void setTwoVerNumber(Integer twoVerNumber) 
	{
		this.twoVerNumber = twoVerNumber;
	}

	public Integer getTwoVerNumber() 
	{
		return twoVerNumber;
	}
	public void setTwoTotalNumber(Integer twoTotalNumber) 
	{
		this.twoTotalNumber = twoTotalNumber;
	}

	public Integer getTwoTotalNumber() 
	{
		return twoTotalNumber;
	}
	public void setTwoTotalFinished(Integer twoTotalFinished) 
	{
		this.twoTotalFinished = twoTotalFinished;
	}

	public Integer getTwoTotalFinished() 
	{
		return twoTotalFinished;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("serialNumber", getSerialNumber())
            .append("planName", getPlanName())
            .append("shipName", getShipName())
            .append("batchName", getBatchName())
            .append("batchDescription", getBatchDescription())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("isFinished", getIsFinished())
            .append("finishedDate", getFinishedDate())
            .append("totalCutNumber", getTotalCutNumber())
            .append("onebigCutNumber", getOnebigCutNumber())
            .append("onebigCutFinished", getOnebigCutFinished())
            .append("oneBendCutNumber", getOneBendCutNumber())
            .append("oneVerCutNumber", getOneVerCutNumber())
            .append("oneBigCutNumber", getOneBigCutNumber())
            .append("oneTotalNumber", getOneTotalNumber())
            .append("oneTotalFinished", getOneTotalFinished())
            .append("twoBendNumber", getTwoBendNumber())
            .append("twoVerNumber", getTwoVerNumber())
            .append("twoTotalNumber", getTwoTotalNumber())
            .append("twoTotalFinished", getTwoTotalFinished())
            .toString();
    }
}
