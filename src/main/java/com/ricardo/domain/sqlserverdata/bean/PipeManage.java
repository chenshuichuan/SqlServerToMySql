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
@Table(name="PipeManage")
public class PipeManage {

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

    @Column(name="装配管ID")
    private  int assemblyId;

    @Column(name="加工单元ID")
    private  int processUnitId;

    @Column(name="派工单")
    private  String dispatchList;

    //加工顺序
    @Column(name="工序")
    private  String processOrder;

    public PipeManage( ) {

    }

    public String getProcessOrder() {
        return processOrder;
    }

    public void setProcessOrder(String processOrder) {
        this.processOrder = processOrder;
    }

    public PipeManage(int oldId, int midId, Boolean isDelete,
                      Boolean isUpdate, int callShipId, int assemblyId,
                      int processUnitId, String dispatchList, String processOrder) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.assemblyId = assemblyId;
        this.processUnitId = processUnitId;
        this.dispatchList = dispatchList;
        this.processOrder = processOrder;
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

    public String getDispatchList() {
        return dispatchList;
    }

    public void setDispatchList(String dispatchList) {
        this.dispatchList = dispatchList;
    }
}
