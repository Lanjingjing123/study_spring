package com.ljj.spring.beans.annotation.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryJdbc implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepositoruJdbc save .... ");
    }
}
