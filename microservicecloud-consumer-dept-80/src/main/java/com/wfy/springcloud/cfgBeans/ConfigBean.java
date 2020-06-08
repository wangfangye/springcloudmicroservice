package com.wfy.springcloud.cfgBeans;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.client.RestTemplate;

//配置类
@Configuration
public class ConfigBean { // 注解版的配置， boot=> spring applicationContext.xml

//    Web容器中
    @LoadBalanced // 负载均衡 必须访问服务的名称
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//    @Bean  放入容器中
//    public UserService getUserService(){
//        return new UserServiceImpl();
//    }
}
