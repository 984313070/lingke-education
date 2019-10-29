package com.jk.education.shopping.common.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class BykGoods {
    private Integer id;

    private Integer uid;

    private String uname;

    private String name;

    private Integer maxtypeid;

    private Integer typeid;

    private Integer mintypeid;

    private String typename;

    private String url;

    private String intro;

    private String info;

    private Integer status;

    private Integer conversionprice;

    private Integer inventory;

    private Integer freight;

    private Integer essence;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaxtypeid() {
        return maxtypeid;
    }

    public void setMaxtypeid(Integer maxtypeid) {
        this.maxtypeid = maxtypeid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getMintypeid() {
        return mintypeid;
    }

    public void setMintypeid(Integer mintypeid) {
        this.mintypeid = mintypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getConversionprice() {
        return conversionprice;
    }

    public void setConversionprice(Integer conversionprice) {
        this.conversionprice = conversionprice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getEssence() {
        return essence;
    }

    public void setEssence(Integer essence) {
        this.essence = essence;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    @Override
    public String toString() {
        return "BykGoods{" +
                "id=" + id +
                ", uid=" + uid +
                ", uname='" + uname + '\'' +
                ", name='" + name + '\'' +
                ", maxtypeid=" + maxtypeid +
                ", typeid=" + typeid +
                ", mintypeid=" + mintypeid +
                ", typename='" + typename + '\'' +
                ", url='" + url + '\'' +
                ", intro='" + intro + '\'' +
                ", info='" + info + '\'' +
                ", status=" + status +
                ", conversionprice=" + conversionprice +
                ", inventory=" + inventory +
                ", freight=" + freight +
                ", essence=" + essence +
                ", regtime=" + regtime +
                ", endtime=" + endtime +
                '}';
    }
}