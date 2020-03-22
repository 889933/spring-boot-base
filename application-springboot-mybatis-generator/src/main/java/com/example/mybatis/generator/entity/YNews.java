package com.example.mybatis.generator.entity;

public class YNews {
    private Integer id;

    private String newsTit;

    private String titlepic;

    private String newsJj;

    private String newsSource;

    private Integer addTime;

    private String addIp;

    private String newsClass;

    private String newpics;

    private Integer newsDjs;

    private String author;

    private Byte sh;

    private Byte tuij;

    private Byte isbold;

    private String newsCon;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewsTit() {
        return newsTit;
    }

    public void setNewsTit(String newsTit) {
        this.newsTit = newsTit == null ? null : newsTit.trim();
    }

    public String getTitlepic() {
        return titlepic;
    }

    public void setTitlepic(String titlepic) {
        this.titlepic = titlepic == null ? null : titlepic.trim();
    }

    public String getNewsJj() {
        return newsJj;
    }

    public void setNewsJj(String newsJj) {
        this.newsJj = newsJj == null ? null : newsJj.trim();
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource == null ? null : newsSource.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public String getNewsClass() {
        return newsClass;
    }

    public void setNewsClass(String newsClass) {
        this.newsClass = newsClass == null ? null : newsClass.trim();
    }

    public String getNewpics() {
        return newpics;
    }

    public void setNewpics(String newpics) {
        this.newpics = newpics == null ? null : newpics.trim();
    }

    public Integer getNewsDjs() {
        return newsDjs;
    }

    public void setNewsDjs(Integer newsDjs) {
        this.newsDjs = newsDjs;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Byte getSh() {
        return sh;
    }

    public void setSh(Byte sh) {
        this.sh = sh;
    }

    public Byte getTuij() {
        return tuij;
    }

    public void setTuij(Byte tuij) {
        this.tuij = tuij;
    }

    public Byte getIsbold() {
        return isbold;
    }

    public void setIsbold(Byte isbold) {
        this.isbold = isbold;
    }

    public String getNewsCon() {
        return newsCon;
    }

    public void setNewsCon(String newsCon) {
        this.newsCon = newsCon == null ? null : newsCon.trim();
    }
}