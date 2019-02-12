package com.csii.ljj.xml.service.impl;

import com.csii.ljj.xml.service.BookShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value = "cashier")
public class Cashier {
    @Autowired
    BookShopService bookShopService;

    //
    /*
    * 事务的传播行为，
    * 使用propagation 指定事务的传播行为，即当前事务被另外一个事务调用时
    * */
    @Transactional(propagation = Propagation.REQUIRED)
    public void checkout(List<Integer> isbns){
        Integer userid =1;
        for (Integer isbn : isbns){
            bookShopService.purchase(userid,isbn);
        }
    }
}
