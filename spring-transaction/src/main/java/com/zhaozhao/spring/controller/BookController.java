package com.zhaozhao.spring.controller;

import com.zhaozhao.spring.service.BookService;
import com.zhaozhao.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author 刘梹晨
 * @Classname BookController
 * @Date 2023/8/6 22:13
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CheckoutService checkoutService;

    public void buyBook(Integer userId, Integer bookId){
        bookService.buyBook(userId,bookId);
    }

    public void checkout(Integer userId, Integer[] bookIds){
        checkoutService.checkout(userId,bookIds);
    }
}
