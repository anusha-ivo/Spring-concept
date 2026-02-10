package com.example.spring_jdbc_2;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class SpringJdbc2Application {

	public static void main(String[] args) {

        ApplicationContext ap=new AnnotationConfigApplicationContext(Db_connection.class);
        JdbcTemplate j=ap.getBean(JdbcTemplate.class);
       // j.update("create table anu(name varchar(100),age int)");
        j.update("insert into anu(name,age)values('kav',23)");
        j.update("insert into anu(name,age)values('latha',34)");
        System.out.println("success");
        j.update("delete from anu where name=? ","kav");
        j.update("update anu set age=56 where name='latha'");
        List<Map<String,Object>> rw=j.queryForList("select * from anu");
        for(Map<String,Object> r:rw){
            System.out.println(r);

        }


	}

}
