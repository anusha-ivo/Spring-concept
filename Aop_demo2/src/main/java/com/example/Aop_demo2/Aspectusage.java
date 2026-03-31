package com.example.Aop_demo2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect

public class Aspectusage {
    @After("execution(* com.example.Aop_demo2.Student.study(..))")
    public void beforemethod(){
        System.out.println("student have to prepare");
    }
}
