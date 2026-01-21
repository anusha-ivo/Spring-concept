package com.example.demo_xml;
import com.example.demo_xml.Shop;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoXmlApplication {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
    Shop s=ac.getBean(Shop.class);
        s.shopping();
        s.done();

	}

}
