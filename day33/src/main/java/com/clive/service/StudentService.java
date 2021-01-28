package com.clive.service;

import java.util.List;

import com.clive.bean.Student;

public interface StudentService {
	int addStudent();
	void deleteStudent();
	List<Student> findStduentAll();

}
