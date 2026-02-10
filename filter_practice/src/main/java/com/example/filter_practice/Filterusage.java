package com.example.filter_practice;
 import jakarta.servlet.Filter;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
 import org.springframework.stereotype.Component;

 import java.io.IOException;

@Component
public class Filterusage implements Filter {
    @Override
    public void doFilter(ServletRequest re, ServletResponse res, FilterChain chain)throws IOException, ServletException {
        System.out.println(" filter before controller");
        chain.doFilter(re,res);
        System.out.println(" filter after controller");
    }

}
