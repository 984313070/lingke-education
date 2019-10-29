package com.jk.education.ketang.service.Impl;

import com.jk.education.ketang.common.model.*;
import com.jk.education.ketang.mapper.*;
import com.jk.education.ketang.service.GksDianBoKeTangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <pre>项目名称：lingke-education
 * 类名称：GksKeTangServiceImpl
 * 类描述：
 * 创建人：顾可帅
 * 创建时间：2019-10-16 14:31
 * 修改人：顾可帅
 * 修改时间：2019-10-16 14:31
 * 修改备注：
 * @version </pre>
 */
@Service
public class GksDianBoKeTangServiceImpl implements GksDianBoKeTangService {

    @Autowired
    private GksDianBoKeTangMapper gksDianBoKeTangMapper;

    @Autowired
    private GksKejiankuMapper gksKejiankuMapper;

    @Autowired
    private GksShipintantitikuMapper gksShipintantitikuMapper;

    @Autowired
    private MajjShitiMapper majjShitiMapper;

    @Autowired
    private ZbkeMapper zbkeMapper;

    @Autowired
    private BanJiKeMapper banJiKeMapper;

    @Override
    public List<GksDianBoKeTang> gksfinddianbokechengAll(GksDianBoKeTang gksDianBoKeTang) {
        return gksDianBoKeTangMapper.gksfinddianbokechengAll(gksDianBoKeTang);
    }

    @Override
    public void gksUpdJinyongStatus(Integer id,Integer jinyongstatus) {
        gksDianBoKeTangMapper.gksUpdJinyongStatus(id,jinyongstatus);
    }

    @Override
    public void gksUpdshangxiajiaStatus(Integer id, Integer shangxiajiastatus) {
        if (shangxiajiastatus!=0){
            shangxiajiastatus=0;
        }else {
            shangxiajiastatus=1;
        }
        gksDianBoKeTangMapper.gksUpdshangxiajiaStatus(id,shangxiajiastatus);
    }

    @Override
    public void gksUpdfenxiaoStatus(Integer id, Integer fenxiaostatus) {
        if (fenxiaostatus!=0){
            fenxiaostatus=0;
        }else {
            fenxiaostatus=1;
        }
        gksDianBoKeTangMapper.gksUpdfenxiaoStatus(id,fenxiaostatus);
    }

    @Override
    public void gksUpdyxfenxiaoAll(Integer[] ids) {
        Integer fenxiaostatus=1;
        for (Integer id : ids) {
            gksDianBoKeTangMapper.gksUpdfenxiaoStatus(id,fenxiaostatus);
        }
    }

    @Override
    public void gksUpdjzfenxiaoAll(Integer[] ids) {
        Integer fenxiaostatus=0;
        for (Integer id : ids) {
            gksDianBoKeTangMapper.gksUpdfenxiaoStatus(id,fenxiaostatus);
        }
    }

    @Override
    public List<GksDianBoKeTang> finddianbokechenghszAll() {
        return gksDianBoKeTangMapper.finddianbokechenghszAll();
    }

    @Override
    public void delhszAll(Integer[] ids) {
        gksDianBoKeTangMapper.delhszAll(ids);
    }

    @Override
    public PageResult findketangkuAll(GksKejianku gksKejianku, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);

