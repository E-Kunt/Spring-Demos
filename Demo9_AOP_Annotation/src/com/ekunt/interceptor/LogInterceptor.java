package com.ekunt.interceptor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * AOP��֯����־���ܡ�
 * @author E-Kunt
 *
 */
@Aspect //��������
@Component //����bean
public class LogInterceptor {
	@Pointcut("execution(public * com.ekunt.dao..*.*(..))") //��������ϣ�ȡ��Ϊlog()��
	public void log(){}
	
	@Before("log()") //����ִ��ǰִ�С�
	public void before() {
		System.out.println("Log : Before method start !");
	}
	
	@After("log()")  //����ִ�к�ִ�С�
	public void after() {
		System.out.println("Log : After method end !");
	}
	
	@Around("log()")  //����ִ��ǰ����ִ����Ӧ���ִ��롣
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Log : Around before !");
		pjp.proceed();
		System.out.println("Log : Around after !");
	}
	
	@AfterReturning("log()") //�������غ�ִ�С�
	public void afterReturning() {
		System.out.println("Log : After returning !");
	}

	@AfterThrowing("log()") //�������쳣��ִ�С�
	public void afterThrowing() {
		System.out.println("Log : After throwing !");
	}
	
}
