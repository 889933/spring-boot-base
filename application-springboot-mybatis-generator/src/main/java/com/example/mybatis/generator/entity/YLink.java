package com.example.mybatis.generator.entity;

public class YLink {
    private Integer id;

    private String lName;

    private String lLogo;

    private String lUrl;

    private Integer lTime;

    private Integer lOvertime;

    private Byte lStatus;

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

    public String getlUrl() {
        return lUrl;
    }

    public void setlUrl(String lUrl) {
        this.lUrl = lUrl == null ? null : lUrl.trim();
    }

    public Integer getlTime() {
        return lTime;
    }

    public void setlTime(Integer lTime) {
        this.lTime = lTime;
    }

    public Integer getlOvertime() {
        return lOvertime;
    }

    public void setlOvertime(Integer lOvertime) {
        this.lOvertime = lOvertime;
    }

    public Byte getlStatus() {
        return lStatus;
    }

    public void setlStatus(Byte lStatus) {
        this.lStatus = lStatus;
    }
}