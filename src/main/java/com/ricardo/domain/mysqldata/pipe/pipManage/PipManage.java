package com.ricardo.domain.mysqldata.pipe.pipManage;
import javax.persistence.*;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 派工单表 pipe_pip_manage
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_pip_manage")
public class PipManage extends BaseEntity
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
    @Column(name = "call_ship_id")
	private Integer callShipId;
	/** 装配管ID */
    @Column(name = "assembly_pipe_id")
	private Integer assemblyPipeId;
	/** 加工单元ID */
    @Column(name = "process_unit_id")
	private Integer processUnitId;
	/** 派工单 */
    @Column(name = "dispatch_form")
	private String dispatchForm;
	/** 工序 */
    @Column(name = "process_stage")
	private String processStage;

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
	public void setDispatchForm(String dispatchForm) 
	{
		this.dispatchForm = dispatchForm;
	}

	public String getDispatchForm() 
	{
		return dispatchForm;
	}
	public void setProcessStage(String processStage) 
	{
		this.processStage = processStage;
	}

	public String getProcessStage() 
	{
		return processStage;
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
            .append("dispatchForm", getDispatchForm())
            .append("processStage", getProcessStage())
            .toString();
    }
}
