package com.zhaozhao.Exer_Test;

import com.zhaozhao.exer.demo;
import org.junit.Test;

import java.util.Stack;

/**
 * @author 刘梹晨
 * @Classname Demo_Test
 * @Date 2023/9/16 10:33
 */

public class Demo_Test {
    @Test
    public void test01() {
        demo demo = new demo();
        System.out.println(demo.sum(10));
    }

    @Test
    public void test02() {
        demo demo = new demo();
        System.out.println(demo.fun(10));
    }

    @Test
    public void test03() {
        demo demo = new demo();
        int[] arrTest = new int[]{1, 2, 3, 4, 5};
        System.out.println(demo.find(arrTest, 10000, 5));
    }


    @Test
    public void test05() {
        Stack<Integer> stack = new Stack<>();
        int n = 5; // 可以根据需要更改n的值
        for (int i = n; i >= 1; i--) {
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
