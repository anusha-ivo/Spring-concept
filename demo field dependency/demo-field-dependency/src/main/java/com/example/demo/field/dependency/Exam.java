package com.example.demo.field.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Exam {
    @Autowired
    Paper p;
    public void  exam(){
        System.out.println("writing exam");
    }
    public void contain(){
        p.write();
    }
}
