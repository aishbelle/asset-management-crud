package com.example.demo;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.boot.CommandLineRunner;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class Demo1Application{
    //implements CommandLineRunner

//    private final DataSource dataSource;

//    public Demo1Application(final DataSource dataSource){
//        this.dataSource = dataSource;
//    }

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    //@Override
//    public void run(final String... args){
//        log.info("Datasource: " + dataSource.toString());
//        final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
//        restTemplate.execute("select 1");
//    }
}
