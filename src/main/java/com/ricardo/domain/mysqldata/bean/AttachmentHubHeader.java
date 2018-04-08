package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="attachment_hub_header")
public class AttachmentHubHeader {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="project_num")
    private Integer projectNum;

    @Column(name="ship_name")
    private String shipName;

    @Column(name="batch")
    private String batch;

    @Column(name="hub_num")
    private String hubNum;

    @Column(name="session_id")
    private Integer sessionId;

    @Column(name="warehouse_name")
    private String warehouseName;

    @Column(name="warehouse_manager")
    private String warehouseManager;

    @Column(name="contact")
    private String contact;

    @Column(name="place")
    private String place;

    @Column(name="receiver")
    private String receiver;

    @Column(name="receive_department")
    private String receiveDepartment;

    @Column(name="receive_time")
    private Date receiveTime;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="role")
    private Integer role;

    @Column(name="extend")
    private String extend;

    public AttachmentHubHeader(Integer id, Integer projectNum, String shipName,
                               String batch, String hubNum, Integer sessionId,
                               String warehouseName, String warehouseManager,
                               String contact, String place, String receiver,
                               String receiveDepartment, Date receiveTime,
                               Date updateTime, Integer role, String extend) {
        this.id = id;
        this.projectNum = projectNum;
        this.shipName = shipName;
        this.batch = batch;
        this.hubNum = hubNum;
        this.sessionId = sessionId;
        this.warehouseName = warehouseName;
        this.warehouseManager = warehouseManager;
        this.contact = contact;
        this.place = place;
        this.receiver = receiver;
        this.receiveDepartment = receiveDepartment;
        this.receiveTime = receiveTime;
        this.updateTime = updateTime;
        this.role = role;
        this.extend = extend;
    }

    public AttachmentHubHeader() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
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

    public String getHubNum() {
        return hubNum;
    }

    public void setHubNum(String hubNum) {
        this.hubNum = hubNum;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseManager() {
        return warehouseManager;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiveDepartment() {
        return receiveDepartment;
    }

    public void setReceiveDepartment(String receiveDepartment) {
        this.receiveDepartment = receiveDepartment;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
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

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}