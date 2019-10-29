package com.jk.education.shopping.service;

import com.jk.education.shopping.common.model.BykOrder;

import java.util.List;

public interface BykOrderService {
    List<BykOrder> findOrderList(int page,int rows,BykOrder order);

    List<BykOrder> findOrder(BykOrder order);

    Long findOrderCount(BykOrder order);

    void deleteOrder(Integer[] ids);

    BykOrder findOrderById(int id);
}
