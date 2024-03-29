package com.example.demo01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.example.demo01.mapper")
public class DemoProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProviderApplication.class, args);
    }
}
