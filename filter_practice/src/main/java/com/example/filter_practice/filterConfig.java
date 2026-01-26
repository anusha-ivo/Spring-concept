package com.example.filter_practice;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

public class filterConfig {
    @Bean
    public FilterRegistrationBean re(){
        FilterRegistrationBean f=new FilterRegistrationBean();
        f.setFilter(new Filterusage());
        f.addUrlPatterns("/");
        f.setOrder(1);
        return f;


    }
}