        int totalCount = gksKejiankuMapper.findTotalAll(gksKejianku);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<GksKejianku> list = gksKejiankuMapper.findketangkuAll(gksKejianku,start, rows);
        //设置当前页面数据
        result.setGksKejianku (list);
        return result;
    }

    @Override
    public void kejiankujinyong(Integer id, Integer kjstatus) {
        if (kjstatus!=0){
            kjstatus=0;
        }else {
            kjstatus=1;
        }
        gksKejiankuMapper.kejiankujinyong(id,kjstatus);
    }

    @Override
    public void delKejianku(Integer id) {
        gksKejiankuMapper.delKejianku(id);
    }

    @Override
    public PageResult findshipintantiAll(GksShipintantitiku gksShipintantitiku, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);
        int totalCount = gksShipintantitikuMapper.findshipintantiTotalAll(gksShipintantitiku);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<GksShipintantitiku> list = gksShipintantitikuMapper.findshipintantiAll(gksShipintantitiku,start, rows);
        //设置当前页面数据
        result.setGksShipintantitikus (list);
        return result;
    }

    @Override
    public List<MajjShiti> findshitileixing() {
        return majjShitiMapper.findshitileixing();
    }

    @Override
    public void delshipintanti(Integer id) {
        gksShipintantitikuMapper.delshipintanti(id);
    }

    @Override
    public PageResult findzbyishenAll(Zbke zbke, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);
        int totalCount = zbkeMapper.findcountzbyishenAll(zbke);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<Zbke> zbkes = zbkeMapper.findzbyishenAll (zbke, start, rows);
        //设置当前页面数据
        result.setZbkeList (zbkes);
        return result;
    }

    @Override
    public void updzbfenxiaostatus(Integer id, Integer zbfenxiaostatus) {
        if (zbfenxiaostatus!=0){
            zbfenxiaostatus=0;
        }else {
            zbfenxiaostatus=1;
        }
        zbkeMapper.updzbfenxiaostatus(id,zbfenxiaostatus);
    }

    @Override
    public void zbjinyong(Integer id, Integer jinyongstatus) {
        if (jinyongstatus!=0){
            jinyongstatus=0;
        }else {
            jinyongstatus=1;
        }
        zbkeMapper.zbjinyong(id,jinyongstatus);
    }

    @Override
    public PageResult findzbhuishouzhanAll(Zbke zbke, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);
        int totalCount = zbkeMapper.findcountzbhuishouzhanAll(zbke);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<Map> zbkehuishouzhans = zbkeMapper.findzbhuishouzhanAll (zbke, start, rows);
        //设置当前页面数据
        result.setResultMap (zbkehuishouzhans);
        return result;
    }

    @Override
    public void delzbhuishouzhan(Integer id) {
        zbkeMapper.deleteByPrimaryKey (id);
    }

    @Override
    public PageResult findbjliebiaoAll(BanJiKe banJiKe, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);
        int totalCount = banJiKeMapper.findcountbjliebiaoAll(banJiKe);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<Map> banjikeList = banJiKeMapper.findbjliebiaoAll (banJiKe, start, rows);
        //设置当前页面数据
        result.setResultMap (banjikeList);
        return result;
    }

    @Override
    public void delbjliebiao(Integer id) {
        banJiKeMapper.deleteByPrimaryKey (id);
    }

    @Override
    public void updbjfenxiaostatus(Integer id, Integer bjfenxiaostatus) {
        if (bjfenxiaostatus!=0){
            bjfenxiaostatus=0;
        }else {
            bjfenxiaostatus=1;
        }
        banJiKeMapper.updbjfenxiaostatus(id,bjfenxiaostatus);
    }

    @Override
    public void updbjdelstatus(Integer id, Integer status) {
        if (status!=0){
            status=0;
        }else {
            status=1;
        }
        banJiKeMapper.updbjdelstatus(id,status);
    }

    @Override
    public PageResult findbjhishouzhanAll(BanJiKe banJiKe, Integer page, Integer rows) {
        PageResult result = new PageResult();
        result.setNumPerPage(rows);
        result.setCurrent(page);
        int totalCount = banJiKeMapper.findclountbjhishouzhanAll(banJiKe);
        result.setTotalCount(totalCount);//设置总记录数
        int start = (page - 1)*rows;
        List<Map> banjikeList = banJiKeMapper.findbjhishouzhanAll (banJiKe, start, rows);
        //设置当前页面数据
        result.setResultMap (banjikeList);
        return result;
    }

}
