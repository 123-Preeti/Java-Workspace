package com.cl.contacthub.services;

import com.cl.contacthub.daos.UserDao;
import com.cl.contacthub.entites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public void deleteUser(Long userId) {
         userDao.deleteById(userId);
    }

    public User updateUser(User user) {
        return userDao.save(user);
    }

    public Optional<User> findUserById(Long userId) {
        return userDao.findById(userId);
    }
}
