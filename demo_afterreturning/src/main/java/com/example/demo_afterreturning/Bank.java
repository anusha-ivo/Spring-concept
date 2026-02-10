package com.example.demo_afterreturning;

import org.springframework.stereotype.Component;

@Component
public class Bank {
    public int check(int bal){
        return bal;
    }
}
