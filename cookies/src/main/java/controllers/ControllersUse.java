package com.example.cookies.controllers;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllersUse {
    @GetMapping("/loginnn")
    public String login() {
        return "loginnn";

    }
    @GetMapping("/")
    public String home() {
        return "loginnn ";
    }

    @GetMapping("/create")
    public String create(HttpServletResponse res, Model m) {
        Cookie c = new Cookie("username", "anu");
        c.setMaxAge(60 * 60);
        c.setPath("/");
        res.addCookie(c);
        m.addAttribute("msg", "cookie created successfully");
        return "result";
    }

    @GetMapping("/read")
    public String read(HttpServletRequest req, Model m) {
        Cookie[] ck=req.getCookies();
        String s="cookies not found";
        if(ck!=null){
            for(Cookie c2:ck){
                if(c2.getName().equals("username")){
                    s=c2.getValue();
                }
            }
        }
        m.addAttribute("msg","cookie value is"+s);
        return "result";

    }
    @GetMapping("/delete")
    public String deletee(HttpServletResponse res,Model m){
        Cookie c=new Cookie("username",null);
        c.setMaxAge(0);
        c.setPath("/");
        res.addCookie(c);
        m.addAttribute("msg","cookie deleted");
        return "result";

    }
}
