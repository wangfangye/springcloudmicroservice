package com.wfy.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.wfy.springcloud.dao")
@SpringBootApplication
public class MicroservicecloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
    }

}
