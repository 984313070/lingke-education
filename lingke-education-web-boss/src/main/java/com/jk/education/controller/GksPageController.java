package com.jk.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <pre>项目名称：lingke-education
 * 类名称：GksPageController
 * 类描述：
 * 创建人：顾可帅
 * 创建时间：2019-10-12 16:07
 * 修改人：顾可帅
 * 修改时间：2019-10-12 16:07
 * 修改备注：
 * @version </pre>
 */
@RequestMapping("/page")
@Controller
public class GksPageController {

    @RequestMapping("/toGksZixunguanli")
    public String toGksZixunguanli(){
        return "gks-neirongguanli/gks-Zixunguanli";
    }

    @RequestMapping("/toGksAddZixunguanli")
    public String toGksAddZixunguanli(){
        return "gks-neirongguanli/gks-addjiazixun";
    }

    /**
     * 展示页面
     * @return
     */
    @RequestMapping("/toGksshow")
    public String toGksshow(){
        return "gks-ketang/dianboketang/show";
    }

    /**
     * 添加页面
     * @return
     */
    @RequestMapping("/toGksadd")
    public String toGksadd(){
        return "gks-ketang/dianboketang/add";
    }

    /**
     * 添加课件
     * @return
     */
    @RequestMapping("/toGksaddkejian")
    public String toGksaddkejian(){
        return "gks-ketang/dianboketang/addkejian";
    }

    /**
     * 添加视频
     * @return
     */
    @RequestMapping("/toGksaddshipin")
    public String toGksaddshipin(){
        return "gks-ketang/dianboketang/addshipin";
    }

    /**
     * cc视频库
     * @return
     */
    @RequestMapping("/toGkscctongbushipin")
    public String toGkscctongbushipin(){
        return "gks-ketang/dianboketang/cctongbushipin";
    }

    /**
     * 待审
     * @return
     */
    @RequestMapping("/toGksdaishen")
    public String toGksdaishen(){
        return "gks-ketang/dianboketang/daishen";
    }

    /**
     * 回收站
     * @return
     */
    @RequestMapping("/toGkshuishouzhan")
    public String toGkshuishouzhan(){
        return "gks-ketang/dianboketang/huishouzhan";
    }

    /**
     * 课件库
     * @return
     */
    @RequestMapping("/toGkskejianku")
    public String toGkskejianku(){
        return "gks-ketang/dianboketang/kejianku";
    }

    /**
     * 视频弹题题库
     * @return
     */
    @RequestMapping("/toGksshipintanti")
    public String toGksshipintanti(){
        return "gks-ketang/dianboketang/shipintanti";
    }

    /**
     * 直播已审页面
     * @return
     */
    @RequestMapping("/tozbyishen")
    public String tozbyishen(){
        return "gks-ketang/zhiboke/zbyishen";
    }

    /**
     * 直播待审页面
     * @return
     */
    @RequestMapping("/tozbdaishen")
    public String tozbdaishen(){
        return "gks-ketang/zhiboke/zbdaishen";
    }

    /**
     * 直播回收站页面
     * @return
     */
    @RequestMapping("/tozbhuishouzhan")
    public String tozbhuishouzhan(){
        return "gks-ketang/zhiboke/zbhuishouzhan";
    }

    /**
     *跳转班级管理班级课列表
     * @return
     */
    @RequestMapping("/tobanjiliebiao")
    public String tobanjiliebiao(){
        return "gks-ketang/banjiguanli/banjiliebiao";
    }

    /**
     * 跳转班级管理班级课回收站
     * @return
     */
    @RequestMapping("/tobjhuishouzhan")
    public String tobjhuishouzhan(){
        return "gks-ketang/banjiguanli/banjikehuishouzhan";
    }





}
