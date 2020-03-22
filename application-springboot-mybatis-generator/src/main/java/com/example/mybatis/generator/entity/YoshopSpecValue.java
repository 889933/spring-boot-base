package com.example.mybatis.generator.entity;

public class YoshopSpecValue {
    private Integer specValueId;

    private String specValue;

    private Integer specId;

    private Integer wxappId;

    private Integer createTime;

    public Integer getSpecValueId() {
        return specValueId;
    }

    public void setSpecValueId(Integer specValueId) {
        this.specValueId = specValueId;
    }

    public String getSpecValue() {
        return specValue;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue == null ? null : specValue.trim();
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
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