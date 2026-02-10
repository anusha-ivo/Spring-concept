package com.example.demo_afterreturning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoAfterreturningApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DemoAfterreturningApplication.class, args);
        Bank b=ac.getBean(Bank.class);
        b.check(200);
	}

}
