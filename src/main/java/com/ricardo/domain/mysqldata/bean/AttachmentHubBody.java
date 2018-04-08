package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="attachment_hub_body")
public class AttachmentHubBody {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="header_id")
    private Integer headerId;

    @Column(name="hub_num")
    private String hubNum;

    @Column(name="resource_num")
    private String resourceNum;
    @Column(name="name")
    private String name;

    @Column(name="specification")
    private String specification;
    @Column(name="image_num")
    private String imageNum;
    @Column(name="piece")
    private String piece;

    @Column(name="material")
    private String material;

    @Column(name="number")
    private Integer number;

    @Column(name="lack_num")
    private Integer lackNum;
    @Column(name="last_reply_time")
    private Date lastReplyTime;

    @Column(name="history_reply_time")
    private Integer historyReplyTime;

    @Column(name="remarks")
    private String remarks;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;
    @Column(name="role")
    private Integer role;


    public AttachmentHubBody(Integer id, Integer headerId, String hubNum,
                             String resourceNum, String name, String specification,
                             String imageNum, String piece, String material,
                             Integer number, Integer lackNum, Date lastReplyTime,
                             Integer historyReplyTime, String remarks, Date updateTime,
                             String extend, Integer role) {
        this.id = id;
        this.headerId = headerId;
        this.hubNum = hubNum;
        this.resourceNum = resourceNum;
        this.name = name;
        this.specification = specification;
        this.imageNum = imageNum;
        this.piece = piece;
        this.material = material;
        this.number = number;
        this.lackNum = lackNum;
        this.lastReplyTime = lastReplyTime;
        this.historyReplyTime = historyReplyTime;
        this.remarks = remarks;
        this.updateTime = updateTime;
        this.extend = extend;
        this.role = role;
    }

    public AttachmentHubBody() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHeaderId() {
        return headerId;
    }

    public void setHeaderId(Integer headerId) {
        this.headerId = headerId;
    }

    public String getHubNum() {
        return hubNum;
    }

    public void setHubNum(String hubNum) {
        this.hubNum = hubNum;
    }

    public String getResourceNum() {
        return resourceNum;
    }

    public void setResourceNum(String resourceNum) {
        this.resourceNum = resourceNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getLackNum() {
        return lackNum;
    }

    public void setLackNum(Integer lackNum) {
        this.lackNum = lackNum;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}