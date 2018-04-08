package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="warehousing_list")
public class WarehousingList {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="batch")
    private String batch;

    @Column(name="unit")
    private String unit;

    @Column(name="tray")
    private String tray;

    @Column(name="pipe_id")
    private String pipeId;

    @Column(name="type_specification")
    private String typeSpecification;

    @Column(name="cutting_length")
    private Integer cuttingLength;

    @Column(name="shape")
    private String shape;

    @Column(name="out_marker")
    private String outMarker;

    @Column(name="surface_treat")
    private String surfaceTreat;

    @Column(name="finish_paint")
    private String finishPaint;

    @Column(name="workshop_section")
    private String workshopSection;

    @Column(name="surface_treat_time")
    private Date surfaceTreatTime;

    @Column(name="inspection_time")
    private Date inspectionTime;

    @Column(name="delivery_time")
    private Date deliveryTime;

    @Column(name="allocation_time")
    private Date allocationTime;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public WarehousingList() {
    }

    public WarehousingList(Integer id, String batch, String unit, String tray,
                           String pipeId, String typeSpecification, Integer cuttingLength,
                           String shape, String outMarker, String surfaceTreat,
                           String finishPaint, String workshopSection, Date surfaceTreatTime,
                           Date inspectionTime, Date deliveryTime, Date allocationTime,
                           Integer role, Date updateTime, String extend) {
        this.id = id;
        this.batch = batch;
        this.unit = unit;
        this.tray = tray;
        this.pipeId = pipeId;
        this.typeSpecification = typeSpecification;
        this.cuttingLength = cuttingLength;
        this.shape = shape;
        this.outMarker = outMarker;
        this.surfaceTreat = surfaceTreat;
        this.finishPaint = finishPaint;
        this.workshopSection = workshopSection;
        this.surfaceTreatTime = surfaceTreatTime;
        this.inspectionTime = inspectionTime;
        this.deliveryTime = deliveryTime;
        this.allocationTime = allocationTime;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTray() {
        return tray;
    }

    public void setTray(String tray) {
        this.tray = tray;
    }

    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public String getTypeSpecification() {
        return typeSpecification;
    }

    public void setTypeSpecification(String typeSpecification) {
        this.typeSpecification = typeSpecification;
    }

    public Integer getCuttingLength() {
        return cuttingLength;
    }

    public void setCuttingLength(Integer cuttingLength) {
        this.cuttingLength = cuttingLength;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getOutMarker() {
        return outMarker;
    }

    public void setOutMarker(String outMarker) {
        this.outMarker = outMarker;
    }

    public String getSurfaceTreat() {
        return surfaceTreat;
    }

    public void setSurfaceTreat(String surfaceTreat) {
        this.surfaceTreat = surfaceTreat;
    }

    public String getFinishPaint() {
        return finishPaint;
    }

    public void setFinishPaint(String finishPaint) {
        this.finishPaint = finishPaint;
    }

    public String getWorkshopSection() {
        return workshopSection;
    }

    public void setWorkshopSection(String workshopSection) {
        this.workshopSection = workshopSection;
    }

    public Date getSurfaceTreatTime() {
        return surfaceTreatTime;
    }

    public void setSurfaceTreatTime(Date surfaceTreatTime) {
        this.surfaceTreatTime = surfaceTreatTime;
    }

    public Date getInspectionTime() {
        return inspectionTime;
    }

    public void setInspectionTime(Date inspectionTime) {
        this.inspectionTime = inspectionTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(Date allocationTime) {
        this.allocationTime = allocationTime;
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