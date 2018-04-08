package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="departments")
public class Departments {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="dname")
    private String dname;

    @Column(name="lever")
    private Integer lever;

    @Column(name="up_department")
    private Integer upDepartment;

    @Column(name="description")
    private String description;

    @Column(name="updatat_time")
    private Date updatatTime;

    @Column(name="workstage")
    private Integer workstage;

    public Departments() {
    }

    public Departments(Integer id, String dname, Integer lever,
                       Integer upDepartment, String description, Date updatatTime,
                       Integer workstage) {
        this.id = id;
        this.dname = dname;
        this.lever = lever;
        this.upDepartment = upDepartment;
        this.description = description;
        this.updatatTime = updatatTime;
        this.workstage = workstage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getLever() {
        return lever;
    }

    public void setLever(Integer lever) {
        this.lever = lever;
    }

    public Integer getUpDepartment() {
        return upDepartment;
    }

    public void setUpDepartment(Integer upDepartment) {
        this.upDepartment = upDepartment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatatTime() {
        return updatatTime;
    }

    public void setUpdatatTime(Date updatatTime) {
        this.updatatTime = updatatTime;
    }

    public Integer getWorkstage() {
        return workstage;
    }

    public void setWorkstage(Integer workstage) {
        this.workstage = workstage;
    }
}