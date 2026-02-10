package com.example.demo.cons.dependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoConsDependencyApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(DemoConsDependencyApplication.class, args);
        Car c =ac.getBean(Car.class);
        c.drive();
        c.init();
	}

}
