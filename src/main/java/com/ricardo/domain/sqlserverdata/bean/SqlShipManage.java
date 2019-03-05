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
@Table(name="ShipManage")
public class SqlShipManage {

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
    @Column(name="号船名称")
    private  String callShipName;

    @Column(name="号船代号")
    private  String callShipCode;

    public int getShapeShipId() {
        return shapeShipId;
    }

    public void setShapeShipId(int shapeShipId) {
        this.shapeShipId = shapeShipId;
    }

    public SqlShipManage( ) {

    }

    public SqlShipManage(int oldId, int midId, Boolean isDelete,
                         Boolean isUpdate, int shapeShipId, String callShipName, String callShipCode) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.callShipName = callShipName;
        this.callShipCode = callShipCode;
        this.shapeShipId = shapeShipId;
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

    public String getCallShipName() {
        return callShipName;
    }

    public void setCallShipName(String callShipName) {
        this.callShipName = callShipName;
    }

    public String getCallShipCode() {
        return callShipCode;
    }

    public void setCallShipCode(String callShipCode) {
        this.callShipCode = callShipCode;
    }

    @Override
    public String toString() {
        return "SqlShipManage{" +
                "oldId=" + oldId +
                ", midId=" + midId +
                ", isDelete=" + isDelete +
                ", isUpdate=" + isUpdate +
                ", shapeShipId=" + shapeShipId +
                ", callShipName='" + callShipName + '\'' +
                ", callShipCode='" + callShipCode + '\'' +
                '}';
    }
}
