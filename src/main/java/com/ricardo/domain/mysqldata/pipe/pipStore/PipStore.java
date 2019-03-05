package com.ricardo.domain.mysqldata.pipe.pipStore;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 管子存放表 pipe_pip_store
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_pip_store")
public class PipStore extends BaseEntity
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
	/** 堆放场地 */
    @Column(name = "store_place")
	private String storePlace;
	/** 集托日期 */
    @Column(name = "collection_date")
	private Date collectionDate;
	/** 出库日期 */
    @Column(name = "out_store_date")
	private Date outStoreDate;
	/** 入库日期 */
    @Column(name = "in_store_date")
	private Date inStoreDate;

	public PipStore() {
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
	public void setStorePlace(String storePlace) 
	{
		this.storePlace = storePlace;
	}

	public String getStorePlace() 
	{
		return storePlace;
	}
	public void setCollectionDate(Date collectionDate) 
	{
		this.collectionDate = collectionDate;
	}

	public Date getCollectionDate() 
	{
		return collectionDate;
	}
	public void setOutStoreDate(Date outStoreDate) 
	{
		this.outStoreDate = outStoreDate;
	}

	public Date getOutStoreDate() 
	{
		return outStoreDate;
	}
	public void setInStoreDate(Date inStoreDate) 
	{
		this.inStoreDate = inStoreDate;
	}

	public Date getInStoreDate() 
	{
		return inStoreDate;
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
            .append("storePlace", getStorePlace())
            .append("collectionDate", getCollectionDate())
            .append("outStoreDate", getOutStoreDate())
            .append("inStoreDate", getInStoreDate())
            .toString();
    }
}
