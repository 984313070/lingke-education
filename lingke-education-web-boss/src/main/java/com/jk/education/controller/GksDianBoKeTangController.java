package com.jk.education.controller;

import com.jk.education.ketang.common.model.*;
import com.jk.education.ketang.service.GksDianBoKeTangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <pre>项目名称：lingke-education
 * 类名称：GksKejianController
 * 类描述：
 * 创建人：顾可帅
 * 创建时间：2019-10-16 14:09
 * 修改人：顾可帅
 * 修改时间：2019-10-16 14:09
 * 修改备注：
 * @version </pre>
 */
@Controller
public class GksDianBoKeTangController {

    @Autowired
    private GksDianBoKeTangService gksDianBoKeTangService;

    /**
     * 查询点播课管理已审方法
     * @param
     * @return
     */
    @RequestMapping("/gksfinddianbokechengAll")
    @ResponseBody
    public List<GksDianBoKeTang> gksfinddianbokechengAll(GksDianBoKeTang gksDianBoKeTang){
        return gksDianBoKeTangService.gksfinddianbokechengAll(gksDianBoKeTang);
    }

    /**
     * 点播课管理已审页面禁用功能 和 回收站启用功能
     * @param id
     * @param jinyongstatus
     * @return
     */
    @RequestMapping("/gksUpdJinyongStatus")
    @ResponseBody
    public Boolean gksUpdJinyongStatus(Integer id ,Integer jinyongstatus){
        try {
            gksDianBoKeTangService.gksUpdJinyongStatus(id,jinyongstatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 点播课管理已审页面批量禁用功能
     * @param ids
     * @return
     */
    @RequestMapping("/gksUpdJinyongStatusAll")
    @ResponseBody
    public Boolean gksUpdJinyongStatusAll(Integer[] ids,Integer jinyongstatus){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.gksUpdJinyongStatus(id,jinyongstatus);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 点播课管理已审页面上下架功能
     * @param id
     * @param shangxiajiastatus
     * @return
     */
    @RequestMapping("/gksUpdshangxiajiaStatus")
    @ResponseBody
    public Boolean gksUpdshangxiajiaStatus(Integer id,Integer shangxiajiastatus){
        try {
            gksDianBoKeTangService.gksUpdshangxiajiaStatus(id,shangxiajiastatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 点播课管理已审页面分销功能
     * @param id
     * @param fenxiaostatus
     * @return
     */
    @RequestMapping("/gksUpdfenxiaoStatus")
    @ResponseBody
    public Boolean gksUpdfenxiaoStatus(Integer id,Integer fenxiaostatus){
        try {
            gksDianBoKeTangService.gksUpdfenxiaoStatus(id,fenxiaostatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 批量允许分销
     * @param ids
     * @return
     */
    @RequestMapping("/gksUpdyxfenxiaoAll")
    @ResponseBody
    public Boolean gksUpdyxfenxiaoAll(Integer[] ids){

        try {
            gksDianBoKeTangService.gksUpdyxfenxiaoAll(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
   }

    /**
     * 批量禁止分销
     * @param ids
     * @return
     */
    @RequestMapping("/gksUpdjzfenxiaoAll")
    @ResponseBody
    public Boolean gksUpdjzfenxiaoAll(Integer[] ids){
        try {
            gksDianBoKeTangService.gksUpdjzfenxiaoAll(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
   }

    /**
     * 查询回收站
     * @return
     */
    @RequestMapping("/finddianbokechenghszAll")
    @ResponseBody
   public List<GksDianBoKeTang> finddianbokechenghszAll(){
        return gksDianBoKeTangService.finddianbokechenghszAll();
   }

    /**
     * 回收站页面彻底删除
     * @param ids
     * @return
     */
    @RequestMapping("/delhszAll")
    @ResponseBody
   public Boolean delhszAll(Integer[] ids){
        try {
            gksDianBoKeTangService.delhszAll(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
   }

    /**
     * 课件库查询
     * @param gksKejianku
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findketangkuAll")
    @ResponseBody
   public PageResult findketangkuAll(GksKejianku gksKejianku , @RequestParam(defaultValue = "1") Integer page,  @RequestParam(defaultValue = "20") Integer rows){
        return gksDianBoKeTangService.findketangkuAll(gksKejianku,page,rows);
   }

    /**
     * 课件库页面禁用按钮
     * @param id
     * @param kjstatus
     * @return
     */
    @RequestMapping("/kejiankujinyong")
    @ResponseBody
   public Boolean kejiankujinyong(Integer id ,Integer kjstatus){
        try {
            gksDianBoKeTangService.kejiankujinyong(id,kjstatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
   }

    /**
     * 删除课件库
     * @param id
     * @return
     */
    @RequestMapping("/delKejianku")
    @ResponseBody
   public Boolean delKejianku(Integer id){
       try {
           gksDianBoKeTangService.delKejianku(id);
           return true;
       } catch (Exception e) {
           e.printStackTrace ();
       }
       return false;
   }

    /**
     * 批量课堂禁用
     * @param ids
     * @return
     */
    @RequestMapping("/kejiankujinyongAll")
    @ResponseBody
   public Boolean kejiankujinyongAll(Integer[] ids){
        int kjstatus=0;
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.kejiankujinyong(id,kjstatus);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
   }

    /**
     * 视频弹题题库查询
     * @param gksShipintantitiku
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findshipintantiAll")
    @ResponseBody
    public PageResult findshipintantiAll(GksShipintantitiku gksShipintantitiku, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer rows){
        return gksDianBoKeTangService.findshipintantiAll(gksShipintantitiku,page,rows);
    }

    /**
     * 查询试题类型
     * @return
     */
    @RequestMapping("/findshitileixing")
    @ResponseBody
    public List<MajjShiti> findshitileixing(){
        return gksDianBoKeTangService.findshitileixing();
    }

    /**
     * 视频弹题题库单删
     * @param id
     * @return
     */
    @RequestMapping("/delshipintanti")
    @ResponseBody
    public  Boolean delshipintanti(Integer id){
        try {
            gksDianBoKeTangService.delshipintanti(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 视频弹题题库批删
     * @param ids
     * @return
     */
    @RequestMapping("/delshipintantiAll")
    @ResponseBody
    public  Boolean delshipintanti(Integer[] ids){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.delshipintanti(id);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 分页条查直播已审页面
     * @param zbke
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findzbyishenAll")
    @ResponseBody
    public PageResult findzbyishenAll(Zbke zbke,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer rows){
        return gksDianBoKeTangService.findzbyishenAll(zbke,page,rows);
    }


    /**
     * 修改直播分销状态
     * @param id
     * @param zbfenxiaostatus
     * @return
     */
    @RequestMapping("/updzbfenxiaostatus")
    @ResponseBody
    public Boolean updzbfenxiaostatus(Integer id,Integer zbfenxiaostatus){
        try {
            gksDianBoKeTangService.updzbfenxiaostatus(id,zbfenxiaostatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 批量修改分销状态
     * @param ids
     * @param zbfenxiaostatus
     * @return
     */
    @RequestMapping("/updzbfenxiaostatusAll")
    @ResponseBody
    public Boolean updzbfenxiaostatusAll(Integer[] ids,Integer zbfenxiaostatus){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.updzbfenxiaostatus(id,zbfenxiaostatus);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 直播页面禁用
     * @return
     */
    @RequestMapping("/zbjinyong")
    @ResponseBody
    public Boolean zbjinyong(Integer id,Integer jinyongstatus){
        try {
            gksDianBoKeTangService.zbjinyong(id,jinyongstatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 直播页面批量禁用
     * @param ids
     * @return
     */
    @RequestMapping("/zbjinyongAll")
    @ResponseBody
    public Boolean zbjinyongAll(Integer[] ids,Integer jinyongstatus){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.zbjinyong(id,jinyongstatus);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 直播回收站查询
     * @param zbke
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findzbhuishouzhanAll")
    @ResponseBody
    public PageResult findzbhuishouzhanAll(Zbke zbke,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer rows){
        return gksDianBoKeTangService.findzbhuishouzhanAll(zbke,page,rows);
    }

    /**
     * 直播回收站物理删除
     * @param ids
     * @return
     */
    @RequestMapping("/delzbhuishouzhan")
    @ResponseBody
    public Boolean delzbhuishouzhan(Integer[] ids){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.delzbhuishouzhan(id);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 查询班级列表
     * @param banJiKe
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/findbjliebiaoAll")
    @ResponseBody
    public PageResult findbjliebiaoAll(BanJiKe banJiKe,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20") Integer rows){
        return gksDianBoKeTangService.findbjliebiaoAll(banJiKe,page,rows);
    }

    /**
     * 删除班级列表
     * @param id
     * @return
     */

    @RequestMapping("/delbjliebiao")
    @ResponseBody
    public Boolean delbjliebiao(Integer id){
        try {
            gksDianBoKeTangService.delbjliebiao(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 批量删除班级列表
     * @param ids
     * @return
     */
    @RequestMapping("/delbjliebiaoAll")
    @ResponseBody
    public Boolean delbjliebiaoAll(Integer[] ids){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.delbjliebiao(id);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 修改分销状态
     * @param id
     * @param bjfenxiaostatus
     * @return
     */
    @RequestMapping("/updbjfenxiaostatus")
    @ResponseBody
    public Boolean updbjfenxiaostatus(Integer id,Integer bjfenxiaostatus){
        try {
            gksDianBoKeTangService.updbjfenxiaostatus(id,bjfenxiaostatus);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 批量修改分销状态
     * @param ids
     * @param bjfenxiaostatus
     * @return
     */
    @RequestMapping("/updbjfenxiaostatusAll")
    @ResponseBody
    public Boolean updbjfenxiaostatusAll(Integer[] ids,Integer bjfenxiaostatus){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.updbjfenxiaostatus(id,bjfenxiaostatus);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 批量逻辑删除班级课
     * @param ids
     * @param status
     * @return
     */
    @RequestMapping("/updbjdelstatusAll")
    @ResponseBody
    public Boolean  updbjdelstatusAll(Integer[] ids,Integer status){
        try {
            for (Integer id : ids) {
                gksDianBoKeTangService.updbjdelstatus(id,status);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }

        return false;
    }

    /**
     * 逻辑删除班级课
     * @param id
     * @param status
     * @return
     */
    @RequestMapping("/updbjdelstatus")
    @ResponseBody
    public Boolean  updbjdelstatus(Integer id,Integer status){
        try {
            gksDianBoKeTangService.updbjdelstatus(id,status);
            return true;
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return false;
    }

    /**
     * 班级课回收站查询
     * @return
     */
    @RequestMapping("/findbjhishouzhanAll")
    @ResponseBody
    public PageResult findbjhishouzhanAll(BanJiKe banJiKe ,@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "20")Integer rows){
        return gksDianBoKeTangService.findbjhishouzhanAll(banJiKe,page,rows);
    }
}
