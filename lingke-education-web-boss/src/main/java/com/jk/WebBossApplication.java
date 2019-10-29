/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * boss工程
 * 
 * @author wujing
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class WebBossApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebBossApplication.class, args);
	}

}
