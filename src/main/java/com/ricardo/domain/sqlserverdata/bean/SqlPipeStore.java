package com.ricardo.domain.sqlserverdata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 22:37
 */
@Entity
@Table(name="PipeStore")
public class SqlPipeStore {

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

    @Column(name="加工单元ID")
    private  int processUnitId;

    @Column(name="装配管ID")
    private  int assemblyId;

    @Column(name="堆放场地")
    private  String storePlace;

    @Column(name="入库日期")
    private  Date inStoreDate;

    @Column(name="集托日期")
    private  Date collectionDate;

    @Column(name="出库日期")
    private  Date outStoreDate;

    public SqlPipeStore( ) {

    }

    public SqlPipeStore(int oldId, int midId, Boolean isDelete, Boolean isUpdate,
                        int callShipId, int assemblyId,
                        int processUnitId, String storePlace, Date inStoreDate, Date collectionDate,
                        Date outStoreDate) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.assemblyId = assemblyId;
        this.processUnitId = processUnitId;
        this.storePlace = storePlace;
        this.inStoreDate = inStoreDate;
        this.collectionDate = collectionDate;
        this.outStoreDate = outStoreDate;
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

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public int getProcessUnitId() {
        return processUnitId;
    }

    public void setProcessUnitId(int processUnitId) {
        this.processUnitId = processUnitId;
    }

    public String getStorePlace() {
        return storePlace;
    }

    public void setStorePlace(String storePlace) {
        this.storePlace = storePlace;
    }

    public Date getInStoreDate() {
        return inStoreDate;
    }

    public void setInStoreDate(Date inStoreDate) {
        this.inStoreDate = inStoreDate;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public Date getOutStoreDate() {
        return outStoreDate;
    }

    public void setOutStoreDate(Date outStoreDate) {
        this.outStoreDate = outStoreDate;
    }
}
