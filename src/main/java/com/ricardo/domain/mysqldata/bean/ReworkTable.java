package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="rework_table")
public class ReworkTable {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="plan_id")
    private Integer planId;

    @Column(name="plan_name")
    private String planName;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="pipe_id")
    private String pipeId;

    @Column(name="work_place")
    private String workPlace;

    @Column(name="dealer_id")
    private Integer dealerId;

    @Column(name="worker_id")
    private Integer workerId;

    @Column(name="return_time")
    private Date returnTime;

    @Column(name="extend")
    private String extend;

    @Column(name="reason")
    private String reason;

    public ReworkTable() {
    }

    public ReworkTable(Integer id, Integer planId, String planName, String shipCode,
                       String batchName, String pipeId, String workPlace, Integer dealerId,
                       Integer workerId, Date returnTime, String extend, String reason) {
        this.id = id;
        this.planId = planId;
        this.planName = planName;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.pipeId = pipeId;
        this.workPlace = workPlace;
        this.dealerId = dealerId;
        this.workerId = workerId;
        this.returnTime = returnTime;
        this.extend = extend;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
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

    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Integer getDealerId() {
        return dealerId;
    }

    public void setDealerId(Integer dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Date getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(Date returnTime) {
        this.returnTime = returnTime;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}