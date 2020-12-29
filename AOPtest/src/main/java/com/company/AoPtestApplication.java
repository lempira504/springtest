package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)  
public class AoPtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AoPtestApplication.class, args);
	}
	
}
