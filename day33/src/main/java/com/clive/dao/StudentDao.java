package com.clive.dao;

import java.util.List;

import com.clive.bean.Student;

public interface StudentDao {
	List<Student> findStudentAll();
	int addStudent();
	int deleteStudent();
}
