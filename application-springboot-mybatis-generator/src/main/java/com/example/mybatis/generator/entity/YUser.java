package com.example.mybatis.generator.entity;

public class YUser {
    private Byte id;

    private String username;

    private String userpwd;

    private String name;

    private Integer logintime;

    private Integer loginnums;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd == null ? null : userpwd.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLogintime() {
        return logintime;
    }

    public void setLogintime(Integer logintime) {
        this.logintime = logintime;
    }

    public Integer getLoginnums() {
        return loginnums;
    }

    public void setLoginnums(Integer loginnums) {
        this.loginnums = loginnums;
    }
}