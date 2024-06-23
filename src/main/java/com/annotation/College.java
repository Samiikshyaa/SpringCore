package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component//(value = "colz")
public class College {
    @Value("NCC")
    private String name;
    @Value("9849898410")
    private String phone;

    @Autowired //bean injection
    private Student s;

    @Autowired
    @Qualifier("mathTeacherServiceImpl")
    private TeacherService ts;


    void printCollege(){
        System.out.println("College Name = "+name);
        System.out.println("College Phone = "+ phone);
        s.printStudent();
        ts.teach();
    }
}
