package com.example.filter_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlleruse {
    @GetMapping("/home")
    public String home(){
        System.out.println("controller executed");
        return "home";
    }

}
