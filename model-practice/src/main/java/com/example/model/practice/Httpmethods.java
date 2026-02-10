package com.example.model.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Httpmethods {
@ModelAttribute("user")
    public User user(){
    return new User();
}
@GetMapping("/userform")
    public String show(){
    return "userform";
}
@PostMapping("/submitUser")
    public String post(@ModelAttribute User user){
    return "userDetails";
}

}
