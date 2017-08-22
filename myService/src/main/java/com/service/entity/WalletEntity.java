package com.service.entity;

import java.io.Serializable;


/**
 * Created by fengrongze on 2017/8/2.
 */
public class WalletEntity implements Serializable {
    private Integer id;
    private String name;
    private double total;

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

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "WalletEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", total=" + total +
                '}';
    }
}
