package com.jk.education.shopping.service.impl;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;
import com.jk.education.shopping.mapper.BykGoodsMapper;
import com.jk.education.shopping.service.BykGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @类名: BykGoodsServiceImpl
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-16 15:47
 **/
@Service
public class BykGoodsServiceImpl implements BykGoodsService {

    @Autowired
    private BykGoodsMapper goodsMapper;

    @Override
    public List<BykGoods> findGoodsAll(BykGoods goods) {
        List<BykGoods> list = goodsMapper.findGoodsAll(goods);
        return list;
    }

    @Override
    public Long findGoodsCount(BykGoods goods) {
        return goodsMapper.findGoodsCount(goods);
    }

    @Override
    public void updateGoodsStatus(BykGoods goods) {
        goodsMapper.updateGoodsStatus(goods);
    }

    @Override
    public void deleteGoods(String ids) {
        goodsMapper.deleteGoods(ids);
    }

    @Override
    public void updateStatus(Integer[] ids) {
        for (Integer id : ids) {
            goodsMapper.updateStatus(id);
        }
    }

    @Override
    public List<BykGoods> findGoodsRecycleAll(BykGoods goods) {
        return goodsMapper.findGoodsRecycleAll(goods);
    }

    @Override
    public Long findGoodsRecycleCount(BykGoods goods) {
        return goodsMapper.findGoodsRecycleCount(goods);
    }

    @Override
    public void updateGoodsRecycleStatus(int id) {
        goodsMapper.updateGoodsRecycleStatus(id);
    }

    @Override
    public List<BykGoodsType> findGoodsTypeList(int pid) {
        return goodsMapper.findGoodsTypeList(pid);
    }

    @Override
    public void saveGoods(BykGoods goods) {
        goods.setRegtime(new Date());
        goodsMapper.insert(goods);
    }

    @Override
    public BykGoods findGoodsById(int id) {
        return goodsMapper.selectByPrimaryKey(id);
    }
}