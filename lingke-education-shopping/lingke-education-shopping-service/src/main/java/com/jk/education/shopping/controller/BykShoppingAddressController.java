package com.jk.education.shopping.controller;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.interfaces.BykShoppingAddressApi;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;
import com.jk.education.shopping.service.BykShoppingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @类名: BykShoppingAddressController
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-24 20:16
 **/
@RestController
public class BykShoppingAddressController implements BykShoppingAddressApi {

    @Autowired
    private BykShoppingAddressService shoppingAddressService;

    @Override
    public List<BykShoppingAddress> findShoppingAddressList(int page, int rows, BykShoppingAddress address) {
        return shoppingAddressService.findShoppingAddressList(page,rows,address);
    }

    @Override
    public Long findShoppingAddressCount(BykShoppingAddress address) {
        return shoppingAddressService.findShoppingAddressCount(address);
    }

    @Override
    public Result deleteShoppingAddress(Integer[] ids) {
        try {
            shoppingAddressService.deleteShoppingAddress(ids);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @Override
    public List<BykShoppingAddress> findShoppingAddress() {
        return shoppingAddressService.findShoppingAddress();
    }

    @Override
    public Result updateShoppingAddressStatus(BykShoppingAddress address) {
        try {
            shoppingAddressService.updateShoppingAddressStatus(address);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }

    @Override
    public Result deleteShoppingAddressById(int id) {
        try {
            shoppingAddressService.deleteShoppingAddressById(id);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"删除失败");
        }
    }

    @Override
    public List<BykArea> findAreaList(int pid) {
        return shoppingAddressService.findAreaList(pid);
    }

    @Override
    public Result saveShoppingAddress(BykShoppingAddress address) {
        try {
            shoppingAddressService.saveShoppingAddress(address);
            return new Result(true,"新增成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"新增失败");
        }
    }

    @Override
    public BykShoppingAddress findShoppingAddressById(int id) {
        return shoppingAddressService.findShoppingAddressById(id);
    }

    @Override
    public Result updateShoppingAddress(BykShoppingAddress address) {
        try {
            shoppingAddressService.updateShoppingAddress(address);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"修改失败");
        }
    }
}