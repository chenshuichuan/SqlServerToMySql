package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="batch_processing")
public class BatchProcessing {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="total_num")
    private Integer totalNum;

    @Column(name="cut_num")
    private Integer cutNum;

    @Column(name="bend_num")
    private Integer bendNum;

    @Column(name="proofread_num")
    private Integer proofreadNum;

    @Column(name="weld_num")
    private Integer weldNum;

    @Column(name="upload_time")
    private Date uploadTime;

    @Column(name="isCutted")
    private Boolean isCutted;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public BatchProcessing() {
    }

    public BatchProcessing(Integer id, String shipCode, String batchName,
                           Integer totalNum, Integer cutNum, Integer bendNum,
                           Integer proofreadNum, Integer weldNum, Date uploadTime,
                           Boolean isCutted, Integer role, Date updateTime,
                           String extend) {
        this.id = id;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.totalNum = totalNum;
        this.cutNum = cutNum;
        this.bendNum = bendNum;
        this.proofreadNum = proofreadNum;
        this.weldNum = weldNum;
        this.uploadTime = uploadTime;
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

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getCutNum() {
        return cutNum;
    }

    public void setCutNum(Integer cutNum) {
        this.cutNum = cutNum;
    }

    public Integer getBendNum() {
        return bendNum;
    }

    public void setBendNum(Integer bendNum) {
        this.bendNum = bendNum;
    }

    public Integer getProofreadNum() {
        return proofreadNum;
    }

    public void setProofreadNum(Integer proofreadNum) {
        this.proofreadNum = proofreadNum;
    }

    public Integer getWeldNum() {
        return weldNum;
    }

    public void setWeldNum(Integer weldNum) {
        this.weldNum = weldNum;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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