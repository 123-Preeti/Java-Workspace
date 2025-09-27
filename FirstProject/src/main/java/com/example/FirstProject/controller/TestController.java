package com.example.FirstProject.controller;


import com.example.FirstProject.Repository.TestRepository;
import com.example.FirstProject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
@Autowired
    private TestService testService;

    public String handleRequest() {
        System.out.println("in controller ");
        return testService.handleLogic();
    }

}
