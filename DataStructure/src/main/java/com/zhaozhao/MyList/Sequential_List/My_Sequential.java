package com.zhaozhao.List.SequentialList;

import com.zhaozhao.List.SequentialList.My_SequentialList;

/**
 * @author 刘梹晨
 * @Classname My_ArrayList
 * @Date 2023/9/5 9:55
 */

public class My_ArrayList implements My_SequentialList {
    //顺序表的存储空间
    private int[] list;
    //顺序表的最后一个元素的位置
    private Integer last;
    //顺序表的最大长度
    private final Integer MaxSize;

    //初始化顺序表
    public My_ArrayList(Integer Maxsize) {
        list = new int[Maxsize];
        //表示线性表为空
        this.last = -1;
        //线性表的最大长度
        this.MaxSize = Maxsize;
    }

    @Override
    public boolean ListEmpty() {
        return last == -1;
    }

    @Override
    public Integer ListLength() {
        return MaxSize;
    }

    @Override
    public void DispList() {
        if (ListEmpty()) {
            System.out.println("线性表为空");
        } else {
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println();
        }
    }

    @Override
    public boolean GetElem(int target) {
        if (target < 1 || target > list.length) {
            return false;
        }
        for (int i = 0; i < list.length; i++) {
            if (target == list[i]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int LocateElem(int target) {
        int left = 0;
        int right = list.length - 1;
        while(left <= right){
            int count = left + (right - left) / 2;
            if(list[count] == target){
                return count;
            } else if (list[count] > target) {
                right = count - 1;
            } else {
                left = count + 1;
            }
        }
        return -1;
    }

    @Override
    public boolean ListInsert(int i) {
        if(last == list.length || i < 1 || i > MaxSize){
            return false;
        }
        last++;
        for(int j = list.length - 1; j >= i; j--){
            list[j] = list[j - 1];
        }
        list[i - 1] = i;
        return true;
    }

    @Override
    public boolean ListDelete(int i) {
        return false;
    }
}

