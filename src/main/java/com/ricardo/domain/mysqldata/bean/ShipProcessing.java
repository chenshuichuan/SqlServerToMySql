package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="ship_processing")
public class ShipProcessing {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="ship_name")
    private String shipName;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="total_num")
    private Integer totalNum;

    @Column(name="not_begin_batch")
    private String notBeginBatch;

    @Column(name="begined_batch")
    private String beginedBatch;

    @Column(name="finish_batch")
    private String finishBatch;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public ShipProcessing() {
    }

    public ShipProcessing(Integer id, String shipName, String shipCode,
                          Integer totalNum, String notBeginBatch,
                          String beginedBatch, String finishBatch,
                          Integer role, Date updateTime, String extend) {
        this.id = id;
        this.shipName = shipName;
        this.shipCode = shipCode;
        this.totalNum = totalNum;
        this.notBeginBatch = notBeginBatch;
        this.beginedBatch = beginedBatch;
        this.finishBatch = finishBatch;
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

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getNotBeginBatch() {
        return notBeginBatch;
    }

    public void setNotBeginBatch(String notBeginBatch) {
        this.notBeginBatch = notBeginBatch;
    }

    public String getBeginedBatch() {
        return beginedBatch;
    }

    public void setBeginedBatch(String beginedBatch) {
        this.beginedBatch = beginedBatch;
    }

    public String getFinishBatch() {
        return finishBatch;
    }

    public void setFinishBatch(String finishBatch) {
        this.finishBatch = finishBatch;
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