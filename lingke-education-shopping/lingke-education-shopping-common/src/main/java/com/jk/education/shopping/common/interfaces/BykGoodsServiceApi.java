package com.jk.education.shopping.common.interfaces;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykGoods;
import com.jk.education.shopping.common.model.BykGoodsType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface BykGoodsServiceApi {

    @RequestMapping("findGoodsAll")
    public List<BykGoods> findGoodsAll(@RequestBody BykGoods goods);

    @RequestMapping("findGoodsCount")
    public Long findGoodsCount(@RequestBody BykGoods goods);

    @RequestMapping("updateGoodsStatus")
    public Result updateGoodsStatus(@RequestBody BykGoods goods);

    @RequestMapping("deleteGoods")
    Result deleteGoods(@RequestParam("ids") String ids);

    @RequestMapping("updateStatus")
    Result updateStatus(@RequestParam("ids") Integer[] ids);

    @RequestMapping("findGoodsRecycleAll")
    List<BykGoods> findGoodsRecycleAll(@RequestBody BykGoods goods);

    @RequestMapping("findGoodsRecycleCount")
    Long findGoodsRecycleCount(@RequestBody BykGoods goods);

    @RequestMapping("updateGoodsRecycleStatus")
    Result updateGoodsRecycleStatus(@RequestParam("id") int id);

    @RequestMapping("findGoodsTypeList")
    List<BykGoodsType> findGoodsTypeList(@RequestParam("pid") int pid);

    @RequestMapping("saveGoods")
    Result saveGoods(@RequestBody BykGoods goods);

    @RequestMapping("findGoodsById")
    BykGoods findGoodsById(@RequestParam("id") int id);
}
