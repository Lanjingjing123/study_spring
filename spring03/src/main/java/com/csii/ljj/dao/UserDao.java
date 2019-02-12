package com.csii.ljj.dao;

import com.csii.ljj.Users;

public interface UserDao {

    public Users queryForObject(int id);
    public Users addUsers();
}
