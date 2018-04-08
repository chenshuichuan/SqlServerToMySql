package com.ricardo.domain.mysqldata.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ship_table")
public class ShipTable {

    @Id
    @Column(name="ship_id")
    private Integer shipId;


    @Column(name="ship_name")
    private String shipName;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="extend")
    private String extend;

    public ShipTable() {
    }

    public ShipTable(Integer shipId, String shipName, String shipCode, String extend) {
        this.shipId = shipId;
        this.shipName = shipName;
        this.shipCode = shipCode;
        this.extend = extend;
    }

    public Integer getShipId() {
        return shipId;
    }

    public void setShipId(Integer shipId) {
        this.shipId = shipId;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}