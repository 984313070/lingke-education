package com.jk.education.shopping.service.impl;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;
import com.jk.education.shopping.mapper.BykShoppingAddressMapper;
import com.jk.education.shopping.service.BykShoppingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @类名: BykShoppingAddressServiceImpl
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-24 20:20
 **/
@Service
public class BykShoppingAddressServiceImpl implements BykShoppingAddressService {

    @Autowired
    private BykShoppingAddressMapper shoppingAddressMapper;

    @Override
    public List<BykShoppingAddress> findShoppingAddressList(int page, int rows, BykShoppingAddress address) {
        int firstNum = (page-1)*rows;
        int lastNum = page*rows;
        return shoppingAddressMapper.findShoppingAddressList(firstNum,lastNum,address);
    }

    @Override
    public Long findShoppingAddressCount(BykShoppingAddress address) {
        return shoppingAddressMapper.findShoppingAddressCount(address);
    }

    @Override
    public void deleteShoppingAddress(Integer[] ids) {
        for (Integer id : ids) {
            shoppingAddressMapper.deleteShoppingAddressById(id);
        }
    }

    @Override
    public List<BykShoppingAddress> findShoppingAddress() {
        return shoppingAddressMapper.findShoppingAddress();
    }

    @Override
    public void updateShoppingAddressStatus(BykShoppingAddress address) {
        shoppingAddressMapper.updateShoppingAddressStatus(address);
    }

    @Override
    public void deleteShoppingAddressById(int id) {
        shoppingAddressMapper.deleteShoppingAddressById(id);
    }

    @Override
    public List<BykArea> findAreaList(int pid) {
        return shoppingAddressMapper.findAreaList(pid);
    }

    @Override
    public void saveShoppingAddress(BykShoppingAddress address) {
        shoppingAddressMapper.saveShoppingAddress(address);
    }

    @Override
    public BykShoppingAddress findShoppingAddressById(int id) {
        return shoppingAddressMapper.findShoppingAddressById(id);
    }

    @Override
    public void updateShoppingAddress(BykShoppingAddress address) {
        shoppingAddressMapper.updateShoppingAddress(address);
    }

}