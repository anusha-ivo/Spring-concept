package com.example.Session_practice;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllerusage {
    @GetMapping("/entry")
    public String home(){

         return "entry";
    }
      @GetMapping("/create")
    public String create(HttpSession session, Model m){
        session.setAttribute("username","Anusha");
        m.addAttribute("msg","session created");
        return "exit";
      }

    @GetMapping("/read")
    public String read(HttpSession session,Model m){
        Object name =session.getAttribute("username");
        if(name==null){
            m.addAttribute("msg","session not found");
        }
        else{
            m.addAttribute("msg","session value"+name);

        }
        return "exit";
    }
    @GetMapping("/destroy")
    public String destry(HttpSession session,Model m){
        session.invalidate();
        m.addAttribute("msg","session destroy");
        return "exit";
    }


}
