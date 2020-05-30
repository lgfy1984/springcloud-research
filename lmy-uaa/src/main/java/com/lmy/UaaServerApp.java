package com.lmy;

import com.lmy.common.ribbon.annotation.EnableFeignInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/** 
* @author lmy
*/
@EnableFeignClients
@EnableFeignInterceptor
@EnableDiscoveryClient
@EnableRedisHttpSession
@SpringBootApplication
public class UaaServerApp {
	public static void main(String[] args) {
		SpringApplication.run(UaaServerApp.class, args);
	}
}
