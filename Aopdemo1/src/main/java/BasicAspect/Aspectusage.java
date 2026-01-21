package com.example.Aopdemo1.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component

public class Aspectusage {
    @Before("execution(* com.example.Aopdemo1.service.Student.register(..))")
    public void beforeRegister(){
        System.out.println("before register mathod");
    }

}
