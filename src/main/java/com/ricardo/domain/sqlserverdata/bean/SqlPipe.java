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
@Table(name="Pipe")
public class SqlPipe {

    @Id
    @Column(name="OID")
    private  int oldId;

    @Column(name="MidOID")
    private  int midId;

    @Column(name="是否删除")
    private  Boolean isDelete;

    @Column(name="是否更新")
    private  Boolean isUpdate;

    @Column(name="设计区号")
    private  String designAreaCode;

    @Column(name="分段号")
    private  String segmentCode;

    @Column(name="托盘号")
    private  String trayCode;

    @Column(name="装配管号")
    private  String assemblyCode;

    @Column(name="集配管号")
    private  String setCode;

    public SqlPipe(int oldId, int midId, Boolean isDelete, Boolean isUpdate,
                   String designAreaCode, String segmentCode, String trayCode,
                   String assemblyCode, String setCode) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.designAreaCode = designAreaCode;
        this.segmentCode = segmentCode;
        this.trayCode = trayCode;
        this.assemblyCode = assemblyCode;
        this.setCode = setCode;
    }

    public SqlPipe( ) {

    }
    public SqlPipe(int oldId, int midId, Boolean isDelete, Boolean isUpdate) {
        this.oldId = oldId;
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

    public String getDesignAreaCode() {
        return designAreaCode;
    }

    public void setDesignAreaCode(String designAreaCode) {
        this.designAreaCode = designAreaCode;
    }

    public String getSegmentCode() {
        return segmentCode;
    }

    public void setSegmentCode(String segmentCode) {
        this.segmentCode = segmentCode;
    }

    public String getTrayCode() {
        return trayCode;
    }

    public void setTrayCode(String trayCode) {
        this.trayCode = trayCode;
    }

    public String getAssemblyCode() {
        return assemblyCode;
    }

    public void setAssemblyCode(String assemblyCode) {
        this.assemblyCode = assemblyCode;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }
}
