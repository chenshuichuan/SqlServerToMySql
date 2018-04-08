package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="machining_list")
public class MachiningList {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="unit_id")
    private Integer unitId;


    @Column(name="unit")
    private String unit;

    @Column(name="area_code")
    private Integer areaCode;

    @Column(name="pipe_material")
    private String pipeMaterial;

    @Column(name="no_installed")
    private Integer noInstalled;

    @Column(name="cutting_length")
    private Integer cuttingLength;

    @Column(name="pipe_id")
    private String pipeId;

    @Column(name="shape")
    private String shape;

    @Column(name="surface_treat")
    private String surfaceTreat;

    @Column(name="surface_name")
    private String surfaceName;

    @Column(name="pipe_level")
    private Integer pipeLevel;

    @Column(name="outfield")
    private Integer outfield;

    @Column(name="isCutted")
    private Boolean isCutted;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;
    @Column(name="extend")
    private String extend;

    public MachiningList() {
    }

    public MachiningList(Integer id, String batchName, Integer unitId, String unit,
                         Integer areaCode, String pipeMaterial, Integer noInstalled,
                         Integer cuttingLength, String pipeId, String shape,
                         String surfaceTreat, String surfaceName, Integer pipeLevel,
                         Integer outfield, Boolean isCutted, Integer role, Date updateTime,
                         String extend) {
        this.id = id;
        this.batchName = batchName;
        this.unitId = unitId;
        this.unit = unit;
        this.areaCode = areaCode;
        this.pipeMaterial = pipeMaterial;
        this.noInstalled = noInstalled;
        this.cuttingLength = cuttingLength;
        this.pipeId = pipeId;
        this.shape = shape;
        this.surfaceTreat = surfaceTreat;
        this.surfaceName = surfaceName;
        this.pipeLevel = pipeLevel;
        this.outfield = outfield;
        this.isCutted = isCutted;
        this.role = role;
        this.updateTime = updateTime;
        this.extend = extend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public String getPipeMaterial() {
        return pipeMaterial;
    }

    public void setPipeMaterial(String pipeMaterial) {
        this.pipeMaterial = pipeMaterial;
    }

    public Integer getNoInstalled() {
        return noInstalled;
    }

    public void setNoInstalled(Integer noInstalled) {
        this.noInstalled = noInstalled;
    }

    public Integer getCuttingLength() {
        return cuttingLength;
    }

    public void setCuttingLength(Integer cuttingLength) {
        this.cuttingLength = cuttingLength;
    }

    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSurfaceTreat() {
        return surfaceTreat;
    }

    public void setSurfaceTreat(String surfaceTreat) {
        this.surfaceTreat = surfaceTreat;
    }

    public String getSurfaceName() {
        return surfaceName;
    }

    public void setSurfaceName(String surfaceName) {
        this.surfaceName = surfaceName;
    }

    public Integer getPipeLevel() {
        return pipeLevel;
    }

    public void setPipeLevel(Integer pipeLevel) {
        this.pipeLevel = pipeLevel;
    }

    public Integer getOutfield() {
        return outfield;
    }

    public void setOutfield(Integer outfield) {
        this.outfield = outfield;
    }

    public Boolean getIsCutted() {
        return isCutted;
    }

    public void setIsCutted(Boolean isCutted) {
        this.isCutted = isCutted;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}