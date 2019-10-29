package com.jk.education.ketang.common.model;

import lombok.Data;

@Data
public class GksShipintantitiku {
    private Integer id;

    private String keticontent;

    private Integer shititypeid;

    private Integer kaodianid;

    private Integer shitinanduid;

    private String feileiname;       //对应MajjFenleitype实体类name字段

    private String feileiname1;

    private String feileiname2;

    private Integer pid;

    private Integer typeid;

    private String kaodianname;

    private String typename;

    private Integer keytype;

    private String shitiname;   //对应MajjShitinandu实体类 name字段
    }