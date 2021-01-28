package com.clive.myAspectj;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectj {
	public void startlog() {
		System.out.println("开始记录日志");
	}
	public void commitlog() {
		System.out.println("提交日志");
	}
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
