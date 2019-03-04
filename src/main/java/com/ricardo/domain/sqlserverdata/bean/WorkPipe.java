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
@Table(name="WorkPipe")
public class WorkPipe {

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

    @Column(name="管子通径")
    private  double pipeDiameter;

    @Column(name="管子外径")
    private  double pipeOutsideDiameter;

    @Column(name="管子壁厚")
    private  double pipeThickness;

    @Column(name="管子材质")
    private  String pipeMaterial;

    @Column(name="管材级别")
    private  String pipeMaterialLevel;

    @Column(name="管材名称")
    private  String pipeMaterialName;

    @Column(name="管段形态")
    private  String pipeSectionShape;

    @Column(name="下料长")
    private  double cuttingLength;

    @Column(name="表面处理")
    private  String surfaceTreat;

    @Column(name="外场装配标记")
    //长度只有一位
    private  String outfieldAssemblyFlag;

    public WorkPipe( ) {

    }

    public WorkPipe(int oldId, int midId, Boolean isDelete, Boolean isUpdate,
                    int callShipId, int assemblyId, double pipeDiameter, double pipeOutsideDiameter,
                    double pipeThickness, String pipeMaterial, String pipeMaterialLevel,
                    String pipeMaterialName, String pipeSectionShape,
                    double cuttingLength, String surfaceTreat, String outfieldAssemblyFlag) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipId = callShipId;
        this.assemblyId = assemblyId;
        this.pipeDiameter = pipeDiameter;
        this.pipeOutsideDiameter = pipeOutsideDiameter;
        this.pipeThickness = pipeThickness;
        this.pipeMaterial = pipeMaterial;
        this.pipeMaterialLevel = pipeMaterialLevel;
        this.pipeMaterialName = pipeMaterialName;
        this.pipeSectionShape = pipeSectionShape;
        this.cuttingLength = cuttingLength;
        this.surfaceTreat = surfaceTreat;
        this.outfieldAssemblyFlag = outfieldAssemblyFlag;
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

    public double getPipeDiameter() {
        return pipeDiameter;
    }

    public void setPipeDiameter(double pipeDiameter) {
        this.pipeDiameter = pipeDiameter;
    }

    public double getPipeOutsideDiameter() {
        return pipeOutsideDiameter;
    }

    public void setPipeOutsideDiameter(double pipeOutsideDiameter) {
        this.pipeOutsideDiameter = pipeOutsideDiameter;
    }

    public double getPipeThickness() {
        return pipeThickness;
    }

    public void setPipeThickness(double pipeThickness) {
        this.pipeThickness = pipeThickness;
    }

    public String getPipeMaterial() {
        return pipeMaterial;
    }

    public void setPipeMaterial(String pipeMaterial) {
        this.pipeMaterial = pipeMaterial;
    }

    public String getPipeMaterialLevel() {
        return pipeMaterialLevel;
    }

    public void setPipeMaterialLevel(String pipeMaterialLevel) {
        this.pipeMaterialLevel = pipeMaterialLevel;
    }

    public String getPipeMaterialName() {
        return pipeMaterialName;
    }

    public void setPipeMaterialName(String pipeMaterialName) {
        this.pipeMaterialName = pipeMaterialName;
    }

    public String getPipeSectionShape() {
        return pipeSectionShape;
    }

    public void setPipeSectionShape(String pipeSectionShape) {
        this.pipeSectionShape = pipeSectionShape;
    }

    public double getCuttingLength() {
        return cuttingLength;
    }

    public void setCuttingLength(double cuttingLength) {
        this.cuttingLength = cuttingLength;
    }

    public String getSurfaceTreat() {
        return surfaceTreat;
    }

    public void setSurfaceTreat(String surfaceTreat) {
        this.surfaceTreat = surfaceTreat;
    }

    public String getOutfieldAssemblyFlag() {
        return outfieldAssemblyFlag;
    }

    public void setOutfieldAssemblyFlag(String outfieldAssemblyFlag) {
        this.outfieldAssemblyFlag = outfieldAssemblyFlag;
    }
}
