package com.example.spring_jdbc_3;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class SpringJdbc3Application {

	public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Connection.class);
        JdbcTemplate j=ac.getBean(JdbcTemplate.class);
       // j.update("create table emp(name varchar(100),age int)");
        j.update("insert into emp(name,age)values('bhoo',23)");
        j.update("insert into emp(name,age)values('pall',34)");
        j.update("delete from emp where name='bhoo'");
        j.update("update emp set name='indhu' where age=34");
        System.out.println("successs");
        List<Map<String,Object>> rw=j.queryForList("select * from emp");
        for(Map<String,Object> r:rw){
    System.out.println(r);
        }

	}

}
