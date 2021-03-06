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
@Table(name="PipeComponent")
public class SqlPipeComponent {

    @Id
    @Column(name="OID")
    private  int oldId;

    @Column(name="是否更新")
    private  Boolean isUpdate;

    @Column(name="部件ID")
    private  String processingBatch;

    @Column(name="名称")
    private  String name;

    @Column(name="型号规格")
    private  String modelDescription;

    @Column(name="标准号图号")
    private  String standardGraphCode;
    @Column(name="材质")
    private  String materials;

    public Boolean getUpdate() {
        return isUpdate;
    }

    public void setUpdate(Boolean update) {
        isUpdate = update;
    }

    public SqlPipeComponent(int oldId, String processingBatch, String name,
                            String modelDescription, String standardGraphCode, String materials, Boolean isUpdate) {
        this.oldId = oldId;
        this.processingBatch = processingBatch;
        this.name = name;
        this.modelDescription = modelDescription;
        this.standardGraphCode = standardGraphCode;
        this.materials = materials;
        this.isUpdate = isUpdate;
    }

    public SqlPipeComponent( ) {

    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public String getProcessingBatch() {
        return processingBatch;
    }

    public void setProcessingBatch(String processingBatch) {
        this.processingBatch = processingBatch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public String getStandardGraphCode() {
        return standardGraphCode;
    }

    public void setStandardGraphCode(String standardGraphCode) {
        this.standardGraphCode = standardGraphCode;
    }

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        return "SqlPipeComponent{" +
                "oldId=" + oldId +
                ", isUpdate=" + isUpdate +
                ", processingBatch='" + processingBatch + '\'' +
                ", name='" + name + '\'' +
                ", modelDescription='" + modelDescription + '\'' +
                ", standardGraphCode='" + standardGraphCode + '\'' +
                ", materials='" + materials + '\'' +
                '}';
    }
}
