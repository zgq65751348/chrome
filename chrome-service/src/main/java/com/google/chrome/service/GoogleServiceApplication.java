package com.google.chrome.service;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages={"com.google.chrome.tools","com.google.chrome.service"})
@EnableDiscoveryClient
@EnableAsync
@EnableSwagger2Doc
@EnableHystrix
@MapperScan(basePackages = "com.google.chrome.tools")
public class GoogleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleServiceApplication.class,args);
    }
}
