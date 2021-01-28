package com.clive.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clive.bean.Student;
import com.clive.dao.StudentDao;
import com.clive.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public int addStudent() {
		int i = studentDao.addStudent();
		System.out.println(i);
		if(i>0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		return i;

	}
	@Override
	public void deleteStudent() {
		System.out.println("删除学生");

	}
	@Override
	public List<Student> findStduentAll() {
		List<Student> list = studentDao.findStudentAll();
		return list;
	}
	



}
