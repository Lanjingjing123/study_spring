package com.csii.ljj.tx;

import com.csii.ljj.RuntimeException.UpdateStockException;
import com.csii.ljj.RuntimeException.UpdateUserBalException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value = "bookShopDao")
public class BookShopDaoImpl implements BookShopDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public double findBookPricceByIsbn(int isbn) {
        String sql ="SELECT PRICE FROM BOOK WHERE ISBN = ? ";
        return jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }

    @Override
    public void updateStock(int isbn) {
        // 判断库存是否足够，库存不足则抛出异常!
        String sql2 = "SELECT STOCK FROM BOOK_STOCK WHERE ISBN=?";
        Integer stock = 0;
        stock = jdbcTemplate.queryForObject(sql2,Integer.class,isbn);
        if(stock == 0){
            throw new UpdateStockException("库存不足");
        }
        String sql = "UPDATE BOOK_STOCK SET STOCK = STOCK-1 WHERE ISBN =?";
        jdbcTemplate.update(sql,1001);
    }

    @Override
    public void updateUserBal(int userId,double price) {


        // 检查余额是否充足，如果不足抛异常！
        String sql2 = "SELECT BALANCE FROM ACCOUNT WHERE USERID=? ";
        Double balance = 0.0;
        balance = jdbcTemplate.queryForObject(sql2,Double.class,userId);
        if(balance < price){
            throw new UpdateUserBalException("余额不足！");
        }
        String sql = "UPDATE ACCOUNT SET BALANCE=BALANCE - ? WHERE USERID=?";


        jdbcTemplate.update(sql,price,userId);
    }
}
