package com.BasicSpringPractice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class AspectsSample {
	
	public AspectsSample(){
		System.out.println("Printing Constructor");
	}

	private static final Logger LOGGER = LoggerFactory.getLogger(AspectsSample.class);
	
	@Before("execution(* com.DbPractice..*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature());

		//System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

}
