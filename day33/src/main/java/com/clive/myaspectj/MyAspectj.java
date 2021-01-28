package com.clive.myaspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.After;
import org.springframework.stereotype.Component;
//@Component
//@Aspect
public class MyAspectj {
//	@Before(value="execution(* *..*.*ServiceImpl.add*(..))")
	public void startlog() {
		System.out.println("开始记录日志");
	}
//	@AfterReturning(value="execution(* *..*.*ServiceImpl.add*(..))")
	public void commitlog() {
		System.out.println("提交日志");
	}
//	@Around(value="execution(* *..*.*ServiceImpl.delete*(..))")
	public void loggin(ProceedingJoinPoint jionPoint) {
		System.out.println("开始记录日志");
		try {
			jionPoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("提交日志");
	}
}
