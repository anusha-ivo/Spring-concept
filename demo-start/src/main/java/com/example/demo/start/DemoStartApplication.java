package com.example.demo.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoStartApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(DemoStartApplication.class, args);
        Student_1 sc=ac.getBean(Student_1.class);
        sc.run();
	}

}
