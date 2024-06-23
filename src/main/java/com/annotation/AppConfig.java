package com.annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.annotation")
public class AppConfig {
    @Bean(name = "std")
    public Student getStudentBean(){
        return new Student();
    }
}
