package com.lmy.storage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 库存
 *
 * @author lmy
 * @date 2019/9/14
 */
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan({"com.central.storage.mapper"})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StorageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorageServiceApplication.class, args);
    }
}
