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
@Table(name="PipeCutting")
public class PipeCutting {

    //OID
    @Id
    @Column(name="OID")
    private  int oldId;

    //MidOID
    @Column(name="MidOID")
    private  int midId;

    //是否删除
    @Column(name="是否删除")
    private  Boolean isDelete;

    //是否更新
    @Column(name="是否更新")
    private  Boolean isUpdate;


    @Column(name="号船ID")
    private  int callShipId;


    @Column(name="套料批次")
    private  String machiningBatch;


    @Column(name="装配管ID")
    private  int assemblyId;


    @Column(name="下料长")
    private  int cuttingLength;


    @Column(name="管材规格")
    private  String pipeSpecification;


    @Column(name="入级船级社")
    private  String inClassShipLevel;


    @Column(name="加工单元ID")
    private  int processUnitId;


    @Column(name="管子形态")
    private  String pipeShape;


    @Column(name="不校装")
    private  String noInstalled;

    public PipeCutting( ) {

    }

    public PipeCutting(int oldId, int midId, Boolean isDelete, Boolean isUpdate,
                       int callShipId, String machiningBatch, int assemblyId, int cuttingLength,
                       String pipeSpecification,
                       String inClassShipLevel, int processUnitId, String pipeShape,
                       String noInstalled) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.machiningBatch = machiningBatch;
        this.assemblyId = assemblyId;
        this.cuttingLength = cuttingLength;
        this.pipeSpecification = pipeSpecification;
        this.inClassShipLevel = inClassShipLevel;
        this.processUnitId = processUnitId;
        this.pipeShape = pipeShape;
        this.noInstalled = noInstalled;
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

    public String getMachiningBatch() {
        return machiningBatch;
    }

    public void setMachiningBatch(String machiningBatch) {
        this.machiningBatch = machiningBatch;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public int getCuttingLength() {
        return cuttingLength;
    }

    public void setCuttingLength(int cuttingLength) {
        this.cuttingLength = cuttingLength;
    }

    public String getPipeSpecification() {
        return pipeSpecification;
    }

    public void setPipeSpecification(String pipeSpecification) {
        this.pipeSpecification = pipeSpecification;
    }

    public String getInClassShipLevel() {
        return inClassShipLevel;
    }

    public void setInClassShipLevel(String inClassShipLevel) {
        this.inClassShipLevel = inClassShipLevel;
    }

    public int getProcessUnitId() {
        return processUnitId;
    }

    public void setProcessUnitId(int processUnitId) {
        this.processUnitId = processUnitId;
    }

    public String getPipeShape() {
        return pipeShape;
    }

    public void setPipeShape(String pipeShape) {
        this.pipeShape = pipeShape;
    }

    public String getNoInstalled() {
        return noInstalled;
    }

    public void setNoInstalled(String noInstalled) {
        this.noInstalled = noInstalled;
    }
}
