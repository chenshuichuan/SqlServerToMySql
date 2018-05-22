package com.ricardo.domain.mysqldata.bean;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="update_mapping")
public class UpdateMapping {

    @Id
    //@GeneratedValue
    @Column(name="id")
    private Integer id;

    @Column(name="OID")
    private int oId;

    @Column(name="MidOID")
    private int midOId;

    @Column(name="tablename")
    private String tablename;

    @Column(name="mysql_id")
    private int mysqlId;

    @Column(name="update_time")
    private Date updateTime;

    public UpdateMapping() {

    }

    public UpdateMapping(Integer id, int OId, int midOId, String tablename, int mysqlId, Date updateTime) {
        this.id = id;
        this.oId = OId;
        this.midOId = midOId;
        this.tablename = tablename;
        this.mysqlId = mysqlId;
        this.updateTime = updateTime;
    }

    public int getMysqlId() {
        return mysqlId;
    }

    public void setMysqlId(int mysqlId) {
        this.mysqlId = mysqlId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getOId() {
        return oId;
    }

    public void setOId(int OId) {
        this.oId = OId;
    }

    public int getMidOId() {
        return midOId;
    }

    public void setMidOId(int midOId) {
        midOId = midOId;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}