package com.zhaozhao.exer;

/**
 * @author 刘梹晨
 * @Classname demo
 * @Date 2023/9/14 15:57
 */

public class demo {
    public int sum(int n) {
        int i = 0, s = 0;
        while (s < n) {
            i++;
            s += i;
        }
        return i;
    }

    public int fun(int n) {
        int x = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                x++;
            }
        }
        return x;
    }

    public int find(int[] a, int n, int x) {
        int i;
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
