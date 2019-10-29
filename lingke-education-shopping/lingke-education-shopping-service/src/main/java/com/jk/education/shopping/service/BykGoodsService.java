package com.jk.education.shopping.service;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;

import java.util.List;

public interface BykGoodsService {
    List<BykGoods> findGoodsAll(BykGoods goods);

    Long findGoodsCount(BykGoods goods);

    void updateGoodsStatus(BykGoods goods);

    void deleteGoods(String ids);

    void updateStatus(Integer[] ids);

    List<BykGoods> findGoodsRecycleAll(BykGoods goods);

    Long findGoodsRecycleCount(BykGoods goods);

    void updateGoodsRecycleStatus(int id);

    List<BykGoodsType> findGoodsTypeList(int pid);

    void saveGoods(BykGoods goods);

    BykGoods findGoodsById(int id);
}
