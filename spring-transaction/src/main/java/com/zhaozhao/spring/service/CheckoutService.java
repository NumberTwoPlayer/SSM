package com.zhaozhao.spring.service;

public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);
}
