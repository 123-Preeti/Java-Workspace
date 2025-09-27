package com.example.FirstProject.service;


import com.example.FirstProject.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestService {

    @Autowired
    private TestRepository testRepository;

    public String handleLogic() {
        System.out.println("service class");
        return testRepository.handledb();
    }

}
