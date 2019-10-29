package com.jk.education.shopping.service;

import com.jk.education.shopping.common.interfaces.BykOrderServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "lingke-education-shopping-service")
public interface BykOrderService extends BykOrderServiceApi {
}
