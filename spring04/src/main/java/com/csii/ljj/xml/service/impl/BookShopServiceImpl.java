package com.csii.ljj.xml.service.impl;



import com.csii.ljj.xml.BookShopDao;
import com.csii.ljj.xml.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service(value = "bookShopService")
public class BookShopServiceImpl implements BookShopService {
    @Autowired
    BookShopDao bookShopDao;

    /*
     * 1.事务的传播行为
     * 使用propagation 用于指定事务的传播行为，即当前的事务方法被另一个事务调用时
     * 如何使用事务，默认取值为Propagation.REQUIRED，即使用调用此方法的事务
     *  Propagation.REQUIRES_NEW,即开启当前自己的事务不使用调用此方法的事务，调用此方法的事务挂起
     *  2.事务的隔离级别，脏读，不可重复读，可重复读，串行化
     *  3. readOnly = false 默认值
     *  4. timeout 强制回滚的连接时间
     * */
//    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public void purchase(Integer userId, Integer isbn) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        Integer userId = 1;
//        Integer isbn = 1001;
        // 1.查询价格
        double price = bookShopDao.findBookPricceByIsbn(isbn);

        // 2. 更新库存
        bookShopDao.updateStock(isbn);
        // 3. 更细余额
        bookShopDao.updateUserBal(userId, price);

    }
}
