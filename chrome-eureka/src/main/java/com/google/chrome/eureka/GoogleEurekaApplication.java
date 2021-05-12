package com.google.chrome.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GoogleEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoogleEurekaApplication.class,args);
    }
}
