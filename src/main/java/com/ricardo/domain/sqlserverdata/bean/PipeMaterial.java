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
@Table(name="PipeMaterial")
public class PipeMaterial {

    @Id
    @Column(name="OID")
    private  int oldId;

    @Column(name="MidOID")
    private  int midId;

    @Column(name="是否删除")
    private  Boolean isDelete;

    @Column(name="是否更新")
    private  Boolean isUpdate;


    @Column(name="型船ID")
    private  int shapeShipId;

    @Column(name="装配管ID")
    private  int assemblyId;

    @Column(name="管端标识")
    private  String pipeEndFlag;

    @Column(name="部件ID")
    private  int componentId;

    //数量和重量两个字段要注意
    //sql server数据库中是decimal(18, 2)类型，double能否完全表达？
    @Column(name="数量")
    private  double amount;
    @Column(name="重量")
    private  double weight;

    @Column(name="外场装配标记")
    private  char outfieldFlag;

    public PipeMaterial( ) {

    }

    public PipeMaterial(int oldId, int midId, Boolean isDelete, Boolean isUpdate,
                        int shapeShipId, int assemblyId,
                        String pipeEndFlag, int componentId, double amount,
                        double weight, char outfieldFlag) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.shapeShipId = shapeShipId;
        this.assemblyId = assemblyId;
        this.pipeEndFlag = pipeEndFlag;
        this.componentId = componentId;
        this.amount = amount;
        this.weight = weight;
        this.outfieldFlag = outfieldFlag;
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

    public int getShapeShipId() {
        return shapeShipId;
    }

    public void setShapeShipId(int shapeShipId) {
        this.shapeShipId = shapeShipId;
    }

    public int getAssemblyId() {
        return assemblyId;
    }

    public void setAssemblyId(int assemblyId) {
        this.assemblyId = assemblyId;
    }

    public String getPipeEndFlag() {
        return pipeEndFlag;
    }

    public void setPipeEndFlag(String pipeEndFlag) {
        this.pipeEndFlag = pipeEndFlag;
    }

    public int getComponentId() {
        return componentId;
    }

    public void setComponentId(int componentId) {
        this.componentId = componentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getOutfieldFlag() {
        return outfieldFlag;
    }

    public void setOutfieldFlag(char outfieldFlag) {
        this.outfieldFlag = outfieldFlag;
    }
}
