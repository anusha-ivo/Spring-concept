package com.example.Aop_demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopDemo2Application {

	public static void main(String[] args) {

        ApplicationContext ac=SpringApplication.run(AopDemo2Application.class, args);
        Student s=ac.getBean(Student.class);
        s.study();

	}

}
