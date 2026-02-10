package com.example.demo.setter.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSetterDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(DemoSetterDependencyApplication.class, args);
Teacher t =ac.getBean(Teacher.class);
t.teach();
t.contain();
	}

}
