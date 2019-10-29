package com.jk.education.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykOrder;
import com.jk.education.shopping.common.utils.ExportExcel;
import com.jk.education.shopping.service.BykOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @类名: BykOrderController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-18 15:34
 **/
@Controller
@RequestMapping("order")
public class BykOrderController {

    @Autowired
    private BykOrderService orderService;

    @RequestMapping("findOrderList")
    @ResponseBody
    public List<BykOrder> findOrderList(int page,int rows,BykOrder order){
        return orderService.findOrderList(page,rows,order);
    }

    @RequestMapping("findOrderCount")
    @ResponseBody
    public Long findOrderCount(BykOrder order){
        return orderService.findOrderCount(order);
    }

    @RequestMapping("deleteOrder")
    @ResponseBody
    public Result deleteOrder(Integer[] ids){
        return orderService.deleteOrder(ids);
    }

    @RequestMapping("exportOrderList")
    public void exportResumeImgList(HttpServletResponse response,BykOrder order){
        //获得数据信息
        List<BykOrder> orderList = orderService.findOrder(order);
        //标题
        String title = "内容信息";
        String[] rowsName = new String[]{"编号","用户名","商品ID","商品名称","兑换价格(积分)","兑换数量","运费(积分)","地址","下单时间"};

        //定义数据集合
        List<Object[]> objects = new ArrayList<Object[]>();

        Object[] obj = null;

        for (int i = 0; i < orderList.size(); i++) {
            obj = new Object[rowsName.length];
            obj[0] = orderList.get(i).getId();
            obj[1] = orderList.get(i).getUid();
            obj[2] = orderList.get(i).getGoodsId();
            obj[3] = orderList.get(i).getGoodsName();
            obj[4] = orderList.get(i).getPrice();
            obj[5] = orderList.get(i).getCount();
            obj[6] = orderList.get(i).getFreight();
            obj[7] = orderList.get(i).getProvince()+" "+orderList.get(i).getCity()+""+orderList.get(i).getCounty();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            obj[8] = sdf.format(orderList.get(i).getRegTime());
            objects.add(obj);
        }

        ExportExcel exportExcel = new ExportExcel(title, rowsName, objects, response);
        try {
            exportExcel.export();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("findOrderById")
    @ResponseBody
    public BykOrder findOrderById(int id){
        return orderService.findOrderById(id);
    }
}