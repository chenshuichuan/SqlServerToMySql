package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="connector")
public class Connector {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="pipe_id")
    private String pipeId;

    public Connector(Integer id, String pipeId) {
        this.id = id;
        this.pipeId = pipeId;
    }
    public Connector() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }
}