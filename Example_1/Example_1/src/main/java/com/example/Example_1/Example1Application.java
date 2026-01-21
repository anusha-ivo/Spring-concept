
package com.example.Example_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Example1Application {

	public static void main(String[] args) {
	ApplicationContext ac =SpringApplication.run(Example1Application.class, args);
    Student s=ac.getBean(Student.class);
    s.read();


	}

}
