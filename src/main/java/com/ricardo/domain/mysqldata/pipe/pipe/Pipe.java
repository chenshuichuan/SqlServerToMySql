package com.ricardo.domain.mysqldata.pipe.pipe;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeCutting;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 管件表 pipe_pipe
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_pipe")
public class Pipe extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 装配管号ID */
	@Id
    @Column(name = "id")
	private Integer id;
	/** 号船代号 */
    @Column(name = "ship_code")
	private String shipCode;
	/** 批次id */
    @Column(name = "batch_id")
	private Integer batchId;
	/** 单元序号 */
    @Column(name = "unit_id")
	private Integer unitId;
	/** 集配管号 */
    @Column(name = "collecte_code")
	private String collecteCode;
	/** 号船id */
    @Column(name = "call_ship_id")
	private Integer callShipId;
	/** 装配管id */
    @Column(name = "assembly_pipe_id")
	private Integer assemblyPipeId;
	/** 修改时间 */
    @Column(name = "update_time")
	private Date updateTime;
	/** 加工工序 */
    @Column(name = "process_order")
	private Integer processOrder;
	/** 当前工序 */
    @Column(name = "process_stage")
	private Integer processStage;
	/** 下一工序 */
    @Column(name = "next_stage")
	private Integer nextStage;
	/** 当前工序排几 */
    @Column(name = "process_index")
	private Integer processIndex;
	/** 是否脱离单元工序 */
    @Column(name = "is_out_of_unit")
	private Integer isOutOfUnit;
	/** 是否完工 */
	@Column(name = "is_finished")
	private Integer isFinished;

	public Integer getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(Integer isFinished) {
		this.isFinished = isFinished;
	}

	public Pipe() {
	}
	public Pipe(SqlPipeCutting sqlPipeCutting) {
		this.id = sqlPipeCutting.getOldId();
		this.unitId = sqlPipeCutting.getProcessUnitId();
		this.callShipId = sqlPipeCutting.getCallShipId();
		this.assemblyPipeId = sqlPipeCutting.getAssemblyId();
		this.updateTime = new Date();
		this.processOrder = 0;
		this.processStage = 0;
		this.nextStage = 0;
		this.processIndex = 0;
		this.isOutOfUnit = 0;
		this.isFinished = 0;
	}
	public Pipe(Integer id, Integer unitId, String collecteCode, Integer callShipId, Integer assemblyPipeId,
				Date updateTime, Integer processOrder, Integer processStage, Integer nextStage, Integer processIndex, Integer isOutOfUnit) {
		this.id = id;
		this.unitId = unitId;
		this.collecteCode = collecteCode;
		this.callShipId = callShipId;
		this.assemblyPipeId = assemblyPipeId;
		this.updateTime = updateTime;
		this.processOrder = processOrder;
		this.processStage = processStage;
		this.nextStage = nextStage;
		this.processIndex = processIndex;
		this.isOutOfUnit = isOutOfUnit;
		this.isFinished = 0;
	}

	public Pipe(Integer unitId, Integer callShipId, Integer assemblyPipeId) {
		this.unitId = unitId;
		this.callShipId = callShipId;
		this.assemblyPipeId = assemblyPipeId;
		this.updateTime = new Date();
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
	public void setUnitId(Integer unitId) 
	{
		this.unitId = unitId;
	}

	public Integer getUnitId() 
	{
		return unitId;
	}
	public void setCollecteCode(String collecteCode) 
	{
		this.collecteCode = collecteCode;
	}

	public String getCollecteCode() 
	{
		return collecteCode;
	}
	public void setCallShipId(Integer callShipId) 
	{
		this.callShipId = callShipId;
	}

	public Integer getCallShipId() 
	{
		return callShipId;
	}
	public void setAssemblyPipeId(Integer assemblyPipeId) 
	{
		this.assemblyPipeId = assemblyPipeId;
	}

	public Integer getAssemblyPipeId() 
	{
		return assemblyPipeId;
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
	public void setProcessOrder(Integer processOrder) 
	{
		this.processOrder = processOrder;
	}

	public Integer getProcessOrder() 
	{
		return processOrder;
	}
	public void setProcessStage(Integer processStage) 
	{
		this.processStage = processStage;
	}

	public Integer getProcessStage() 
	{
		return processStage;
	}
	public void setNextStage(Integer nextStage) 
	{
		this.nextStage = nextStage;
	}

	public Integer getNextStage() 
	{
		return nextStage;
	}
	public void setProcessIndex(Integer processIndex) 
	{
		this.processIndex = processIndex;
	}

	public Integer getProcessIndex() 
	{
		return processIndex;
	}
	public void setIsOutOfUnit(Integer isOutOfUnit) 
	{
		this.isOutOfUnit = isOutOfUnit;
	}

	public Integer getIsOutOfUnit() 
	{
		return isOutOfUnit;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shipCode", getShipCode())
            .append("batchId", getBatchId())
            .append("unitId", getUnitId())
            .append("collecteCode", getCollecteCode())
            .append("callShipId", getCallShipId())
            .append("assemblyPipeId", getAssemblyPipeId())
            .append("updateTime", getUpdateTime())
            .append("processOrder", getProcessOrder())
            .append("processStage", getProcessStage())
            .append("nextStage", getNextStage())
            .append("processIndex", getProcessIndex())
            .append("isOutOfUnit", getIsOutOfUnit())
            .toString();
    }
}
