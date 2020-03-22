package com.example.mybatis.generator.entity;

public class YHonor {
    private Integer id;

    private String lName;

    private String lLogo;

    private Integer orders;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName == null ? null : lName.trim();
    }

    public String getlLogo() {
        return lLogo;
    }

    public void setlLogo(String lLogo) {
        this.lLogo = lLogo == null ? null : lLogo.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}