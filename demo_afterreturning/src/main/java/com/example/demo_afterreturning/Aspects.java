package com.example.demo_afterreturning;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Aspects {
    @AfterReturning(
            pointcut ="execution(* com.example.demo_afterreturning.Bank.*(..))",
                    returning="bal"
    )
    public void show(Object bal){
    System.out.println(bal);
    }

}
