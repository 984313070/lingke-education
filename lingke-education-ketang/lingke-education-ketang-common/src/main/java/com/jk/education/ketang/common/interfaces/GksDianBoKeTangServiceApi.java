package com.jk.education.ketang.common.interfaces;

import com.jk.education.ketang.common.model.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface GksDianBoKeTangServiceApi {

    @RequestMapping("/gksfinddianbokechengAll")
    public List<GksDianBoKeTang> gksfinddianbokechengAll(@RequestBody GksDianBoKeTang gksDianBoKeTang);

    @RequestMapping("/gksUpdJinyongStatus")
    void gksUpdJinyongStatus(@RequestBody  Integer id,@RequestParam Integer jinyongstatus);

    @RequestMapping("/gksUpdshangxiajiaStatus")
    void gksUpdshangxiajiaStatus(@RequestBody  Integer id, @RequestParam Integer shangxiajiastatus);

    @RequestMapping("/gksUpdfenxiaoStatus")
    void gksUpdfenxiaoStatus(@RequestBody  Integer id, @RequestParam Integer fenxiaostatus);

    @RequestMapping("/gksUpdyxfenxiaoAll")
    void gksUpdyxfenxiaoAll(@RequestBody Integer[] ids);

    @RequestMapping("/gksUpdjzfenxiaoAll")
    void gksUpdjzfenxiaoAll(@RequestBody Integer[] ids);

    @RequestMapping("/finddianbokechenghszAll")
    List<GksDianBoKeTang> finddianbokechenghszAll();

    @RequestMapping("/delhszAll")
    void delhszAll(@RequestBody Integer[] ids);

    @RequestMapping("/findketangkuAll")
    PageResult findketangkuAll(@RequestBody GksKejianku gksKejianku,@RequestParam Integer page,@RequestParam Integer rows);

    @RequestMapping("/kejiankujinyong")
    void kejiankujinyong(@RequestBody Integer id,@RequestParam Integer kjstatus);

    @RequestMapping("/delKejianku")
    void delKejianku(@RequestBody Integer id);

    @RequestMapping("/findshipintantiAll")
    PageResult findshipintantiAll(@RequestBody GksShipintantitiku gksShipintantitiku,@RequestParam Integer page,@RequestParam Integer rows);

    @RequestMapping("/findshitileixing")
    List<MajjShiti> findshitileixing();

    @RequestMapping("/delshipintanti")
    void delshipintanti(@RequestBody Integer id);

    @RequestMapping("/findzbyishenAll")
    PageResult findzbyishenAll(@RequestBody Zbke zbke,@RequestParam Integer page, @RequestParam Integer rows);

    @RequestMapping("/updzbfenxiaostatus")
    void updzbfenxiaostatus(@RequestBody Integer id,@RequestParam Integer zbfenxiaostatus);

    @RequestMapping("/zbjinyong")
    void zbjinyong(@RequestBody Integer id,@RequestParam Integer jinyongstatus);

    @RequestMapping("/findzbhuishouzhanAll")
    PageResult findzbhuishouzhanAll(@RequestBody Zbke zbke, @RequestParam Integer page,@RequestParam  Integer rows);

    @RequestMapping("/delzbhuishouzhan")
    void delzbhuishouzhan(@RequestBody Integer id);

    @RequestMapping("/findbjliebiaoAll")
    PageResult findbjliebiaoAll(@RequestBody BanJiKe banJiKe,@RequestParam Integer page, @RequestParam Integer rows);

    @RequestMapping("/delbjliebiao")
    void delbjliebiao(@RequestBody Integer id);

    @RequestMapping("/updbjfenxiaostatus")
    void updbjfenxiaostatus(@RequestBody Integer id,@RequestParam Integer bjfenxiaostatus);

    @RequestMapping("/updbjdelstatus")
    void updbjdelstatus(@RequestBody Integer id, @RequestParam Integer status);

    @RequestMapping("/findbjhishouzhanAll")
    PageResult findbjhishouzhanAll(@RequestBody BanJiKe banJiKe, @RequestParam Integer page, @RequestParam Integer rows);
}
