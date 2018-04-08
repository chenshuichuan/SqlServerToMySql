package com.ricardo.domain.mysqldata.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="unit_components")
public class UnitComponents {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="ship_code")
    private String shipCode;

    @Column(name="batch_name")
    private String batchName;

    @Column(name="unit_name")
    private String unitName;

    @Column(name="material_name")
    private String materialName;

    @Column(name="spec_standard_numbers")
    private String specStandardNumbers;
    @Column(name="material")
    private String material;

    @Column(name="piece")
    private String piece;

    @Column(name="number")
    private Integer number;

    @Column(name="weight")
    private Float weight;

    @Column(name="source_number")
    private String sourceNumber;

    @Column(name="extend")
    private String extend;

    public UnitComponents() {
    }

    public UnitComponents(Integer id, String shipCode, String batchName,
                          String unitName, String materialName, String specStandardNumbers,
                          String material,
                          String piece, Integer number, Float weight,
                          String sourceNumber, String extend) {
        this.id = id;
        this.shipCode = shipCode;
        this.batchName = batchName;
        this.unitName = unitName;
        this.materialName = materialName;
        this.specStandardNumbers = specStandardNumbers;
        this.material = material;
        this.piece = piece;
        this.number = number;
        this.weight = weight;
        this.sourceNumber = sourceNumber;
        this.extend = extend;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipCode() {
        return shipCode;
    }

    public void setShipCode(String shipCode) {
        this.shipCode = shipCode;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getSpecStandardNumbers() {
        return specStandardNumbers;
    }

    public void setSpecStandardNumbers(String specStandardNumbers) {
        this.specStandardNumbers = specStandardNumbers;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getSourceNumber() {
        return sourceNumber;
    }

    public void setSourceNumber(String sourceNumber) {
        this.sourceNumber = sourceNumber;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }
}