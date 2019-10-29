package com.jk.education.shopping.common.model;

import lombok.Data;
import lombok.ToString;

public class BykShoppingAddress {
    private Integer id;

    private Integer uid;

    private Integer provinceId;

    private Integer cityId;

    private Integer countyId;

    private String address;

    private String name;

    private String photo;

    private Integer status;

    private Integer defaultAddress;

    private String province;

    private String city;

    private String county;

    public Integer getId() {
        return id;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public Integer getCountyId() {
        return countyId;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }

    public Integer getStatus() {
        return status;
    }

    public Integer getDefaultAddress() {
        return defaultAddress;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setCountyId(Integer countyId) {
        this.countyId = countyId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDefaultAddress(Integer defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return "BykShoppingAddress{" +
                "id=" + id +
                ", uid=" + uid +
                ", provinceId=" + provinceId +
                ", cityId=" + cityId +
                ", countyId=" + countyId +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", photo='" + photo + '\'' +
                ", status=" + status +
                ", defaultAddress=" + defaultAddress +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                '}';
    }
}