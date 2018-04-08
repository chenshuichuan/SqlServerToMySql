package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loads")
public class Loads {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="workStage")
    private Integer workstage;

    @Column(name="weekLoad")
    private Integer weekLoad;

    @Column(name="monthLoad")
    private Integer monthLoad;

    @Column(name="yearLoad")
    private Integer yearLoad;

    public Loads() {
    }

    public Loads(Integer id, Integer workstage, Integer weekLoad,
                 Integer monthLoad, Integer yearLoad) {
        this.id = id;
        this.workstage = workstage;
        this.weekLoad = weekLoad;
        this.monthLoad = monthLoad;
        this.yearLoad = yearLoad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkstage() {
        return workstage;
    }

    public void setWorkstage(Integer workstage) {
        this.workstage = workstage;
    }

    public Integer getWeekLoad() {
        return weekLoad;
    }

    public void setWeekLoad(Integer weekLoad) {
        this.weekLoad = weekLoad;
    }

    public Integer getMonthLoad() {
        return monthLoad;
    }

    public void setMonthLoad(Integer monthLoad) {
        this.monthLoad = monthLoad;
    }

    public Integer getYearLoad() {
        return yearLoad;
    }

    public void setYearLoad(Integer yearLoad) {
        this.yearLoad = yearLoad;
    }
}