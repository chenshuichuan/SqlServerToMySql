package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="workers")
public class Workers {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="code_scann_id")
    private Integer codeScannId;

    @Column(name="password")
    private String password;

    @Column(name="job")
    private String job;

    @Column(name="working_hours")
    private Float workingHours;

    @Column(name="role")
    private Integer role;

    @Column(name="section_id")
    private Integer sectionId;

    @Column(name="depertment")
    private String depertment;

    @Column(name="update_time")
    private Date updateTime;
    @Column(name="extend")
    private String extend;

    public Workers() {
    }

    public Workers(Integer id, String name, Integer codeScannId,
                   String password, String job, Float workingHours,
                   Integer role, Integer sectionId, String depertment,
                   Date updateTime, String extend) {
        this.id = id;
        this.name = name;
        this.codeScannId = codeScannId;
        this.password = password;
        this.job = job;
        this.workingHours = workingHours;
        this.role = role;
        this.sectionId = sectionId;
        this.depertment = depertment;
        this.updateTime = updateTime;
        this.extend = extend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodeScannId() {
        return codeScannId;
    }

    public void setCodeScannId(Integer codeScannId) {
        this.codeScannId = codeScannId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(Float workingHours) {
        this.workingHours = workingHours;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
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