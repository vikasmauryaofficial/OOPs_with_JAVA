package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.config.AppConfig;
import com.example.model.Student;

public class App {

    public static void main(String[] args) {

        // IoC Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting bean
        Student s1 = context.getBean(Student.class);
        s1.show();

        // Testing Scope
        Student s2 = context.getBean(Student.class);

        System.out.println("Same Object? " + (s1 == s2));

        // Close container (calls destroy)
        context.close();
    }
}