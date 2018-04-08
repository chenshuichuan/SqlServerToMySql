package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="plan_table")
public class PlanTable {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="plan_id")
    private Integer planId;

    @Column(name="plan_name")
    private String planName;

    @Column(name="serial_num")
    private Integer serialNum;

    @Column(name="ship_name")
    private String shipName;

    @Column(name="batch")
    private String batch;

    @Column(name="batch_descrip")
    private String batchDescrip;

    @Column(name="stocks")
    private String stocks;

    @Column(name="sections")
    private String sections;

    @Column(name="process_point")
    private String processPoint;

    @Column(name="number")
    private Integer number;

    @Column(name="light_body_pip")
    private Integer lightBodyPip;

    @Column(name="plan_start")
    private Date planStart;

    @Column(name="plan_end")
    private Date planEnd;

    @Column(name="actual_start")
    private Date actualStart;

    @Column(name="actural_end")
    private Date acturalEnd;

    @Column(name="sent_pic_time")
    private Date sentPicTime;

    @Column(name="remark")
    private String remark;

    @Column(name="upldate_time")
    private Date upldateTime;

    @Column(name="role")
    private Integer role;

    @Column(name="extend")
    private String extend;

    @Column(name="plan_cut_finish")
    private Date planCutFinish;

    @Column(name="one_bcut_num")
    private Integer oneBcutNum;

    @Column(name="one_bend_cut")
    private Integer oneBendCut;

    @Column(name="one_ver_cut")
    private Integer oneVerCut;

    @Column(name="one_big_cut")
    private Integer oneBigCut;

    @Column(name="two_spe_bend_cut")
    private Integer twoSpeBendCut;

    @Column(name="two_spe_ver_cut")
    private Integer twoSpeVerCut;

    @Column(name="cut_remark")
    private String cutRemark;

    public PlanTable() {
    }

    public PlanTable(Integer id, Integer planId, String planName, Integer serialNum,
                     String shipName, String batch, String batchDescrip,
                     String stocks, String sections, String processPoint,
                     Integer number, Integer lightBodyPip, Date planStart,
                     Date planEnd, Date actualStart, Date acturalEnd,
                     Date sentPicTime, String remark, Date upldateTime, Integer role,
                     String extend, Date planCutFinish, Integer oneBcutNum, Integer oneBendCut,
                     Integer oneVerCut, Integer oneBigCut, Integer twoSpeBendCut,
                     Integer twoSpeVerCut, String cutRemark) {
        this.id = id;
        this.planId = planId;
        this.planName = planName;
        this.serialNum = serialNum;
        this.shipName = shipName;
        this.batch = batch;
        this.batchDescrip = batchDescrip;
        this.stocks = stocks;
        this.sections = sections;
        this.processPoint = processPoint;
        this.number = number;
        this.lightBodyPip = lightBodyPip;
        this.planStart = planStart;
        this.planEnd = planEnd;
        this.actualStart = actualStart;
        this.acturalEnd = acturalEnd;
        this.sentPicTime = sentPicTime;
        this.remark = remark;
        this.upldateTime = upldateTime;
        this.role = role;
        this.extend = extend;
        this.planCutFinish = planCutFinish;
        this.oneBcutNum = oneBcutNum;
        this.oneBendCut = oneBendCut;
        this.oneVerCut = oneVerCut;
        this.oneBigCut = oneBigCut;
        this.twoSpeBendCut = twoSpeBendCut;
        this.twoSpeVerCut = twoSpeVerCut;
        this.cutRemark = cutRemark;
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

    public Integer getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Integer serialNum) {
        this.serialNum = serialNum;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchDescrip() {
        return batchDescrip;
    }

    public void setBatchDescrip(String batchDescrip) {
        this.batchDescrip = batchDescrip;
    }

    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getSections() {
        return sections;
    }

    public void setSections(String sections) {
        this.sections = sections;
    }

    public String getProcessPoint() {
        return processPoint;
    }

    public void setProcessPoint(String processPoint) {
        this.processPoint = processPoint;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getLightBodyPip() {
        return lightBodyPip;
    }

    public void setLightBodyPip(Integer lightBodyPip) {
        this.lightBodyPip = lightBodyPip;
    }

    public Date getPlanStart() {
        return planStart;
    }

    public void setPlanStart(Date planStart) {
        this.planStart = planStart;
    }

    public Date getPlanEnd() {
        return planEnd;
    }

    public void setPlanEnd(Date planEnd) {
        this.planEnd = planEnd;
    }

    public Date getActualStart() {
        return actualStart;
    }

    public void setActualStart(Date actualStart) {
        this.actualStart = actualStart;
    }

    public Date getActuralEnd() {
        return acturalEnd;
    }

    public void setActuralEnd(Date acturalEnd) {
        this.acturalEnd = acturalEnd;
    }

    public Date getSentPicTime() {
        return sentPicTime;
    }

    public void setSentPicTime(Date sentPicTime) {
        this.sentPicTime = sentPicTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getUpldateTime() {
        return upldateTime;
    }

    public void setUpldateTime(Date upldateTime) {
        this.upldateTime = upldateTime;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public Date getPlanCutFinish() {
        return planCutFinish;
    }

    public void setPlanCutFinish(Date planCutFinish) {
        this.planCutFinish = planCutFinish;
    }

    public Integer getOneBcutNum() {
        return oneBcutNum;
    }

    public void setOneBcutNum(Integer oneBcutNum) {
        this.oneBcutNum = oneBcutNum;
    }

    public Integer getOneBendCut() {
        return oneBendCut;
    }

    public void setOneBendCut(Integer oneBendCut) {
        this.oneBendCut = oneBendCut;
    }

    public Integer getOneVerCut() {
        return oneVerCut;
    }

    public void setOneVerCut(Integer oneVerCut) {
        this.oneVerCut = oneVerCut;
    }

    public Integer getOneBigCut() {
        return oneBigCut;
    }

    public void setOneBigCut(Integer oneBigCut) {
        this.oneBigCut = oneBigCut;
    }

    public Integer getTwoSpeBendCut() {
        return twoSpeBendCut;
    }

    public void setTwoSpeBendCut(Integer twoSpeBendCut) {
        this.twoSpeBendCut = twoSpeBendCut;
    }

    public Integer getTwoSpeVerCut() {
        return twoSpeVerCut;
    }

    public void setTwoSpeVerCut(Integer twoSpeVerCut) {
        this.twoSpeVerCut = twoSpeVerCut;
    }

    public String getCutRemark() {
        return cutRemark;
    }

    public void setCutRemark(String cutRemark) {
        this.cutRemark = cutRemark;
    }
}