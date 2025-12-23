package com.example.demo.cons.dependency;

import org.springframework.stereotype.Component;

@Component
public class Car {
    Engine ref;
    Car(Engine ref){
        this.ref=ref;
    }
    public void init(){
        ref.start();
    }
    public void drive(){
        System.out.println("driving...");
    }
}
