package com.example.spring_jdbc_3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Connection {
    public DriverManagerDataSource db(){
        DriverManagerDataSource db=new DriverManagerDataSource();
        db.setDriverClassName("com.mysql.cj.jdbc.Driver");
        db.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        db.setPassword("anu@8296");
        db.setUsername("root");
        return db;

    }@Bean
    public JdbcTemplate temp(){
        return new JdbcTemplate(db());
    }

}
