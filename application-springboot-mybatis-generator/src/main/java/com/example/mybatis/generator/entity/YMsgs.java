package com.example.mybatis.generator.entity;

public class YMsgs {
    private Integer mId;

    private String mName;

    private String mTel;

    private String mEmail;

    private String mTit;

    private String mCon;

    private String mIp;

    private Integer mTime;

    private Byte mStatus;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmTel() {
        return mTel;
    }

    public void setmTel(String mTel) {
        this.mTel = mTel == null ? null : mTel.trim();
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail == null ? null : mEmail.trim();
    }

    public String getmTit() {
        return mTit;
    }

    public void setmTit(String mTit) {
        this.mTit = mTit == null ? null : mTit.trim();
    }

    public String getmCon() {
        return mCon;
    }

    public void setmCon(String mCon) {
        this.mCon = mCon == null ? null : mCon.trim();
    }

    public String getmIp() {
        return mIp;
    }

    public void setmIp(String mIp) {
        this.mIp = mIp == null ? null : mIp.trim();
    }

    public Integer getmTime() {
        return mTime;
    }

    public void setmTime(Integer mTime) {
        this.mTime = mTime;
    }

    public Byte getmStatus() {
        return mStatus;
    }

    public void setmStatus(Byte mStatus) {
        this.mStatus = mStatus;
    }
}