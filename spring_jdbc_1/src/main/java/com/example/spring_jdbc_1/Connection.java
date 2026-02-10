package com.example.spring_jdbc_1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Connection {
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource dm=new DriverManagerDataSource();
        dm.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dm.setUrl("jdbc:mysql://localhost:3306/spring_jdbc");
        dm.setPassword("anu@8296");
        dm.setUsername("root");
        return dm;

    }
    @Bean
    public JdbcTemplate temp(){
        return new JdbcTemplate(dataSource());
    }

}
