package com.example.mybatis.generator.entity;

public class YConfig {
    private Byte id;

    private String weblogo;

    private String webname;

    private String webtitle;

    private String webkeys;

    private String webdesc;

    private Integer dredgetime;

    public Byte getId() {
        return id;
    }

    public void setId(Byte id) {
        this.id = id;
    }

    public String getWeblogo() {
        return weblogo;
    }

    public void setWeblogo(String weblogo) {
        this.weblogo = weblogo == null ? null : weblogo.trim();
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getWebtitle() {
        return webtitle;
    }

    public void setWebtitle(String webtitle) {
        this.webtitle = webtitle == null ? null : webtitle.trim();
    }

    public String getWebkeys() {
        return webkeys;
    }

    public void setWebkeys(String webkeys) {
        this.webkeys = webkeys == null ? null : webkeys.trim();
    }

    public String getWebdesc() {
        return webdesc;
    }

    public void setWebdesc(String webdesc) {
        this.webdesc = webdesc == null ? null : webdesc.trim();
    }

    public Integer getDredgetime() {
        return dredgetime;
    }

    public void setDredgetime(Integer dredgetime) {
        this.dredgetime = dredgetime;
    }
}