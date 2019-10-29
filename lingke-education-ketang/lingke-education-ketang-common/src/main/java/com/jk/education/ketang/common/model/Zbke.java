package com.jk.education.ketang.common.model;

import lombok.Data;

import java.util.Date;

@Data
public class Zbke {
    private Integer id;

    private String zbketangname;

    private String zbimg;

    private Float zbmarketprice;

    private Float zbsalesprice;

    private Integer organid;

    private Integer uid;

    private Integer teacherid;

    private Integer grade;

    private Integer zbcountmark;

    private Integer zbcountmarkmarketing;

    private String zbputawaytime;

    private Integer maxcomplication;

    private Integer zbsiftstart;

    private Integer zbfeestart;

    private Integer zbtypeid;

    private Integer jinyongstatus;

    private Integer zbfenxiaostatus;

    private String zbouttime;

    private String teachername;     //讲师名称

    private String username;        //用户名称

    private String zbname;         //直播类型

    private String organname;     //机构名称
}