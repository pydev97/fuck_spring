package com.example.fuck_spring.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Sample {
    @GetMapping("/fuck")
    public String showForm() {
        return "index";
    }
}
