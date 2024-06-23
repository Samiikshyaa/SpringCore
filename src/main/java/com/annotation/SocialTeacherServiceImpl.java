package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SocialTeacherServiceImpl implements TeacherService{
    @Override
    public void teach() {
        System.out.println(".....teaching Social" );
    }
}
