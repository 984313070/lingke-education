package com.jk.education.ketang.controller;

import com.jk.education.ketang.common.interfaces.GksDianBoKeTangServiceApi;
import com.jk.education.ketang.common.model.*;
import com.jk.education.ketang.service.GksDianBoKeTangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <pre>项目名称：lingke-education
 * 类名称：GksKeTangController
 * 类描述：
 * 创建人：顾可帅
 * 创建时间：2019-10-16 14:20
 * 修改人：顾可帅
 * 修改时间：2019-10-16 14:20
 * 修改备注：
 * @version </pre>
 */
@RestController
public class GksDianBoKeTangController implements GksDianBoKeTangServiceApi {

    @Autowired
    private GksDianBoKeTangService gksDianBoKeTangService;

    @Override
    public List<GksDianBoKeTang> gksfinddianbokechengAll(GksDianBoKeTang gksDianBoKeTang) {
        return gksDianBoKeTangService.gksfinddianbokechengAll(gksDianBoKeTang);
    }

    @Override
    public void gksUpdJinyongStatus(Integer id ,Integer jinyongstatus) {
        gksDianBoKeTangService.gksUpdJinyongStatus(id,jinyongstatus);
    }

    @Override
    public void gksUpdshangxiajiaStatus(Integer id, Integer shangxiajiastatus) {
        gksDianBoKeTangService.gksUpdshangxiajiaStatus(id,shangxiajiastatus);
    }

    @Override
    public void gksUpdfenxiaoStatus(Integer id, Integer fenxiaostatus) {
        gksDianBoKeTangService.gksUpdfenxiaoStatus(id,fenxiaostatus);
    }

    @Override
    public void gksUpdyxfenxiaoAll(Integer[] ids) {
        gksDianBoKeTangService.gksUpdyxfenxiaoAll(ids);
    }

    @Override
    public void gksUpdjzfenxiaoAll(Integer[] ids) {
        gksDianBoKeTangService.gksUpdjzfenxiaoAll(ids);
    }

    @Override
    public List<GksDianBoKeTang> finddianbokechenghszAll() {
        return gksDianBoKeTangService.finddianbokechenghszAll();
    }

    @Override
    public void delhszAll(Integer[] ids) {
        gksDianBoKeTangService.delhszAll(ids);
    }

    @Override
    public PageResult findketangkuAll(GksKejianku gksKejianku, Integer page, Integer rows) {
        return gksDianBoKeTangService.findketangkuAll(gksKejianku,page,rows);
    }

    @Override
    public void kejiankujinyong(Integer id, Integer kjstatus) {
        gksDianBoKeTangService.kejiankujinyong(id,kjstatus);
    }

    @Override
    public void delKejianku(Integer id) {
        gksDianBoKeTangService.delKejianku(id);
    }

    @Override
    public PageResult findshipintantiAll(GksShipintantitiku gksShipintantitiku, Integer page, Integer rows) {
        return gksDianBoKeTangService.findshipintantiAll(gksShipintantitiku,page,rows);
    }

    @Override
    public List<MajjShiti> findshitileixing() {
        return gksDianBoKeTangService.findshitileixing();
    }

    @Override
    public void delshipintanti(Integer id) {
        gksDianBoKeTangService.delshipintanti(id);
    }

    @Override
    public PageResult findzbyishenAll(Zbke zbke, Integer page, Integer rows) {
        return gksDianBoKeTangService.findzbyishenAll(zbke,page,rows);
    }

    @Override
    public void updzbfenxiaostatus(Integer id, Integer zbfenxiaostatus) {
        gksDianBoKeTangService.updzbfenxiaostatus(id,zbfenxiaostatus);
    }

    @Override
    public void zbjinyong(Integer id, Integer jinyongstatus) {
        gksDianBoKeTangService.zbjinyong(id,jinyongstatus);
    }

    @Override
    public PageResult findzbhuishouzhanAll(Zbke zbke, Integer page, Integer rows) {
        return gksDianBoKeTangService.findzbhuishouzhanAll(zbke,page,rows);
    }

    @Override
    public void delzbhuishouzhan(Integer id) {
        gksDianBoKeTangService.delzbhuishouzhan(id);
    }

    @Override
    public PageResult findbjliebiaoAll(BanJiKe banJiKe, Integer page, Integer rows) {
        return gksDianBoKeTangService.findbjliebiaoAll(banJiKe,page,rows);
    }

    @Override
    public void delbjliebiao(Integer id) {
        gksDianBoKeTangService.delbjliebiao(id);
    }

    @Override
    public void updbjfenxiaostatus(Integer id, Integer bjfenxiaostatus) {
        gksDianBoKeTangService.updbjfenxiaostatus(id,bjfenxiaostatus);
    }

    @Override
    public void updbjdelstatus(Integer id, Integer status) {
        gksDianBoKeTangService.updbjdelstatus(id,status);
    }

    @Override
    public PageResult findbjhishouzhanAll(BanJiKe banJiKe, Integer page, Integer rows) {
        return gksDianBoKeTangService.findbjhishouzhanAll(banJiKe,page,rows);
    }
}
