package com.jk.education.shopping.service;

import com.jk.education.shopping.common.entity.Result;
import com.jk.education.shopping.common.model.BykArea;
import com.jk.education.shopping.common.model.BykShoppingAddress;

import java.util.List;

public interface BykShoppingAddressService {
    List<BykShoppingAddress> findShoppingAddressList(int page, int rows, BykShoppingAddress address);

    Long findShoppingAddressCount(BykShoppingAddress address);

    void deleteShoppingAddress(Integer[] ids);

    List<BykShoppingAddress> findShoppingAddress();

    void updateShoppingAddressStatus(BykShoppingAddress address);

    void deleteShoppingAddressById(int id);

    List<BykArea> findAreaList(int pid);

    void saveShoppingAddress(BykShoppingAddress address);

    BykShoppingAddress findShoppingAddressById(int id);

    void updateShoppingAddress(BykShoppingAddress address);
}
