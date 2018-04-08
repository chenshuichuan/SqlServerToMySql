package com.ricardo.domain.mysqldata.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pipe_table")
public class PipeTable {

    @Id
    @Column(name="pipe_id")
    private Integer pipeId;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="pipe_name")
    private String pipeName;

    @Column(name="extend")
    private String extend;

    public PipeTable() {
    }

    public PipeTable(Integer pipeId, String shipCode,
                     String batchName, String unitName, String pipeName, String extend) {
        this.pipeId = pipeId;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.unitName = unitName;
        this.pipeName = pipeName;
        this.extend = extend;
    }

    public Integer getPipeId() {
        return pipeId;
    }

    public void setPipeId(Integer pipeId) {
        this.pipeId = pipeId;
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

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}