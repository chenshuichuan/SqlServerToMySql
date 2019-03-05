package com.ricardo.domain.mysqldata.pipe.pipCutting;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import com.ricardo.domain.sqlserverdata.bean.SqlPipeCutting;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

/**
 * 下料表 pipe_pip_cutting
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_pip_cutting")
public class PipCutting extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** OID */
	@Id
    @Column(name = "old_id")
	private Integer oldId;
	/** MidOID */
    @Column(name = "mid_oid")
	private Integer midOid;
	/** 是否删除 */
    @Column(name = "is_delete")
	private Integer isDelete;
	/** 是否更新 */
    @Column(name = "is_update")
	private Integer isUpdate;
	/** 号船ID */
    @Column(name = "call_shipId")
	private Integer callShipId;
	/** 装配管ID */
    @Column(name = "assembly_pipe_id")
	private Integer assemblyPipeId;
	/** 加工单元ID */
    @Column(name = "process_unit_id")
	private Integer processUnitId;
	/** 套料批次 */
    @Column(name = "machining_batch")
	private String machiningBatch;
	/** 下料长 */
    @Column(name = "cut_length")
	private Double cutLength;
	/** 入级船级社 */
    @Column(name = "in_class_ship_level")
	private String inClassShipLevel;
	/** 管材规格 */
    @Column(name = "pipe_specification")
	private String pipeSpecification;
	/** 管子形态 */
    @Column(name = "pipe_shape")
	private String pipeShape;
	/** 不校装 */
    @Column(name = "no_installed")
	private String noInstalled;

	public PipCutting() {
	}

	public PipCutting(SqlPipeCutting sqlPipeCutting) {
		this.oldId = sqlPipeCutting.getOldId();
		this.midOid = sqlPipeCutting.getMidId();
		this.isDelete = sqlPipeCutting.getDelete() ? 1:0;
		this.isUpdate = sqlPipeCutting.getUpdate() ? 1:0;
		this.callShipId = sqlPipeCutting.getCallShipId();
		this.assemblyPipeId = sqlPipeCutting.getAssemblyId();
		this.processUnitId = sqlPipeCutting.getProcessUnitId();
		this.machiningBatch = sqlPipeCutting.getMachiningBatch();
		this.cutLength = (double)sqlPipeCutting.getCuttingLength();
		this.inClassShipLevel = sqlPipeCutting.getInClassShipLevel();
		this.pipeSpecification = sqlPipeCutting.getPipeSpecification();
		this.pipeShape = sqlPipeCutting.getPipeShape();
		this.noInstalled = sqlPipeCutting.getNoInstalled();
	}

	public PipCutting(Integer oldId, Integer midOid, Integer isDelete, Integer isUpdate,
					  Integer callShipId, Integer assemblyPipeId, Integer processUnitId,
					  String machiningBatch, Double cutLength, String inClassShipLevel, String pipeSpecification,
					  String pipeShape, String noInstalled) {
		this.oldId = oldId;
		this.midOid = midOid;
		this.isDelete = isDelete;
		this.isUpdate = isUpdate;
		this.callShipId = callShipId;
		this.assemblyPipeId = assemblyPipeId;
		this.processUnitId = processUnitId;
		this.machiningBatch = machiningBatch;
		this.cutLength = cutLength;
		this.inClassShipLevel = inClassShipLevel;
		this.pipeSpecification = pipeSpecification;
		this.pipeShape = pipeShape;
		this.noInstalled = noInstalled;
	}

	public void setOldId(Integer oldId)
	{
		this.oldId = oldId;
	}

	public Integer getOldId() 
	{
		return oldId;
	}
	public void setMidOid(Integer midOid) 
	{
		this.midOid = midOid;
	}

	public Integer getMidOid() 
	{
		return midOid;
	}
	public void setIsDelete(Integer isDelete) 
	{
		this.isDelete = isDelete;
	}

	public Integer getIsDelete() 
	{
		return isDelete;
	}
	public void setIsUpdate(Integer isUpdate) 
	{
		this.isUpdate = isUpdate;
	}

	public Integer getIsUpdate() 
	{
		return isUpdate;
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
	public void setProcessUnitId(Integer processUnitId) 
	{
		this.processUnitId = processUnitId;
	}

	public Integer getProcessUnitId() 
	{
		return processUnitId;
	}
	public void setMachiningBatch(String machiningBatch) 
	{
		this.machiningBatch = machiningBatch;
	}

	public String getMachiningBatch() 
	{
		return machiningBatch;
	}
	public void setCutLength(Double cutLength) 
	{
		this.cutLength = cutLength;
	}

	public Double getCutLength() 
	{
		return cutLength;
	}
	public void setInClassShipLevel(String inClassShipLevel) 
	{
		this.inClassShipLevel = inClassShipLevel;
	}

	public String getInClassShipLevel() 
	{
		return inClassShipLevel;
	}
	public void setPipeSpecification(String pipeSpecification) 
	{
		this.pipeSpecification = pipeSpecification;
	}

	public String getPipeSpecification() 
	{
		return pipeSpecification;
	}
	public void setPipeShape(String pipeShape) 
	{
		this.pipeShape = pipeShape;
	}

	public String getPipeShape() 
	{
		return pipeShape;
	}
	public void setNoInstalled(String noInstalled) 
	{
		this.noInstalled = noInstalled;
	}

	public String getNoInstalled() 
	{
		return noInstalled;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oldId", getOldId())
            .append("midOid", getMidOid())
            .append("isDelete", getIsDelete())
            .append("isUpdate", getIsUpdate())
            .append("callShipId", getCallShipId())
            .append("assemblyPipeId", getAssemblyPipeId())
            .append("processUnitId", getProcessUnitId())
            .append("machiningBatch", getMachiningBatch())
            .append("cutLength", getCutLength())
            .append("inClassShipLevel", getInClassShipLevel())
            .append("pipeSpecification", getPipeSpecification())
            .append("pipeShape", getPipeShape())
            .append("noInstalled", getNoInstalled())
            .toString();
    }
}
