
package com.example.demo.field.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoFieldDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(DemoFieldDependencyApplication.class, args);
        Exam  e=ac.getBean(Exam.class);
        e.exam();
        e.contain();
	}

}
