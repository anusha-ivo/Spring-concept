package com.example.Aop_demo2;

import org.springframework.stereotype.Component;

@Component
public class Student {
    public void study(){
        System.out.println("student is studying");
    }
}
