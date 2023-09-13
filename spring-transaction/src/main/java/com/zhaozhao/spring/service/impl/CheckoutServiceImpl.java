package com.zhaozhao.spring.service.impl;

import com.zhaozhao.spring.service.BookService;
import com.zhaozhao.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘梹晨
 * @Classname CheckoutServiceImpl
 * @Date 2023/8/7 14:20
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;
    @Override
    @Transactional
    public void checkout(Integer userId, Integer[] bookIds) {
        for(Integer bookId : bookIds){
            bookService.buyBook(userId,bookId);
        }
    }
}
