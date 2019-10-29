package com.jk.education.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;
import com.jk.education.shopping.service.BykGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @类名: BykGoodsController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-16 16:10
 **/
@Controller
@RequestMapping("goods")
public class BykGoodsController {

    @Autowired
    private BykGoodService goodService;

    @RequestMapping("findGoodsAll")
    @ResponseBody
    public List<BykGoods> findGoodsAll(BykGoods goods){
        return goodService.findGoodsAll(goods);
    }

    @RequestMapping("findGoodsCount")
    @ResponseBody
    public Long findGoodsCount(BykGoods goods) {
        return goodService.findGoodsCount(goods);
    }

    @RequestMapping("updateGoodsStatus")
    @ResponseBody
    public Result updateGoodsStatus(BykGoods goods){
        return goodService.updateGoodsStatus(goods);
    }

    @RequestMapping("deleteGoods")
    @ResponseBody
    public Result deleteGoods(String ids){
        return goodService.deleteGoods(ids);
    }

    @RequestMapping("updateStatus")
    @ResponseBody
    public Result updateStatus(Integer[] ids){
        return goodService.updateStatus(ids);
    }

    @RequestMapping("findGoodsRecycleAll")
    @ResponseBody
    public List<BykGoods> findGoodsRecycleAll(BykGoods goods){
        return goodService.findGoodsRecycleAll(goods);
    }

    @RequestMapping("findGoodsRecycleCount")
    @ResponseBody
    public Long findGoodsRecycleCount(BykGoods goods){
        return goodService.findGoodsRecycleCount(goods);
    }

    @RequestMapping("updateGoodsRecycleStatus")
    @ResponseBody
    public Result updateGoodsRecycleStatus(int id){
        return goodService.updateGoodsRecycleStatus(id);
    }

    @RequestMapping("findGoodsTypeList")
    @ResponseBody
    public List<BykGoodsType> findGoodsTypeList(int pid){
        return goodService.findGoodsTypeList(pid);
    }

    @RequestMapping("saveGoods")
    @ResponseBody
    public Result saveGoods(BykGoods goods){
        return goodService.saveGoods(goods);
    }

    @RequestMapping("findGoodsById")
    public String findGoodsById(int id, Model model){
        BykGoods goodsById = goodService.findGoodsById(id);
        model.addAttribute("goods",goodsById);
        return "shopping/GoodsUpdate";
    }

    @RequestMapping("findGoodsDetail")
    @ResponseBody
    public BykGoods findGoodsDetail(int id){
        return goodService.findGoodsById(id);
    }
}