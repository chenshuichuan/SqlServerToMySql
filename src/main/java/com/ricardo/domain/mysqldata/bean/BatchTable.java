package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="batch_table")
public class BatchTable {

    @Id
    @Column(name="batch_id")
    private Integer batchId;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="batch_des")
    private String batchDes;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="extend")
    private String extend;

    public BatchTable() {
    }

    public BatchTable(Integer batchId, String batchName, String batchDes,
                      String shipCode, String extend) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.batchDes = batchDes;
        this.shipCode = shipCode;
        this.extend = extend;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchDes() {
        return batchDes;
    }

    public void setBatchDes(String batchDes) {
        this.batchDes = batchDes;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}