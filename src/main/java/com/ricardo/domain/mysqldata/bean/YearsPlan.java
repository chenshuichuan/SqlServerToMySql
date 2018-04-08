package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name="years_plan")
public class YearsPlan {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="year")
    private Date year;

    @Column(name="month")
    private Integer month;

    @Column(name="plan_id")
    private Integer planId;

    @Column(name="plan_des")
    private String planDes;

    public YearsPlan() {
    }

    public YearsPlan(Integer id, Date year, Integer month,
                     Integer planId, String planDes) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.planId = planId;
        this.planDes = planDes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getPlanId() {
        return planId;
    }

    public void setPlanId(Integer planId) {
        this.planId = planId;
    }

    public String getPlanDes() {
        return planDes;
    }

    public void setPlanDes(String planDes) {
        this.planDes = planDes;
    }
}