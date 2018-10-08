package com.BasicSpringPractice.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class LaunchAopApp {
	
	public static void main(String[] args) {
		SpringApplication.run(LaunchAopApp.class, args);
	}

}
