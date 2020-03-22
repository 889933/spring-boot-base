package com.example.mybatis.generator.entity;

public class YCompanyWithBLOBs extends YCompany {
    private String qywh;

    private String desc;

    private String job;

    private String pinpaidesc;

    private String ctact;

    private String gywm;

    public String getQywh() {
        return qywh;
    }

    public void setQywh(String qywh) {
        this.qywh = qywh == null ? null : qywh.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getPinpaidesc() {
        return pinpaidesc;
    }

    public void setPinpaidesc(String pinpaidesc) {
        this.pinpaidesc = pinpaidesc == null ? null : pinpaidesc.trim();
    }

    public String getCtact() {
        return ctact;
    }

    public void setCtact(String ctact) {
        this.ctact = ctact == null ? null : ctact.trim();
    }

    public String getGywm() {
        return gywm;
    }

    public void setGywm(String gywm) {
        this.gywm = gywm == null ? null : gywm.trim();
    }
}