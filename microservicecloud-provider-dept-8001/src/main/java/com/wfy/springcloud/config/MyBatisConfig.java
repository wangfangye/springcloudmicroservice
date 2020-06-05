//package com.wfy.springcloud.config;
//
//import org.apache.ibatis.session.Configuration;
//import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
//import org.springframework.context.annotation.Bean;
//
////所有的xml文件，对应于Config文件，通过
////@org.springframework.context.annotation.Configuration
//@org.springframework.context.annotation.Configuration
//public class MyBatisConfig {
//
//    @Bean
//    public ConfigurationCustomizer configurationCustomizer(){
//        return new ConfigurationCustomizer(){
//
//            @Override
//            public void customize(Configuration configuration) {
////                开启驼峰命名法，也可以通过xml的方式，在yml中指定路径，然后写一个xml文件
//                configuration.setMapUnderscoreToCamelCase(true);
//            }
//        };
//    }
//}
