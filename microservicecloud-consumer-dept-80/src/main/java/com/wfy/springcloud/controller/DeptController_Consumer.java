package com.wfy.springcloud.controller;

import com.wfy.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";
//    可以写服务的名字，当有多个服务的时候就可以使用负载均衡策略 microservicecloud-dept8001
    private static final String REST_URL_PREFIX_NAME = "http://microservicecloud-dept";
//    消费者不应该有service层
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "consumer/dept/add3",method = RequestMethod.POST)
    public boolean addtest(Dept dept){
        System.out.println(dept);
        return restTemplate.postForObject(REST_URL_PREFIX_NAME+"/dept/add2",dept,Boolean.class);
    }
    @RequestMapping(value = "consumer/dept/get2/{id}",method = RequestMethod.GET)
    public Dept get2(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX_NAME+"/dept/get/"+id, Dept.class);
    }

    @RequestMapping(value = "consumer/dept/list2",method = RequestMethod.GET)
    public List<Dept> list2(){
        return restTemplate.getForObject(REST_URL_PREFIX_NAME+"/dept/list", List.class);
    }


//    ================
//    采用了LoadBalanced之后，就一定要使用服务实例的名字，而不能使用ip

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
