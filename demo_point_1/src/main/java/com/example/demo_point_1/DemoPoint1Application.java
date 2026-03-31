package com.example.demo_point_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class DemoPoint1Application {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new  ClassPathXmlApplicationContext("Aspectsuse.xml");
        Bank b=ac.getBean(Bank.class);
        b.deposite();
        b.withdraw();

	}

}
