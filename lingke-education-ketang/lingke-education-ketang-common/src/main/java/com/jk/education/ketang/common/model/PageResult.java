package com.jk.education.ketang.common.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
public class PageResult {

    private int current;//当前页
    private int end;//尾页
    private int numPerPage;//每页记录数
    private int totalCount;//总记录数
    private List<GksKejianku> GksKejianku;                  //课件库数据
    /**
     * 视频弹题数据
     */
    private List<GksShipintantitiku> gksShipintantitikus;   //视频弹题数据

    private List<Zbke> zbkeList;        //直播课数据
    private List<Map> resultMap;
}
