package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="unit_processing")
public class UnitProcessing {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="plan_id")
    private Integer planId;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="ship_name")
    private String shipName;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="session_id")
    private Integer sessionId;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="process_order")
    private Integer processOrder;

    @Column(name="pipe_shape")
    private String pipeShape;

    @Column(name="total_num")
    private Integer totalNum;

    @Column(name="process_situation")
    private Integer processSituation;

    @Column(name="state")
    private Integer state;

    @Column(name="cut_begin_time")
    private Date cutBeginTime;

    @Column(name="cutted_num")
    private Integer cuttedNum;

    @Column(name="cut_end_time")
    private Date cutEndTime;

    @Column(name="bend_begin_time")
    private Date bendBeginTime;

    @Column(name="bended_num")
    private Integer bendedNum;

    @Column(name="bend_end_time")
    private Date bendEndTime;

    @Column(name="proofread_begin_time")
    private Date proofreadBeginTime;

    @Column(name="proofreaded_num")
    private Integer proofreadedNum;

    @Column(name="proofread_end_time")
    private Date proofreadEndTime;

    @Column(name="weld_begin_time")
    private Date weldBeginTime;

    @Column(name="welded_num")
    private Integer weldedNum;

    @Column(name="weld_end_time")
    private Date weldEndTime;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public UnitProcessing() {
    }

    public UnitProcessing(Integer id, Integer planId, String shipCode, String shipName,
                          String batchName, Integer sessionId, String unitName,
                          Integer processOrder, String pipeShape,
                          Integer totalNum, Integer processSituation,
                          Integer state, Date cutBeginTime, Integer cuttedNum,
                          Date cutEndTime, Date bendBeginTime,
                          Integer bendedNum, Date bendEndTime, Date proofreadBeginTime,
                          Integer proofreadedNum, Date proofreadEndTime, Date weldBeginTime,
                          Integer weldedNum, Date weldEndTime, Integer role, Date updateTime,
                          String extend) {
        this.id = id;
        this.planId = planId;
        this.shipCode = shipCode;
        this.shipName = shipName;
        this.batchName = batchName;
        this.sessionId = sessionId;
        this.unitName = unitName;
        this.processOrder = processOrder;
        this.pipeShape = pipeShape;
        this.totalNum = totalNum;
        this.processSituation = processSituation;
        this.state = state;
        this.cutBeginTime = cutBeginTime;
        this.cuttedNum = cuttedNum;
        this.cutEndTime = cutEndTime;
        this.bendBeginTime = bendBeginTime;
        this.bendedNum = bendedNum;
        this.bendEndTime = bendEndTime;
        this.proofreadBeginTime = proofreadBeginTime;
        this.proofreadedNum = proofreadedNum;
        this.proofreadEndTime = proofreadEndTime;
        this.weldBeginTime = weldBeginTime;
        this.weldedNum = weldedNum;
        this.weldEndTime = weldEndTime;
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

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getProcessOrder() {
        return processOrder;
    }

    public void setProcessOrder(Integer processOrder) {
        this.processOrder = processOrder;
    }

    public String getPipeShape() {
        return pipeShape;
    }

    public void setPipeShape(String pipeShape) {
        this.pipeShape = pipeShape;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
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

    public Date getCutBeginTime() {
        return cutBeginTime;
    }

    public void setCutBeginTime(Date cutBeginTime) {
        this.cutBeginTime = cutBeginTime;
    }

    public Integer getCuttedNum() {
        return cuttedNum;
    }

    public void setCuttedNum(Integer cuttedNum) {
        this.cuttedNum = cuttedNum;
    }

    public Date getCutEndTime() {
        return cutEndTime;
    }

    public void setCutEndTime(Date cutEndTime) {
        this.cutEndTime = cutEndTime;
    }

    public Date getBendBeginTime() {
        return bendBeginTime;
    }

    public void setBendBeginTime(Date bendBeginTime) {
        this.bendBeginTime = bendBeginTime;
    }

    public Integer getBendedNum() {
        return bendedNum;
    }

    public void setBendedNum(Integer bendedNum) {
        this.bendedNum = bendedNum;
    }

    public Date getBendEndTime() {
        return bendEndTime;
    }

    public void setBendEndTime(Date bendEndTime) {
        this.bendEndTime = bendEndTime;
    }

    public Date getProofreadBeginTime() {
        return proofreadBeginTime;
    }

    public void setProofreadBeginTime(Date proofreadBeginTime) {
        this.proofreadBeginTime = proofreadBeginTime;
    }

    public Integer getProofreadedNum() {
        return proofreadedNum;
    }

    public void setProofreadedNum(Integer proofreadedNum) {
        this.proofreadedNum = proofreadedNum;
    }

    public Date getProofreadEndTime() {
        return proofreadEndTime;
    }

    public void setProofreadEndTime(Date proofreadEndTime) {
        this.proofreadEndTime = proofreadEndTime;
    }

    public Date getWeldBeginTime() {
        return weldBeginTime;
    }

    public void setWeldBeginTime(Date weldBeginTime) {
        this.weldBeginTime = weldBeginTime;
    }

    public Integer getWeldedNum() {
        return weldedNum;
    }

    public void setWeldedNum(Integer weldedNum) {
        this.weldedNum = weldedNum;
    }

    public Date getWeldEndTime() {
        return weldEndTime;
    }

    public void setWeldEndTime(Date weldEndTime) {
        this.weldEndTime = weldEndTime;
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