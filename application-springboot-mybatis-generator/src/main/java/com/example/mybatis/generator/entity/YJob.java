package com.example.mybatis.generator.entity;

public class YJob {
    private Short id;

    private String jobPics;

    private Integer addTime;

    private String jobName;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getJobPics() {
        return jobPics;
    }

    public void setJobPics(String jobPics) {
        this.jobPics = jobPics == null ? null : jobPics.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }
}