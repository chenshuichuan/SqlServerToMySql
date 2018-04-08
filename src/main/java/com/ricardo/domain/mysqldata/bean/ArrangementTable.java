package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="arrangement_table")
public class ArrangementTable {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="section_id")
    private Integer sectionId;

    @Column(name="workstage_id")
    private Integer workstageId;

    @Column(name="workplace_id")
    private Integer workplaceId;

    @Column(name="unit_id")
    private Integer unitId;

    @Column(name="state")
    private Integer state;

    @Column(name="arranger")
    private Integer arranger;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="role")
    private Integer role;

    public ArrangementTable(Integer id, Integer sectionId, Integer workstageId,
                            Integer workplaceId,
                            Integer unitId, Integer state, Integer arranger,
                            Date updateTime, Integer role) {
        this.id = id;
        this.sectionId = sectionId;
        this.workstageId = workstageId;
        this.workplaceId = workplaceId;
        this.unitId = unitId;
        this.state = state;
        this.arranger = arranger;
        this.updateTime = updateTime;
        this.role = role;
    }

    public ArrangementTable() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getWorkstageId() {
        return workstageId;
    }

    public void setWorkstageId(Integer workstageId) {
        this.workstageId = workstageId;
    }

    public Integer getWorkplaceId() {
        return workplaceId;
    }

    public void setWorkplaceId(Integer workplaceId) {
        this.workplaceId = workplaceId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getArranger() {
        return arranger;
    }

    public void setArranger(Integer arranger) {
        this.arranger = arranger;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}