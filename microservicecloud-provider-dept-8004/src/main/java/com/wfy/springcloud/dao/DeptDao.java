package com.wfy.springcloud.dao;

import com.wfy.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface DeptDao
{

	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	@Select("select * from dept where 1=1")
	public List<Dept> findAll();

	//   主键自增， 主键的名字
	@Options(useGeneratedKeys = true,keyProperty = "id", keyColumn="deptno")
	@Insert("INSERT INTO dept(dname,db_source) VALUES(#{dname},DATABASE())")
	public int insertDept(Dept dept);
}
