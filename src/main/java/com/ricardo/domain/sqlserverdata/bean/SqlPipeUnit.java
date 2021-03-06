package com.ricardo.domain.sqlserverdata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 22:37
 */
@Entity
@Table(name="PipeUnit")
public class SqlPipeUnit {

    @Id
    @Column(name="OID")
    private  int oldId;

    @Column(name="MidOID")
    private  int midId;

    @Column(name="是否删除")
    private  Boolean isDelete;

    @Column(name="是否更新")
    private  Boolean isUpdate;

    @Column(name="号船ID")
    private  int callShipId;

    @Column(name="加工批次ID")
    private  int processBatchId;

    @Column(name="加工单元")
    private  String processUnit;

    @Column(name="描述")
    private  String description;

    public SqlPipeUnit( ) {

    }

    public SqlPipeUnit(int oldId, int midId, Boolean isDelete,
                       Boolean isUpdate, int callShipId, int processBatchId,
                       String processUnit, String description) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.processBatchId = processBatchId;
        this.processUnit = processUnit;
        this.description = description;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public int getMidId() {
        return midId;
    }

    public void setMidId(int midId) {
        this.midId = midId;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    public Boolean getUpdate() {
        return isUpdate;
    }

    public void setUpdate(Boolean update) {
        isUpdate = update;
    }

    public int getCallShipId() {
        return callShipId;
    }

    public void setCallShipId(int callShipId) {
        this.callShipId = callShipId;
    }

    public int getProcessBatchId() {
        return processBatchId;
    }

    public void setProcessBatchId(int processBatchId) {
        this.processBatchId = processBatchId;
    }

    public String getProcessUnit() {
        return processUnit;
    }

    public void setProcessUnit(String processUnit) {
        this.processUnit = processUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "SqlPipeUnit{" +
                "oldId=" + oldId +
                ", midId=" + midId +
                ", isDelete=" + isDelete +
                ", isUpdate=" + isUpdate +
                ", callShipId=" + callShipId +
                ", processBatchId=" + processBatchId +
                ", processUnit='" + processUnit + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
