package com.example.FirstProject;

import com.example.FirstProject.Repository.TestRepository;
import com.example.FirstProject.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);

        TestController testController = applicationContext.getBean(TestController.class);
        System.out.println(testController.handleRequest());
    }
}