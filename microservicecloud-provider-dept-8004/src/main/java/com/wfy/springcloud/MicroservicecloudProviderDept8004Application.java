package com.wfy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan(value = "com.wfy.springcloud.dao")
@SpringBootApplication
public class MicroservicecloudProviderDept8004Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8004Application.class, args);
    }

}
