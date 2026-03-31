package com.example.spring_jdbc_1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

//@SpringBootApplication
public class SpringJdbc1Application {

	public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Connection.class);
        JdbcTemplate j=ac.getBean(JdbcTemplate.class);
        j.update("insert into student(name,age)values(?,?)","abhi",23);
        System.out.println("success");
        List<Map<String,Object>> r=j.queryForList("select * from student");
        for(Map<String,Object> r2:r){
            System.out.println(r2);

        }

	}

}
