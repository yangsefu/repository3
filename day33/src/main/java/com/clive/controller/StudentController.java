package com.clive.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clive.bean.Student;
import com.clive.result.MyRowMapper;
import com.clive.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)   
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})  
public class StudentController {
	@Autowired
	private StudentService service;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Test
	public void demo1() {
		//		service.addStudent();
		//		service.deleteStudent();
	}
	@Test
	public void demo2() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/demo");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(dataSource);
		int i =template.update
				("INSERT INTO student (username,age,score) VALUES(?,?,?)","韩梅梅",16,100);
		System.out.println(i);
	}
	@Test
	public void demo3() {
		int i =jdbcTemplate.update("UPDATE student SET username = ? WHERE ID = ?","TONY",15);
		System.out.println(i);
	} 
	@Test
	public void demo4() {
		int i =jdbcTemplate.update("DELETE FROM student WHERE id = ?",15);
		System.out.println(i);
	}
	@Test
	public void demo5() {
		List<Student> list = jdbcTemplate.query
				("SELECT * FROM student", new MyRowMapper());
		for (Student student : list) {
			System.out.println(student);
		}

	} 
	@Test
	public void demo6() {
		List<Student> list = jdbcTemplate.query
				("SELECT * FROM student WHERE id =?", new MyRowMapper(),1);
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void demo7() { 
		List<Student> list = service.findStduentAll();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	@Test
	public void demo8() {
		int i = service.addStudent();
	}
	
}
