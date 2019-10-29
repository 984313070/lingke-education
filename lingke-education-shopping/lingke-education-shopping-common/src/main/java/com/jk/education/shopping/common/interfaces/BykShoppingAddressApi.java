package com.jk.education.shopping.common.interfaces;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public interface BykShoppingAddressApi {

    @RequestMapping("findShoppingAddressList")
    List<BykShoppingAddress> findShoppingAddressList(@RequestParam("page") int page,@RequestParam("rows") int rows,@RequestBody BykShoppingAddress address);

    @RequestMapping("findShoppingAddressCount")
    Long findShoppingAddressCount(@RequestBody BykShoppingAddress address);

    @RequestMapping("deleteShoppingAddress")
    Result deleteShoppingAddress(@RequestParam("ids") Integer[] ids);

    @RequestMapping("findShoppingAddress")
    List<BykShoppingAddress> findShoppingAddress();

    @RequestMapping("updateShoppingAddressStatus")
    Result updateShoppingAddressStatus(@RequestBody BykShoppingAddress address);

    @RequestMapping("deleteShoppingAddressById")
    Result deleteShoppingAddressById(@RequestParam("id") int id);

    @RequestMapping("findAreaList")
    List<BykArea> findAreaList(@RequestParam("pid") int pid);

    @RequestMapping("saveShoppingAddress")
    Result saveShoppingAddress(@RequestBody BykShoppingAddress address);

    @RequestMapping("findShoppingAddressById")
    BykShoppingAddress findShoppingAddressById(@RequestParam("id") int id);

    @RequestMapping("updateShoppingAddress")
    Result updateShoppingAddress(@RequestBody BykShoppingAddress address);
}
