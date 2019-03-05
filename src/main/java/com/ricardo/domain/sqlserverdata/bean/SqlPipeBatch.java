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
@Table(name="PipeBatch")
public class SqlPipeBatch {

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

    @Column(name="加工批次")
    private  String processingBatch;

    @Column(name="描述")
    private  String description;

    public SqlPipeBatch( ) {

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

    public String getProcessingBatch() {
        return processingBatch;
    }

    public void setProcessingBatch(String processingBatch) {
        this.processingBatch = processingBatch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SqlPipeBatch(int oldId, int midId, Boolean isDelete,
                        Boolean isUpdate, int callShipId, String processingBatch,
                        String description) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.processingBatch = processingBatch;
        this.description = description;
    }

    @Override
    public String toString() {
        return "SqlPipeBatch{" +
                "oldId=" + oldId +
                ", midId=" + midId +
                ", isDelete=" + isDelete +
                ", isUpdate=" + isUpdate +
                ", callShipId=" + callShipId +
                ", processingBatch='" + processingBatch + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
