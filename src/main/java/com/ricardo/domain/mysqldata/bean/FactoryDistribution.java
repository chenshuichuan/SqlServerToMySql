package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="factory_distribution")
public class FactoryDistribution {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="project_num")
    private Integer projectNum;

    @Column(name="ship_name")
    private String shipName;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="session_id")
    private Integer sessionId;

    @Column(name="batch")
    private String batch;

    @Column(name="need_workshop")
    private String needWorkshop;

    @Column(name="component_id")
    private String componentId;

    @Column(name="component_name")
    private String componentName;

    @Column(name="specification")
    private String specification;

    @Column(name="image_num")
    private String imageNum;

    @Column(name="material")
    private String material;

    @Column(name="piece")
    private String piece;

    @Column(name="supplier")
    private String supplier;

    @Column(name="confirm_time")
    private Date confirmTime;
    @Column(name="begin_restrictions")
    private Date beginRestrictions;

    @Column(name="arrive_restriction")
    private Date arriveRestriction;

    @Column(name="delivery_place")
    private String deliveryPlace;

    @Column(name="need_num")
    private Integer needNum;

    @Column(name="actual_lack_num")
    private Integer actualLackNum;

    @Column(name="actual_arrive_time")
    private Date actualArriveTime;

    @Column(name="remarks")
    private String remarks;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    @Column(name="last_reply_time")
    private Date lastReplyTime;

    @Column(name="history_reply_time")
    private Integer historyReplyTime;

    public FactoryDistribution(Integer id, Integer projectNum, String shipName,
                               String shipCode, Integer sessionId, String batch,
                               String needWorkshop, String componentId, String componentName,
                               String specification, String imageNum, String material,
                               String piece, String supplier, Date confirmTime,
                               Date beginRestrictions, Date arriveRestriction,
                               String deliveryPlace, Integer needNum, Integer actualLackNum,
                               Date actualArriveTime, String remarks, Integer role,
                               Date updateTime, String extend, Date lastReplyTime,
                               Integer historyReplyTime) {
        this.id = id;
        this.projectNum = projectNum;
        this.shipName = shipName;
        this.shipCode = shipCode;
        this.sessionId = sessionId;
        this.batch = batch;
        this.needWorkshop = needWorkshop;
        this.componentId = componentId;
        this.componentName = componentName;
        this.specification = specification;
        this.imageNum = imageNum;
        this.material = material;
        this.piece = piece;
        this.supplier = supplier;
        this.confirmTime = confirmTime;
        this.beginRestrictions = beginRestrictions;
        this.arriveRestriction = arriveRestriction;
        this.deliveryPlace = deliveryPlace;
        this.needNum = needNum;
        this.actualLackNum = actualLackNum;
        this.actualArriveTime = actualArriveTime;
        this.remarks = remarks;
        this.role = role;
        this.updateTime = updateTime;
        this.extend = extend;
        this.lastReplyTime = lastReplyTime;
        this.historyReplyTime = historyReplyTime;
    }

    public FactoryDistribution() {
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

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public Integer getSessionId() {
        return sessionId;
    }

    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getNeedWorkshop() {
        return needWorkshop;
    }

    public void setNeedWorkshop(String needWorkshop) {
        this.needWorkshop = needWorkshop;
    }

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getImageNum() {
        return imageNum;
    }

    public void setImageNum(String imageNum) {
        this.imageNum = imageNum;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Date getBeginRestrictions() {
        return beginRestrictions;
    }

    public void setBeginRestrictions(Date beginRestrictions) {
        this.beginRestrictions = beginRestrictions;
    }

    public Date getArriveRestriction() {
        return arriveRestriction;
    }

    public void setArriveRestriction(Date arriveRestriction) {
        this.arriveRestriction = arriveRestriction;
    }

    public String getDeliveryPlace() {
        return deliveryPlace;
    }

    public void setDeliveryPlace(String deliveryPlace) {
        this.deliveryPlace = deliveryPlace;
    }

    public Integer getNeedNum() {
        return needNum;
    }

    public void setNeedNum(Integer needNum) {
        this.needNum = needNum;
    }

    public Integer getActualLackNum() {
        return actualLackNum;
    }

    public void setActualLackNum(Integer actualLackNum) {
        this.actualLackNum = actualLackNum;
    }

    public Date getActualArriveTime() {
        return actualArriveTime;
    }

    public void setActualArriveTime(Date actualArriveTime) {
        this.actualArriveTime = actualArriveTime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Date getLastReplyTime() {
        return lastReplyTime;
    }

    public void setLastReplyTime(Date lastReplyTime) {
        this.lastReplyTime = lastReplyTime;
    }

    public Integer getHistoryReplyTime() {
        return historyReplyTime;
    }

    public void setHistoryReplyTime(Integer historyReplyTime) {
        this.historyReplyTime = historyReplyTime;
    }
}