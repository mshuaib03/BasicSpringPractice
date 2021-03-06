package com.DbPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=false)
public class BasicSpringPracticeApplicationDB {

	public static void main(String[] args) {
		SpringApplication.run(BasicSpringPracticeApplicationDB.class, args);
	}
}
