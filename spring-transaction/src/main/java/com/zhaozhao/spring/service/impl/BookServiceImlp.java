package com.zhaozhao.spring.service.impl;

import com.zhaozhao.spring.dao.BookDao;
import com.zhaozhao.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

/**
 * @author 刘梹晨
 * @Classname BookServiceImlp
 * @Date 2023/8/6 22:14
 */
@Service
public class BookServiceImlp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(
//            readOnly = true
//            timeout = 3
//            noRollbackFor = {ArithmeticException.class}
//            isolation =
            propagation = Propagation.REQUIRES_NEW
    )
    public void buyBook(Integer userId, Integer bookId) {

//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);

        //更新图书的库存
        bookDao.updateStock(bookId);

        //更新用户的余额
        bookDao.updateBalance(userId,price);
//        System.out.println(1/0);
    }
}
