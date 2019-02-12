package com.csii.ljj;

import com.csii.ljj.tx.BookShopDao;
import com.csii.ljj.tx.BookShopService;

import com.csii.ljj.xml.service.impl.Cashier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;

public class Test {
    private JdbcTemplate jdbcTemplate;
    private ApplicationContext applicationContext ;
    private BookShopDao bookShopDao;
    private BookShopService bookShopService;
    private Cashier cashier;
    {
        applicationContext = new ClassPathXmlApplicationContext("tx-xml-applicationContext.xml");
//        jdbcTemplate = (JdbcTemplate) applicationContext.getBean("jdbcTemplate");
//        bookShopDao = (BookShopDao) applicationContext.getBean("bookShopDao");
//        bookShopService = (BookShopService) applicationContext.getBean("bookShopService");
        cashier = applicationContext.getBean(Cashier.class);
    }

    @org.junit.Test
    public void select(){
        Integer isbn = 1001;
        Integer userId = 1;
        // 1. 查询价格
        double price  = bookShopDao.findBookPricceByIsbn(isbn);
        System.out.println(price);

        // 2. 更新库存
        bookShopDao.updateStock(isbn);
        // 3. 跟新账户余额
        bookShopDao.updateUserBal( userId , price);
    }

    @org.junit.Test
    public void testService(){
        Integer isbn= 1001;
        Integer userId = 1 ;
        bookShopService.purchase(userId,isbn);
    }
    @org.junit.Test
    public void testCashier(){
        cashier.checkout(Arrays.asList(1001,1002));
    }
}
