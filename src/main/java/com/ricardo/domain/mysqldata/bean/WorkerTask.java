package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="worker_task")

public class WorkerTask {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="worker_id")
    private Integer workerId;

    @Column(name="worker_name")
    private String workerName;

    @Column(name="cut_unit")
    private String cutUnit;
    @Column(name="bend_unit")
    private String bendUnit;

    @Column(name="proofread_unit")
    private String proofreadUnit;

    @Column(name="weld_unit")
    private String weldUnit;

    @Column(name="role")
    private Integer role;

    @Column(name="update_time")
    private Date updateTime;

    @Column(name="extend")
    private String extend;

    public WorkerTask() {
    }

    public WorkerTask(Integer id, Integer workerId, String workerName,
                      String cutUnit, String bendUnit, String proofreadUnit,
                      String weldUnit, Integer role, Date updateTime, String extend) {
        this.id = id;
        this.workerId = workerId;
        this.workerName = workerName;
        this.cutUnit = cutUnit;
        this.bendUnit = bendUnit;
        this.proofreadUnit = proofreadUnit;
        this.weldUnit = weldUnit;
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

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getCutUnit() {
        return cutUnit;
    }

    public void setCutUnit(String cutUnit) {
        this.cutUnit = cutUnit;
    }

    public String getBendUnit() {
        return bendUnit;
    }

    public void setBendUnit(String bendUnit) {
        this.bendUnit = bendUnit;
    }

    public String getProofreadUnit() {
        return proofreadUnit;
    }

    public void setProofreadUnit(String proofreadUnit) {
        this.proofreadUnit = proofreadUnit;
    }

    public String getWeldUnit() {
        return weldUnit;
    }

    public void setWeldUnit(String weldUnit) {
        this.weldUnit = weldUnit;
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