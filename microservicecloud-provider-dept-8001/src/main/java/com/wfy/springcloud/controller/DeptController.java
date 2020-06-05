package com.wfy.springcloud.controller;

import java.util.List;

import com.wfy.springcloud.entities.Dept;
import com.wfy.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
public class DeptController
{
	@Autowired
	private DeptService service;

	@PostMapping(value = "dept/stu")
	public Student stu(Student stu){
		System.out.println(stu);
		return stu;
	}

	@PostMapping(value = "/dept/add2")
	public boolean add2(Dept dept) {
		System.out.println(dept);
		return service.add(dept);
	}

	@PostMapping(value = "/dept/add")
	public boolean add(@PathParam(value = "dname") String dname) {
		System.out.println(dname);
		Dept dept = new Dept(dname);
		return service.add(dept);
	}

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}
}
