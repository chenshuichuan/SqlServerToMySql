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
@Table(name="PipeSurface")
public class SqlPipeSurface {

    @Id
    @Column(name="OID")
    private  int oldId;
    @Column(name="MidOID")
    private  int midId;
    @Column(name="是否删除")
    private  Boolean isDelete;

    @Column(name="是否更新")
    private  Boolean isUpdate;

    @Column(name="表面处理码")
    private  String surfaceCode;

    @Column(name="表面处理全称")
    private  String surfaceFullName;

    @Column(name="表面处理简称")
    private  String surfaceShortName;

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

    public SqlPipeSurface() {

    }
    public SqlPipeSurface(int oldId, int midId, Boolean isDelete, Boolean isUpdate, String surfaceCode, String surfaceFullName, String surfaceShortName) {
        this.oldId = oldId;
        this.surfaceCode = surfaceCode;
        this.surfaceFullName = surfaceFullName;
        this.surfaceShortName = surfaceShortName;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
    }

    public int getOldId() {
        return oldId;
    }

    public void setOldId(int oldId) {
        this.oldId = oldId;
    }

    public String getSurfaceCode() {
        return surfaceCode;
    }

    public void setSurfaceCode(String surfaceCode) {
        this.surfaceCode = surfaceCode;
    }

    public String getSurfaceFullName() {
        return surfaceFullName;
    }

    public void setSurfaceFullName(String surfaceFullName) {
        this.surfaceFullName = surfaceFullName;
    }

    public String getSurfaceShortName() {
        return surfaceShortName;
    }

    public void setSurfaceShortName(String surfaceShortName) {
        this.surfaceShortName = surfaceShortName;
    }

    @Override
    public String toString() {
        return "SqlPipeSurface{" +
                "oldId=" + oldId +
                ", midId=" + midId +
                ", isDelete=" + isDelete +
                ", isUpdate=" + isUpdate +
                ", surfaceCode='" + surfaceCode + '\'' +
                ", surfaceFullName='" + surfaceFullName + '\'' +
                ", surfaceShortName='" + surfaceShortName + '\'' +
                '}';
    }
}
