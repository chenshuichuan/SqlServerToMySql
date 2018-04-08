package com.ricardo.domain.mysqldata.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="elbow_table")
public class ElbowTable {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="pipe")
    private String pipe;

    @Column(name="pipe_num")
    private String pipeNum;

    @Column(name="bending_mold")
    private Integer bendingMold;

    @Column(name="actual_length")
    private Float actualLength;

    @Column(name="head_end_angle")
    private Integer headEndAngle;

    @Column(name="straight_section1")
    private Integer straightSection1;

    @Column(name="bend_angle1")
    private Integer bendAngle1;

    @Column(name="arc_length1")
    private Integer arcLength1;

    @Column(name="straight_section2")
    private Integer straightSection2;

    @Column(name="corner")
    private Integer corner;

    @Column(name="bend_angle2")
    private Integer bendAngle2;

    @Column(name="arc_length2")
    private Integer arcLength2;

    @Column(name="straight_section3")
    private Integer straightSection3;

    @Column(name="tail_angle")
    private Integer tailAngle;

    public ElbowTable(Integer id, String pipe, String pipeNum, Integer bendingMold,
                      Float actualLength, Integer headEndAngle, Integer straightSection1,
                      Integer bendAngle1, Integer arcLength1,
                      Integer straightSection2, Integer corner, Integer bendAngle2,
                      Integer arcLength2, Integer straightSection3, Integer tailAngle) {
        this.id = id;
        this.pipe = pipe;
        this.pipeNum = pipeNum;
        this.bendingMold = bendingMold;
        this.actualLength = actualLength;
        this.headEndAngle = headEndAngle;
        this.straightSection1 = straightSection1;
        this.bendAngle1 = bendAngle1;
        this.arcLength1 = arcLength1;
        this.straightSection2 = straightSection2;
        this.corner = corner;
        this.bendAngle2 = bendAngle2;
        this.arcLength2 = arcLength2;
        this.straightSection3 = straightSection3;
        this.tailAngle = tailAngle;
    }

    public ElbowTable() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPipe() {
        return pipe;
    }

    public void setPipe(String pipe) {
        this.pipe = pipe;
    }

    public String getPipeNum() {
        return pipeNum;
    }

    public void setPipeNum(String pipeNum) {
        this.pipeNum = pipeNum;
    }

    public Integer getBendingMold() {
        return bendingMold;
    }

    public void setBendingMold(Integer bendingMold) {
        this.bendingMold = bendingMold;
    }

    public Float getActualLength() {
        return actualLength;
    }

    public void setActualLength(Float actualLength) {
        this.actualLength = actualLength;
    }

    public Integer getHeadEndAngle() {
        return headEndAngle;
    }

    public void setHeadEndAngle(Integer headEndAngle) {
        this.headEndAngle = headEndAngle;
    }

    public Integer getStraightSection1() {
        return straightSection1;
    }

    public void setStraightSection1(Integer straightSection1) {
        this.straightSection1 = straightSection1;
    }

    public Integer getBendAngle1() {
        return bendAngle1;
    }

    public void setBendAngle1(Integer bendAngle1) {
        this.bendAngle1 = bendAngle1;
    }

    public Integer getArcLength1() {
        return arcLength1;
    }

    public void setArcLength1(Integer arcLength1) {
        this.arcLength1 = arcLength1;
    }

    public Integer getStraightSection2() {
        return straightSection2;
    }

    public void setStraightSection2(Integer straightSection2) {
        this.straightSection2 = straightSection2;
    }

    public Integer getCorner() {
        return corner;
    }

    public void setCorner(Integer corner) {
        this.corner = corner;
    }

    public Integer getBendAngle2() {
        return bendAngle2;
    }

    public void setBendAngle2(Integer bendAngle2) {
        this.bendAngle2 = bendAngle2;
    }

    public Integer getArcLength2() {
        return arcLength2;
    }

    public void setArcLength2(Integer arcLength2) {
        this.arcLength2 = arcLength2;
    }

    public Integer getStraightSection3() {
        return straightSection3;
    }

    public void setStraightSection3(Integer straightSection3) {
        this.straightSection3 = straightSection3;
    }

    public Integer getTailAngle() {
        return tailAngle;
    }

    public void setTailAngle(Integer tailAngle) {
        this.tailAngle = tailAngle;
    }
}