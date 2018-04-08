package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unit_table")
public class UnitTable {

    @Id
    @Column(name="unit_id")
    private Integer unitId;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="extend")
    private String extend;

    public UnitTable() {
    }

    public UnitTable(Integer unitId, String unitName, String shipCode, String batchName, String extend) {
        this.unitId = unitId;
        this.unitName = unitName;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.extend = extend;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}