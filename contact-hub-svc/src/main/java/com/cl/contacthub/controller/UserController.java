package com.cl.contacthub.controller;

import com.cl.contacthub.entites.User;
import com.cl.contacthub.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    UserService  userService;



    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @DeleteMapping("/delete")
    public String deleteUser(@RequestBody Long userId) {
        userService.deleteUser(userId);
        return "User with id" + userId+ "deleted";
    }

    @GetMapping("/{userId}")
    public Optional<User> findUserById(@PathVariable Long userId) {
        return userService.findUserById(userId);
    }
    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }



}
