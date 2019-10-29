package com.jk.education.ketang.common.model;

import lombok.Data;

import java.util.Date;

@Data
public class GksKejianku {
    private Integer id;

    private String coursewarename;

    private Integer uid;

    private String memoryaddress;

    private Integer texttypeid;

    private Date kjaddtime;

    private Integer tongbustatus;

    private Integer kjstatus;

    private String texttypename;

    private String username;
}