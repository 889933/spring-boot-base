package com.example.mybatis.generator.entity;

public class YoshopSpec {
    private Integer specId;

    private String specName;

    private Integer wxappId;

    private Integer createTime;

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
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
}