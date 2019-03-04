package com.ricardo.domain.sqlserverdata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by:Ricardo
 * Description: 注意和shipManage的区别
 * Date: 2018/3/14
 * Time: 22:37
 */
@Entity
@Table(name="ShipTypeManage")
public class ShipTypeManage {

    @Id
    @Column(name="OID")
    private  int oldId;

    @Column(name="MidOID")
    private  int midId;

    @Column(name="是否删除")
    private  Boolean isDelete;

    @Column(name="是否更新")
    private  Boolean isUpdate;

    @Column(name="型船代号")
    private  String shapeShipCode;

    @Column(name="型船名称")
    private  String shapeShipName;

    public String getShapeShipName() {
        return shapeShipName;
    }

    public void setShapeShipName(String shapeShipName) {
        this.shapeShipName = shapeShipName;
    }

    public ShipTypeManage( ) {

    }

    public ShipTypeManage(int oldId, int midId, Boolean isDelete,
                          Boolean isUpdate, String shapeShipCode, String shapeShipName) {
        this.oldId = oldId;
        this.midId = midId;
        this.isDelete = isDelete;
        this.isUpdate = isUpdate;
        this.shapeShipCode = shapeShipCode;
        this.shapeShipName = shapeShipName;
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

    public String getShapeShipCode() {
        return shapeShipCode;
    }

    public void setShapeShipCode(String shapeShipCode) {
        this.shapeShipCode = shapeShipCode;
    }


}
