package com.ricardo.domain.sqlserverdata.bean;

import javax.persistence.*;

/**
 * Created by:Ricardo
 * Description:
 * Date: 2018/3/14
 * Time: 22:37
 */
@Entity
@Table(name="UpdateTable")
public class UpdateTable {

    @Id
    @Column(name="tableId")
    //@GeneratedValue
    private  int id;

    @Column(name="tableName")
    private  String tableName;

    @Column(name="isUpdate")
    private  Boolean isUpdate;

    @Column(name="isDelete")
    private  Boolean isDelete;


    public UpdateTable(int id, String tableName, Boolean isUpdate, Boolean isDelete) {
        this.id = id;
        this.tableName = tableName;
        this.isUpdate = isUpdate;
        this.isDelete = isDelete;
    }

    public UpdateTable( ) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Boolean getUpdate() {
        return isUpdate;
    }

    public void setUpdate(Boolean update) {
        isUpdate = update;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }
}
