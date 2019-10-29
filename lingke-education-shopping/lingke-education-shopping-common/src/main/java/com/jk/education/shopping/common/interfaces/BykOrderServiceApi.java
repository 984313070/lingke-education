package com.jk.education.shopping.common.interfaces;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykOrder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BykOrderServiceApi {

    @RequestMapping("findOrderList")
    List<BykOrder> findOrderList(@RequestParam("page") int page,@RequestParam("rows") int rows,@RequestBody BykOrder order);

    @RequestMapping("findOrder")
    List<BykOrder> findOrder(@RequestBody BykOrder order);

    @RequestMapping("findOrderCount")
    Long findOrderCount(@RequestBody BykOrder order);

    @RequestMapping("deleteOrder")
    Result deleteOrder(@RequestParam("ids") Integer[] ids);

    @RequestMapping("findOrderById")
    BykOrder findOrderById(@RequestParam("id") int id);
}
