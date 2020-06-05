package com.wfy.springcloud.controller;

import com.wfy.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";
//    消费者不应该有service层
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "consumer/dept/add2",method = RequestMethod.POST)
    public boolean add(Dept dept){
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add2",dept,Boolean.class);
    }

    @RequestMapping(value = "consumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "consumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }

}
