package com.jk.education.shopping.service;

import com.jk.education.shopping.common.interfaces.BykShoppingAddressApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "lingke-education-shopping-service")
public interface BykShoppingAddressService extends BykShoppingAddressApi {

}
