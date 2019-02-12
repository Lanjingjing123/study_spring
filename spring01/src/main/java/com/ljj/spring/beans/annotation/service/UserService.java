package com.ljj.spring.beans.annotation.service;

import com.ljj.spring.beans.annotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    @Qualifier(value = "userRepositoryImpl")
    private UserRepository userRepository;

    public void add(){
        System.out.println("UserService add ...");
        userRepository.save();
    }
}
