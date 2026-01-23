package com.example.MVC_Project.controller;


import org.springframework.ui.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Controllerusage {
    @GetMapping("/form")
        public String show(){
            return "form";
        }

    @PostMapping("/submit")
        public String submitform(@RequestParam String name, Model model){
            model.addAttribute("name",name);
            return "success";

        }
        @GetMapping("/customer/{id}")
        @ResponseBody
                public String getcustom(@PathVariable int id){
            return "customer id is :" +id;
        }

}

