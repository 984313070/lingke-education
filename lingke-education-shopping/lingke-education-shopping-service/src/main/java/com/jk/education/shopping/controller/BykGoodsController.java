package com.jk.education.shopping.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.interfaces.BykGoodsServiceApi;
import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;
import com.jk.education.shopping.service.BykGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: BykGoodsController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-16 15:45
 **/
@RestController
public class BykGoodsController implements BykGoodsServiceApi {

    @Autowired
    private BykGoodsService goodsService;

    @Override
    public List<BykGoods> findGoodsAll(@RequestBody BykGoods goods) {
        return goodsService.findGoodsAll(goods);
    }

    @Override
    public Long findGoodsCount(BykGoods goods) {
        return goodsService.findGoodsCount(goods);
    }

    @Override
    public Result updateGoodsStatus(BykGoods goods) {
        try {
            goodsService.updateGoodsStatus(goods);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @Override
    public Result deleteGoods(String ids) {
        try {
            goodsService.deleteGoods(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @Override
    public Result updateStatus(Integer[] ids) {
        try {
            goodsService.updateStatus(ids);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @Override
    public List<BykGoods> findGoodsRecycleAll(BykGoods goods) {
        return goodsService.findGoodsRecycleAll(goods);
    }

    @Override
    public Long findGoodsRecycleCount(BykGoods goods) {
        return goodsService.findGoodsRecycleCount(goods);
    }

    @Override
    public Result updateGoodsRecycleStatus(int id) {
        try {
            goodsService.updateGoodsRecycleStatus(id);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @Override
    public List<BykGoodsType> findGoodsTypeList(int pid) {
        return goodsService.findGoodsTypeList(pid);
    }

    @Override
    public Result saveGoods(BykGoods goods) {
        try {
            goodsService.saveGoods(goods);
            return new Result(true,"新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"新增失败");
        }
    }

    @Override
    public BykGoods findGoodsById(int id) {
        return goodsService.findGoodsById(id);
    }
}