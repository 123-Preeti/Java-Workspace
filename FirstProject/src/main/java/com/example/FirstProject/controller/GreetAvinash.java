package com.example.FirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class GreetAvinash {

    @GetMapping("greet")
    public String greet(){
        LocalDateTime now = LocalDateTime.now();
        return "Hello Avinash " + now;
    }

}


