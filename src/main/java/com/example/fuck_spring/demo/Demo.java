package com.example.fuck_spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {
    private String name ;

    public Demo() {
        this.name = "phuc";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
