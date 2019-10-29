package com.jk.education.shopping.service;

import com.jk.education.shopping.common.interfaces.BykGoodsServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @类名: BykGoodService
 * @描述:
 * @作者: 鲍源凯
 * @时间: 2019-10-16 15:09
 **/
@FeignClient(value = "lingke-education-shopping-service")
public interface BykGoodService extends BykGoodsServiceApi {

}