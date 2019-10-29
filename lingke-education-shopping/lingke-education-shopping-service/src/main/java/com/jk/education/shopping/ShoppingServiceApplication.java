/**
 * Copyright 2015-现在 广州市领课网络科技有限公司
 */
package com.jk.education.shopping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户服务
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@RefreshScope
@MapperScan("com.jk.education.shopping.mapper")
public class ShoppingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingServiceApplication.class, args);
	}

}
