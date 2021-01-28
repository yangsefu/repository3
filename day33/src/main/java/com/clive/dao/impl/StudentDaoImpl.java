package com.clive.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.clive.bean.Student;
import com.clive.dao.StudentDao;
import com.clive.result.MyRowMapper;
@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> findStudentAll() {
		List<Student> list = jdbcTemplate.query
				("SELECT * FROM student", new MyRowMapper());
		return list;
	}





	@Override
	public int addStudent() {
		int i =jdbcTemplate.update
				("INSERT INTO student (username,age,score) VALUES(?,?,?)","韩梅梅",16,100);
		return i;

	}





	@Override
	public int deleteStudent() {
		// TODO Auto-generated method stub
		return 0;
	}

}
