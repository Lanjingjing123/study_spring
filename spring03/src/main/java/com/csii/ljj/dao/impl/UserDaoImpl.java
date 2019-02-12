package com.csii.ljj.dao.impl;

import com.csii.ljj.Users;
import com.csii.ljj.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository(value="userDao")
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Users queryForObject(int id) {
        String sql = "SELECT  * FROM USERS  WHERE USERID =?";
        RowMapper<Users> rowMapper = new BeanPropertyRowMapper<>(Users.class);
        Users users = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return users;
    }

    @Override
    public Users addUsers() {
        return null;
    }
}
