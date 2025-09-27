package com.example.FirstProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {


    @GetMapping("/hello")
    public String hello() {

        return "My first springboot program ";

    }
}
