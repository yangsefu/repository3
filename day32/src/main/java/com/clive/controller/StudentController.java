package com.clive.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clive.service.StudentService;
import com.clive.service.TeacherService;
import com.clive.service.impl.StudentServiceImpl;

public class StudentController {
    @Test
	public void demo1() {
//		StudentService service = new StudentServiceImpl();
//		service.addStudent();
    		ApplicationContext ac =
    				new ClassPathXmlApplicationContext("applicationContext.xml");
    		StudentService studentService = 
    				(StudentService) ac.getBean("studentService");
    		
    		TeacherService teacherService =
    				(TeacherService) ac.getBean("teacherService"); 
//    		studentService.addStudent();
    		studentService.deleteStudent(1);
//    		teacherService.addTeacher();
    		teacherService.deleteTeacher();
    		
	}
}
