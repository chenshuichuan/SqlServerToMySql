package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="pipe_processing")
public class PipeProcessing {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="unit_id")
    private Integer unitId;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="pipe_num")
    private String pipeNum;

    @Column(name="process_situation")
    private Integer processSituation;

    @Column(name="state")
    private Integer state;

    @Column(name="cut_worker")
    private Integer cutWorker;

    @Column(name="bend_worker")
    private Integer bendWorker;

    @Column(name="proofread_worker")
    private Integer proofreadWorker;

    @Column(name="weld_worker")
    private Integer weldWorker;

    @Column(name="process_number")
    private Integer processNumber;

    @Column(name="cut_time")
    private Date cutTime;


    @Column(name="bend_time")
    private Date bendTime;

    @Column(name="proofread_time")
    private Date proofreadTime;

    @Column(name="weld_time")
    private Date weldTime;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public PipeProcessing() {
    }

    public PipeProcessing(Integer id, String shipCode, String batchName, Integer unitId,
                          String unitName, String pipeNum, Integer processSituation,
                          Integer state, Integer cutWorker, Integer bendWorker,
                          Integer proofreadWorker, Integer weldWorker, Integer processNumber,
                          Date cutTime, Date bendTime, Date proofreadTime, Date weldTime,
                          Integer role, Date updateTime, String extend) {
        this.id = id;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.unitId = unitId;
        this.unitName = unitName;
        this.pipeNum = pipeNum;
        this.processSituation = processSituation;
        this.state = state;
        this.cutWorker = cutWorker;
        this.bendWorker = bendWorker;
        this.proofreadWorker = proofreadWorker;
        this.weldWorker = weldWorker;
        this.processNumber = processNumber;
        this.cutTime = cutTime;
        this.bendTime = bendTime;
        this.proofreadTime = proofreadTime;
        this.weldTime = weldTime;
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

    public String getPipeNum() {
        return pipeNum;
    }

    public void setPipeNum(String pipeNum) {
        this.pipeNum = pipeNum;
    }

    public Integer getProcessSituation() {
        return processSituation;
    }

    public void setProcessSituation(Integer processSituation) {
        this.processSituation = processSituation;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCutWorker() {
        return cutWorker;
    }

    public void setCutWorker(Integer cutWorker) {
        this.cutWorker = cutWorker;
    }

    public Integer getBendWorker() {
        return bendWorker;
    }

    public void setBendWorker(Integer bendWorker) {
        this.bendWorker = bendWorker;
    }

    public Integer getProofreadWorker() {
        return proofreadWorker;
    }

    public void setProofreadWorker(Integer proofreadWorker) {
        this.proofreadWorker = proofreadWorker;
    }

    public Integer getWeldWorker() {
        return weldWorker;
    }

    public void setWeldWorker(Integer weldWorker) {
        this.weldWorker = weldWorker;
    }

    public Integer getProcessNumber() {
        return processNumber;
    }

    public void setProcessNumber(Integer processNumber) {
        this.processNumber = processNumber;
    }

    public Date getCutTime() {
        return cutTime;
    }

    public void setCutTime(Date cutTime) {
        this.cutTime = cutTime;
    }

    public Date getBendTime() {
        return bendTime;
    }

    public void setBendTime(Date bendTime) {
        this.bendTime = bendTime;
    }

    public Date getProofreadTime() {
        return proofreadTime;
    }

    public void setProofreadTime(Date proofreadTime) {
        this.proofreadTime = proofreadTime;
    }

    public Date getWeldTime() {
        return weldTime;
    }

    public void setWeldTime(Date weldTime) {
        this.weldTime = weldTime;
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