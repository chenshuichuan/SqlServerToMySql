package com.ricardo.domain.mysqldata.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="process_order")
public class ProcessOrder {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="order_list")
    private String orderList;

    public ProcessOrder() {
    }

    public ProcessOrder(Integer id, String name, String orderList) {
        this.id = id;
        this.name = name;
        this.orderList = orderList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderList() {
        return orderList;
    }

    public void setOrderList(String orderList) {
        this.orderList = orderList;
    }
}