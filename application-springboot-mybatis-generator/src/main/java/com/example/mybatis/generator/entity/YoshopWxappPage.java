package com.example.mybatis.generator.entity;

public class YoshopWxappPage {
    private Integer pageId;

    private Byte pageType;

    private Integer wxappId;

    private Integer createTime;

    private Integer updateTime;

    private String pageData;

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Byte getPageType() {
        return pageType;
    }

    public void setPageType(Byte pageType) {
        this.pageType = pageType;
    }

    public Integer getWxappId() {
        return wxappId;
    }

    public void setWxappId(Integer wxappId) {
        this.wxappId = wxappId;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public String getPageData() {
        return pageData;
    }

    public void setPageData(String pageData) {
        this.pageData = pageData == null ? null : pageData.trim();
    }
}