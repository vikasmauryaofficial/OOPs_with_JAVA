package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton") // change to prototype to test
public class Student {

    private Address address;

    // Constructor Injection 
    @Autowired
    public Student(Address address) {
        this.address = address;
    }

    public void show() {
        System.out.println("Student city: " + address.getCity());
    }

    // Lifecycle methods
    @PostConstruct
    public void init() {
        System.out.println("Student Bean Initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Student Bean Destroyed");
    }
}