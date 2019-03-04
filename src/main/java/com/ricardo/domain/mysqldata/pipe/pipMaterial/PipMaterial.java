package com.ricardo.domain.mysqldata.pipe.pipMaterial;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;

/**
 * 管子材料表 pipe_pip_material
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_pip_material")
public class PipMaterial extends BaseEntity
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
	/** 型船ID */
    @Column(name = "shape_shipId")
	private Integer shapeShipId;
	/** 装配管ID */
    @Column(name = "assembly_pipeId")
	private Integer assemblyPipeId;
	/** 部件ID */
    @Column(name = "component_id")
	private Integer componentId;
	/** 管端标识 */
    @Column(name = "pipeEnd_flag")
	private String pipeEndFlag;
	/** 数量 */
    @Column(name = "number")
	private double number;
	/** 重量 */
    @Column(name = "weight")
	private double weight;
	/** 外场装配标记 */
    @Column(name = "outfield_flag")
	private String outfieldFlag;

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
	public void setShapeShipId(Integer shapeShipId) 
	{
		this.shapeShipId = shapeShipId;
	}

	public Integer getShapeShipId() 
	{
		return shapeShipId;
	}
	public void setAssemblyPipeId(Integer assemblyPipeId) 
	{
		this.assemblyPipeId = assemblyPipeId;
	}

	public Integer getAssemblyPipeId() 
	{
		return assemblyPipeId;
	}
	public void setComponentId(Integer componentId) 
	{
		this.componentId = componentId;
	}

	public Integer getComponentId() 
	{
		return componentId;
	}
	public void setPipeEndFlag(String pipeEndFlag) 
	{
		this.pipeEndFlag = pipeEndFlag;
	}

	public String getPipeEndFlag() 
	{
		return pipeEndFlag;
	}
	public void setNumber(double number)
	{
		this.number = number;
	}

	public double getNumber()
	{
		return number;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}

	public double getWeight()
	{
		return weight;
	}
	public void setOutfieldFlag(String outfieldFlag) 
	{
		this.outfieldFlag = outfieldFlag;
	}

	public String getOutfieldFlag() 
	{
		return outfieldFlag;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("oldId", getOldId())
            .append("midOid", getMidOid())
            .append("isDelete", getIsDelete())
            .append("isUpdate", getIsUpdate())
            .append("shapeShipId", getShapeShipId())
            .append("assemblyPipeId", getAssemblyPipeId())
            .append("componentId", getComponentId())
            .append("pipeEndFlag", getPipeEndFlag())
            .append("number", getNumber())
            .append("weight", getWeight())
            .append("outfieldFlag", getOutfieldFlag())
            .toString();
    }
}
