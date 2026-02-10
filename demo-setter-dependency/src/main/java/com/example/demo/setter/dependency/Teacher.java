package com.example.demo.setter.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
    Student ref;
    public Student getRef(){
        return ref;
    }
    @Autowired
    public void setRef(Student ref){
        this.ref=ref;
    }

    public void teach(){
        System.out.println("teaching");
    }
    public void contain(){
        ref.study();
    }
}
