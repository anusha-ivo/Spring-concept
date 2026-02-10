package com.example.MVC_Project_2;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controllerclass {
    @GetMapping("/form")
    public String show()
    {

        return "form";
    }
    @PostMapping("/submit")
    public String submitform(@RequestParam String pass, Model model){
        model.addAttribute("pass",pass);
        return "success";

    }
    @GetMapping("/customer/{id}")
    @ResponseBody
    public String getcust(@PathVariable int id){
        return  "customer is " +id;
    }



}
