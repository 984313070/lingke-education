package com.jk.education.ketang.service;

import com.jk.education.ketang.common.interfaces.GksDianBoKeTangServiceApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "lingke-education-ketang-service")
public interface GksDianBoKeTangService extends GksDianBoKeTangServiceApi {
}