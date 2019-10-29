package com.jk.education.ketang.common.model;

import lombok.Data;

import java.util.Date;

@Data
public class BanJiKe {
    private Integer id;

    private String clazzname;

    private Float price;

    private Integer bjcountmark;

    private Integer bjcountmarkmarketing;

    private String bjimg;

    private Integer uid;

    private Date bjaddtime;

    private Date bjouttime;

    private Integer bjfenxiaostatus;

    private Integer status;

    private Integer bjtype;

    private Integer bjjigouid;

    private String bjjianjie;

    private Integer bjzhanshiweizhi;

    }