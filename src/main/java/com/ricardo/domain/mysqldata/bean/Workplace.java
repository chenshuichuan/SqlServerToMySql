package com.ricardo.domain.mysqldata.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//@Entity
//@Table(name="book")
public class Workplace {

//    @Id
//    @Column(name="id")
    private Integer id;

    private String section;

    private Integer process;

    private String workplace;

    private Boolean status;

    private String workersId;

    private String units;

    private Integer role;


    private Date updateTime;


    private String extend;

}