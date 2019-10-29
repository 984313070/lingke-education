package com.jk.education.shopping.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.interfaces.BykOrderServiceApi;
import com.jk.education.shopping.common.model.BykOrder;
import com.jk.education.shopping.service.BykOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: BykOrderController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-18 15:54
 **/
@RestController
public class BykOrderController implements BykOrderServiceApi {

    @Autowired
    private BykOrderService orderService;

    @Override
    public List<BykOrder> findOrderList(int page,int rows,BykOrder order) {
        return orderService.findOrderList(page,rows,order);
    }

    @Override
    public List<BykOrder> findOrder(BykOrder order) {
        return orderService.findOrder(order);
    }

    @Override
    public Long findOrderCount(BykOrder order) {
        return orderService.findOrderCount(order);
    }

    @Override
    public Result deleteOrder(Integer[] ids) {
        try {
            orderService.deleteOrder(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @Override
    public BykOrder findOrderById(int id) {
        return orderService.findOrderById(id);
    }
}