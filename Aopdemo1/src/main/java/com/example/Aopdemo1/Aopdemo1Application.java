package com.example.Aopdemo1;

import com.example.Aopdemo1.service.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Aopdemo1Application {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(Aopdemo1Application.class, args);
        Student s=ac.getBean(Student.class);
        s.register();


    }

}
