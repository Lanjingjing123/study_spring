package com.csii.ljj;

import com.alibaba.druid.pool.DruidDataSource;
import com.csii.ljj.dao.UserDao;
import com.csii.ljj.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private ApplicationContext applicationContext=null;
    private JdbcTemplate jdbcTemplate;
    private UserDao userDao;
    {
        applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
         userDao = (UserDao) applicationContext.getBean("userDao");
    }

    @Test
    public void unitTest(){

        System.out.println(userDao.queryForObject(1));
    }
    @Test
    public void addUser(){
        String sql = "INSERT INTO users(username,userage) values(?,?)";
        List<Object[]> users = new ArrayList<>();
        users.add(new Object[]{"AA","21"});
        users.add(new Object[]{"BB","21"});
        users.add(new Object[]{"CC","21"});
        users.add(new Object[]{"DD","21"});
        users.add(new Object[]{"EE","21"});
        jdbcTemplate.batchUpdate(sql,users);
    }

    //查询表的一条记录
    @Test
    public void queryForObject(){
        String sql ="SELECT  * FROM USERS  WHERE USERID =?";
        RowMapper<Users> rowMapper = new BeanPropertyRowMapper<>(Users.class);
        Users users= jdbcTemplate.queryForObject(sql,rowMapper,1);
        System.out.println(users);
    }
    //查询表的集合
    @Test
    public void queryForList(){
        String sql="SELECT * FROM USERS WHERE USERID>?";
        RowMapper<Users> usersRowMapper = new BeanPropertyRowMapper<>(Users.class);
        List<Users> users = new ArrayList<Users>();
       users= jdbcTemplate.query(sql,usersRowMapper,1);
        System.out.println(users);
    }


    @Test
    public void update(){
        String sql ="UPDATE users SET USERNAME=? WHERE USERID=?";
        jdbcTemplate.update(sql,"jack","1");
    }

    @Test
    public void  query(){
        String sql ="";
    }
    @Test
    public void test(){
        DruidDataSource dataSource = (DruidDataSource) applicationContext.getBean("dataSource");
        System.out.println(dataSource.getConnectCount());
    }
}
