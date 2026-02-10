package com.example.spring_jdbc_2;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

@Configuration
public class Db_connection {
    @Bean
    public DriverManagerDataSource da(){
        DriverManagerDataSource dm=new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dm.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        dm.setPassword("anu@8296");
        dm.setUsername("root");

        return dm;



    }@Bean
    public JdbcTemplate temp(){
        return new JdbcTemplate(da());
    }

}
