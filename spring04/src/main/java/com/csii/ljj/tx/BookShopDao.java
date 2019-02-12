package com.csii.ljj.tx;

public interface BookShopDao {
    //根据书名号获取单价
    public double findBookPricceByIsbn(int isbn);

    //更新数的库存
    public void updateStock(int isbn);
    // 更新用户的余额
    public void updateUserBal(int userId,double price);
}
