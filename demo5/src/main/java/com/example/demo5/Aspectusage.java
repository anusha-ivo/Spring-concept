package com.example.demo5;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspectusage {
    @Pointcut("execution(* com.example.demo5.Student.study(..))")
    public void pointusage(){

    }
    @Before("pointusage()")
    public void prepare(){
        System.out.println("preaparing");
    }
}
