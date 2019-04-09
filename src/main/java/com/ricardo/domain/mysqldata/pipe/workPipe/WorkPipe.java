package com.ricardo.domain.mysqldata.pipe.workPipe;

import com.ricardo.domain.mysqldata.bean.BaseEntity;
import com.ricardo.domain.sqlserverdata.bean.SqlWorkPipe;
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
@Table(name = "pipe_work_pipe")
public class WorkPipe extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 装配管号ID
     */
    @Column(name = "id")
    @Id
    private Integer id;

    /**
     * 号船id
     */
    @Column(name = "shape_ship_id")
    private Integer callShipId;
    /**
     * 装配管id
     */
    @Column(name = "assembly_pipe_id")
    private Integer assemblyPipeId;
    /**
     * 管子通径
     */
    @Column(name = "pipe_diameter")
    private double pipeDiameter;
    /**
     * 管子外径
     */
    @Column(name = "pipe_out_diameter")
    private double pipeOutDiameter;
    /**
     * 管子壁厚
     */
    @Column(name = "pipe_thickness")
    private double pipeThickness;
    /**
     * 管子材质
     */
    @Column(name = "pipe_material")
    private String pipeMaterial;
    /**
     * 管材级别
     */
    @Column(name = "pipe_material_level")
    private String pipeMaterialLevel;
    /**
     * 管段形态
     */
    @Column(name = "pipe_shape")
    private String pipeShape;
    /**
     * 表处简称
     */
    @Column(name = "surface_treat")
    private String surfaceTreat;

    /**
     * 下料长
     */
    @Column(name = "cut_length")
    private Integer cutLength;
    /**
     * 外场装配标记
     */
    @Column(name = "outfield")
    private String outfield;
    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    public WorkPipe() {
    }

    public WorkPipe(SqlWorkPipe sqlWorkPipe) {
        this.id = sqlWorkPipe.getOldId();
        this.callShipId = sqlWorkPipe.getCallShipId();
        this.assemblyPipeId = sqlWorkPipe.getAssemblyId();
        this.pipeDiameter = sqlWorkPipe.getPipeDiameter();
        this.pipeOutDiameter = sqlWorkPipe.getPipeOutsideDiameter();
        this.pipeThickness = sqlWorkPipe.getPipeThickness();
        this.pipeMaterial = sqlWorkPipe.getPipeMaterial();
        this.pipeMaterialLevel = sqlWorkPipe.getPipeMaterialLevel();
        this.pipeShape = sqlWorkPipe.getPipeSectionShape();
        this.surfaceTreat = sqlWorkPipe.getSurfaceTreat();

        this.cutLength = sqlWorkPipe.getCuttingLength() == null ? 0 : sqlWorkPipe.getCuttingLength().intValue();
        this.outfield = sqlWorkPipe.getOutfieldAssemblyFlag();
        this.updateTime = new Date();
    }


    public WorkPipe(Integer id, Integer callShipId, Integer assemblyPipeId, double pipeDiameter, double pipeOutDiameter,
                    double pipeThickness, String pipeMaterial, String pipeMaterialLevel, String pipeShape, String surfaceTreat,
                    Integer cutLength, String outfield, Date updateTime) {
        this.id = id;
        this.callShipId = callShipId;
        this.assemblyPipeId = assemblyPipeId;
        this.pipeDiameter = pipeDiameter;
        this.pipeOutDiameter = pipeOutDiameter;
        this.pipeThickness = pipeThickness;
        this.pipeMaterial = pipeMaterial;
        this.pipeMaterialLevel = pipeMaterialLevel;
        this.pipeShape = pipeShape;
        this.surfaceTreat = surfaceTreat;
        this.cutLength = cutLength;
        this.outfield = outfield;
        this.updateTime = updateTime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCallShipId(Integer callShipId) {
        this.callShipId = callShipId;
    }

    public Integer getCallShipId() {
        return callShipId;
    }

    public void setAssemblyPipeId(Integer assemblyPipeId) {
        this.assemblyPipeId = assemblyPipeId;
    }

    public Integer getAssemblyPipeId() {
        return assemblyPipeId;
    }

    public void setPipeDiameter(double pipeDiameter) {
        this.pipeDiameter = pipeDiameter;
    }

    public double getPipeDiameter() {
        return pipeDiameter;
    }

    public void setPipeOutDiameter(double pipeOutDiameter) {
        this.pipeOutDiameter = pipeOutDiameter;
    }

    public double getPipeOutDiameter() {
        return pipeOutDiameter;
    }

    public void setPipeThickness(double pipeThickness) {
        this.pipeThickness = pipeThickness;
    }

    public double getPipeThickness() {
        return pipeThickness;
    }

    public void setPipeMaterial(String pipeMaterial) {
        this.pipeMaterial = pipeMaterial;
    }

    public String getPipeMaterial() {
        return pipeMaterial;
    }

    public void setPipeMaterialLevel(String pipeMaterialLevel) {
        this.pipeMaterialLevel = pipeMaterialLevel;
    }

    public String getPipeMaterialLevel() {
        return pipeMaterialLevel;
    }

    public void setPipeShape(String pipeShape) {
        this.pipeShape = pipeShape;
    }

    public String getPipeShape() {
        return pipeShape;
    }

    public void setSurfaceTreat(String surfaceTreat) {
        this.surfaceTreat = surfaceTreat;
    }

    public String getSurfaceTreat() {
        return surfaceTreat;
    }

    public void setCutLength(Integer cutLength) {
        this.cutLength = cutLength;
    }

    public double getCutLength() {
        return cutLength;
    }

    public void setOutfield(String outfield) {
        this.outfield = outfield;
    }

    public String getOutfield() {
        return outfield;
    }

    @Override
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public Date getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("callShipId", getCallShipId())
                .append("assemblyPipeId", getAssemblyPipeId())
                .append("pipeDiameter", getPipeDiameter())
                .append("pipeOutDiameter", getPipeOutDiameter())
                .append("pipeThickness", getPipeThickness())
                .append("pipeMaterial", getPipeMaterial())
                .append("pipeMaterialLevel", getPipeMaterialLevel())
                .append("pipeShape", getPipeShape())
                .append("surfaceTreat", getSurfaceTreat())
                .append("cutLength", getCutLength())
                .append("outfield", getOutfield())
                .append("updateTime", getUpdateTime())
                .toString();
    }
}
