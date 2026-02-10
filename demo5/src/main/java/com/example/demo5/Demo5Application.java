package com.example.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo5Application {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(Demo5Application.class, args);
        Student s=ac.getBean(Student.class);
        s.study();

	}

}
