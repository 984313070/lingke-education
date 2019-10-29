package com.jk.education.shopping.service.impl;

import com.jk.education.shopping.common.model.BykOrder;
import com.jk.education.shopping.mapper.BykOrderMapper;
import com.jk.education.shopping.service.BykOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @类名: BykOrderServiceImpl
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-18 15:56
 **/
@Service
public class BykOrderServiceImpl implements BykOrderService {

    @Autowired
    private BykOrderMapper orderMapper;

    @Override
    public List<BykOrder> findOrderList(int page,int rows,BykOrder order) {
        int firstNum = (page-1)*rows;
        int lastNum = page*rows;
        return orderMapper.findOrderList(firstNum,lastNum,order);
    }

    @Override
    public List<BykOrder> findOrder(BykOrder order) {
        return orderMapper.findOrder(order);
    }

    @Override
    public Long findOrderCount(BykOrder order) {
        return orderMapper.findOrderCount(order);
    }

    @Override
    public void deleteOrder(Integer[] ids) {
        for (Integer id : ids) {
            orderMapper.deleteOrderById(id);
        }
    }

    @Override
    public BykOrder findOrderById(int id) {
        return orderMapper.findOrderById(id);
    }
}