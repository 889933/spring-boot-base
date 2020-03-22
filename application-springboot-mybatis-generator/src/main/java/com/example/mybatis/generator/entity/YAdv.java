package com.example.mybatis.generator.entity;

public class YAdv {
    private Short id;

    private String advName;

    private String advTitle;

    private String advFtitle;

    private String advPic;

    private String advDesc;

    private String advUrl;

    private Integer advTime;

    private Integer advOvertime;

    private Float advPrice;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAdvName() {
        return advName;
    }

    public void setAdvName(String advName) {
        this.advName = advName == null ? null : advName.trim();
    }

    public String getAdvTitle() {
        return advTitle;
    }

    public void setAdvTitle(String advTitle) {
        this.advTitle = advTitle == null ? null : advTitle.trim();
    }

    public String getAdvFtitle() {
        return advFtitle;
    }

    public void setAdvFtitle(String advFtitle) {
        this.advFtitle = advFtitle == null ? null : advFtitle.trim();
    }

    public String getAdvPic() {
        return advPic;
    }

    public void setAdvPic(String advPic) {
        this.advPic = advPic == null ? null : advPic.trim();
    }

    public String getAdvDesc() {
        return advDesc;
    }

    public void setAdvDesc(String advDesc) {
        this.advDesc = advDesc == null ? null : advDesc.trim();
    }

    public String getAdvUrl() {
        return advUrl;
    }

    public void setAdvUrl(String advUrl) {
        this.advUrl = advUrl == null ? null : advUrl.trim();
    }

    public Integer getAdvTime() {
        return advTime;
    }

    public void setAdvTime(Integer advTime) {
        this.advTime = advTime;
    }

    public Integer getAdvOvertime() {
        return advOvertime;
    }

    public void setAdvOvertime(Integer advOvertime) {
        this.advOvertime = advOvertime;
    }

    public Float getAdvPrice() {
        return advPrice;
    }

    public void setAdvPrice(Float advPrice) {
        this.advPrice = advPrice;
    }
}