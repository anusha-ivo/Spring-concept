package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
        Bike b=ac.getBean(Bike.class);
        System.out.println(b);
        b.drive();
        ac.registerShutdownHook();



    }
}