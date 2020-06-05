package com.wfy.springcloud;

import com.wfy.springcloud.entities.Dept;
import com.wfy.springcloud.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MicroservicecloudProviderDept8001ApplicationTests {

    @Test
    void contextLoads() {
        Dept dept = new Dept("人事部");
        System.out.println(dept);
    }
}
