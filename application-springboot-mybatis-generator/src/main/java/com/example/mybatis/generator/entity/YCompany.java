package com.example.mybatis.generator.entity;

public class YCompany {
    private Integer id;

    private String name;

    private String class;

    private String address;

    private String pinpaiurl;

    private String tel;

    private String fax;

    private String email;

    private String copyright;

    private String gspic;

    private String ygpic;

    private String honour;

    private String honourTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClass() {
        return class;
    }

    public void setClass(String class) {
        this.class = class == null ? null : class.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPinpaiurl() {
        return pinpaiurl;
    }

    public void setPinpaiurl(String pinpaiurl) {
        this.pinpaiurl = pinpaiurl == null ? null : pinpaiurl.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright == null ? null : copyright.trim();
    }

    public String getGspic() {
        return gspic;
    }

    public void setGspic(String gspic) {
        this.gspic = gspic == null ? null : gspic.trim();
    }

    public String getYgpic() {
        return ygpic;
    }

    public void setYgpic(String ygpic) {
        this.ygpic = ygpic == null ? null : ygpic.trim();
    }

    public String getHonour() {
        return honour;
    }

    public void setHonour(String honour) {
        this.honour = honour == null ? null : honour.trim();
    }

    public String getHonourTitle() {
        return honourTitle;
    }

    public void setHonourTitle(String honourTitle) {
        this.honourTitle = honourTitle == null ? null : honourTitle.trim();
    }
}