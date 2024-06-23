package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        College c = context.getBean("college", College.class);
        c.printCollege();

//        Student s = context.getBean("std", Student.class);
//        s.printStudent();
    }
}
