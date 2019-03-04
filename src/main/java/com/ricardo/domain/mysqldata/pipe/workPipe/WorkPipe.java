package com.ricardo.domain.mysqldata.pipe.workPipe;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.util.Date;

/**
 * 管件表 pipe_work_pipe
 * 
 * @author ricardo
 * @date 2019-03-04
 */
@Entity
@Table(name="pipe_work_pipe")
public class WorkPipe extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 装配管号ID */
    @Column(name = "id")
	@Id
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
	/** 设计区号 */
    @Column(name = "area_code")
	private String areaCode;
	/** 分段号 */
    @Column(name = "segment_code")
	private String segmentCode;
	/** 托盘号 */
    @Column(name = "tray_code")
	private String trayCode;
	/** 装配管号 */
    @Column(name = "assembly_code")
	private String assemblyCode;
	/** 集配管号 */
    @Column(name = "set_code")
	private String setCode;
	/** 号船id */
    @Column(name = "call_shipId")
	private Integer callShipId;
	/** 装配管id */
    @Column(name = "assembly_pipe_id")
	private Integer assemblyPipeId;
	/** 管子通径 */
    @Column(name = "pipe_diameter")
	private double pipeDiameter;
	/** 管子外径 */
    @Column(name = "pipe_out_diameter")
	private String pipeOutDiameter;
	/** 管子壁厚 */
    @Column(name = "pipe_thickness")
	private String pipeThickness;
	/** 管子材质 */
    @Column(name = "pipe_material")
	private String pipeMaterial;
	/** 管材级别 */
    @Column(name = "pipe_material_level")
	private String pipeMaterialLevel;
	/** 管段形态 */
    @Column(name = "pipe_shape")
	private String pipeShape;
	/** 表处简称 */
    @Column(name = "surface_treat")
	private String surfaceTreat;
	/** 表面处理 */
    @Column(name = "surface_name")
	private String surfaceName;
	/** 下料长 */
    @Column(name = "cut_length")
	private double cutLength;
	/** 外场装配标记 */
    @Column(name = "outfield")
	private String outfield;
	/** 修改时间 */
    @Column(name = "update_time")
	private Date updateTime;

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
	public void setAreaCode(String areaCode) 
	{
		this.areaCode = areaCode;
	}

	public String getAreaCode() 
	{
		return areaCode;
	}
	public void setSegmentCode(String segmentCode) 
	{
		this.segmentCode = segmentCode;
	}

	public String getSegmentCode() 
	{
		return segmentCode;
	}
	public void setTrayCode(String trayCode) 
	{
		this.trayCode = trayCode;
	}

	public String getTrayCode() 
	{
		return trayCode;
	}
	public void setAssemblyCode(String assemblyCode) 
	{
		this.assemblyCode = assemblyCode;
	}

	public String getAssemblyCode() 
	{
		return assemblyCode;
	}
	public void setSetCode(String setCode) 
	{
		this.setCode = setCode;
	}

	public String getSetCode() 
	{
		return setCode;
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
	public void setPipeDiameter(double pipeDiameter)
	{
		this.pipeDiameter = pipeDiameter;
	}

	public double getPipeDiameter()
	{
		return pipeDiameter;
	}
	public void setPipeOutDiameter(String pipeOutDiameter) 
	{
		this.pipeOutDiameter = pipeOutDiameter;
	}

	public String getPipeOutDiameter() 
	{
		return pipeOutDiameter;
	}
	public void setPipeThickness(String pipeThickness) 
	{
		this.pipeThickness = pipeThickness;
	}

	public String getPipeThickness() 
	{
		return pipeThickness;
	}
	public void setPipeMaterial(String pipeMaterial) 
	{
		this.pipeMaterial = pipeMaterial;
	}

	public String getPipeMaterial() 
	{
		return pipeMaterial;
	}
	public void setPipeMaterialLevel(String pipeMaterialLevel) 
	{
		this.pipeMaterialLevel = pipeMaterialLevel;
	}

	public String getPipeMaterialLevel() 
	{
		return pipeMaterialLevel;
	}
	public void setPipeShape(String pipeShape) 
	{
		this.pipeShape = pipeShape;
	}

	public String getPipeShape() 
	{
		return pipeShape;
	}
	public void setSurfaceTreat(String surfaceTreat) 
	{
		this.surfaceTreat = surfaceTreat;
	}

	public String getSurfaceTreat() 
	{
		return surfaceTreat;
	}
	public void setSurfaceName(String surfaceName) 
	{
		this.surfaceName = surfaceName;
	}

	public String getSurfaceName() 
	{
		return surfaceName;
	}
	public void setCutLength(double cutLength)
	{
		this.cutLength = cutLength;
	}

	public double getCutLength()
	{
		return cutLength;
	}
	public void setOutfield(String outfield) 
	{
		this.outfield = outfield;
	}

	public String getOutfield() 
	{
		return outfield;
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

	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("shipCode", getShipCode())
            .append("batchId", getBatchId())
            .append("unitId", getUnitId())
            .append("areaCode", getAreaCode())
            .append("segmentCode", getSegmentCode())
            .append("trayCode", getTrayCode())
            .append("assemblyCode", getAssemblyCode())
            .append("setCode", getSetCode())
            .append("callShipId", getCallShipId())
            .append("assemblyPipeId", getAssemblyPipeId())
            .append("pipeDiameter", getPipeDiameter())
            .append("pipeOutDiameter", getPipeOutDiameter())
            .append("pipeThickness", getPipeThickness())
            .append("pipeMaterial", getPipeMaterial())
            .append("pipeMaterialLevel", getPipeMaterialLevel())
            .append("pipeShape", getPipeShape())
            .append("surfaceTreat", getSurfaceTreat())
            .append("surfaceName", getSurfaceName())
            .append("cutLength", getCutLength())
            .append("outfield", getOutfield())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
