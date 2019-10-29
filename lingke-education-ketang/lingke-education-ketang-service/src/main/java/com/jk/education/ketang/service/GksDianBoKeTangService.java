package com.jk.education.ketang.service;

import com.jk.education.ketang.common.model.*;

import java.util.List;

public interface GksDianBoKeTangService {

    List<GksDianBoKeTang> gksfinddianbokechengAll( GksDianBoKeTang gksDianBoKeTang);

    void gksUpdJinyongStatus(Integer id,Integer jinyongstatus);

    void gksUpdshangxiajiaStatus(Integer id, Integer shangxiajiastatus);

    void gksUpdfenxiaoStatus(Integer id, Integer fenxiaostatus);

    void gksUpdyxfenxiaoAll(Integer[] ids);

    void gksUpdjzfenxiaoAll(Integer[] ids);

    List<GksDianBoKeTang> finddianbokechenghszAll();

    void delhszAll(Integer[] ids);

    PageResult findketangkuAll(GksKejianku gksKejianku, Integer page, Integer rows);

    void kejiankujinyong(Integer id, Integer kjstatus);

    void delKejianku(Integer id);

    PageResult findshipintantiAll(GksShipintantitiku gksShipintantitiku, Integer page, Integer rows);

    List<MajjShiti> findshitileixing();

    void delshipintanti(Integer id);

    PageResult findzbyishenAll(Zbke zbke, Integer page, Integer rows);

    void updzbfenxiaostatus(Integer id, Integer zbfenxiaostatus);

    void zbjinyong(Integer id, Integer jinyongstatus);

    PageResult findzbhuishouzhanAll(Zbke zbke, Integer page, Integer rows);

    void delzbhuishouzhan(Integer id);

    PageResult findbjliebiaoAll(BanJiKe banJiKe, Integer page, Integer rows);

    void delbjliebiao(Integer id);

    void updbjfenxiaostatus(Integer id, Integer bjfenxiaostatus);

    void updbjdelstatus(Integer id, Integer status);

    PageResult findbjhishouzhanAll(BanJiKe banJiKe, Integer page, Integer rows);
}
