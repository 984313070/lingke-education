package com.jk.education.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @类名: BykPageController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-16 13:35
 **/
@Controller
@RequestMapping("page")
public class BykPageController {

    @RequestMapping("toGoodsDetails")
    public String toGoodsDetails(int id,Model model){
        model.addAttribute("id",id);
        return "shopping/goodsDetails";
    }

    @RequestMapping("toShoppingAddressUpdate")
    public String toShoppingAddressUpdate(int id,Model model){
        model.addAttribute("id",id);
        return "shopping/shoppingAddressUpdate";
    }

    @RequestMapping("toLogisticsInfo")
    public String toLogisticsInfo(){
        return "shopping/logisticsInfo";
    }

    @RequestMapping("toMall")
    public String toMall(){
        return "shopping/mall";
    }

    @RequestMapping("toShoppingAddressAdd")
    public String toShoppingAddressAdd(){
        return "shopping/shoppingAddressAdd";
    }

    @RequestMapping("toShoppingAddress")
    public String toShoppingAddress(){
        return "shopping/shoppingAddress";
    }

    @RequestMapping("toGoods")
    public String toGoods(){
        return "shopping/goods";
    }

    @RequestMapping("toGoodsRecycle")
    public String toGoodsRecycle(){
        return "shopping/goodsRecycle";
    }

    @RequestMapping("toGoodsAdd")
    public String toGoodsAdd(){
        return "shopping/goodsAdd";
    }

    @RequestMapping("toOrder")
    public String toOrder(){
        return "shopping/order";
    }

    @RequestMapping("toOrderDetails")
    public String toOrderDetails(Model model,int id){
        model.addAttribute("id",id);
        return "shopping/orderDetails";
    }

}