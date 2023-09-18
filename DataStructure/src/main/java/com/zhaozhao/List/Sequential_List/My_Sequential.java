package com.zhaozhao.List.Sequential_List;

import com.zhaozhao.List.Sequential_List.pojo.My_SequentialList;

/**
 * @author 刘梹晨
 * @Classname My_Sequential
 * @Date 2023/9/5 9:55
 */

public class My_Sequential implements My_SequentialList {
    //顺序表的存储空间
    private int[] list;
    //顺序表的最后一个元素的位置
    private Integer last;
    //顺序表的最大长度
    private final Integer MaxSize;

    //初始化顺序表
    public My_Sequential(Integer Maxsize) {
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

        for(int j = list.length - 1; j >= i; j--){
            list[j] = list[j - 1];
        }
        list[i - 1] = i;
        last++;
        return true;
    }

    /**
     * 删除单个元素,时间复杂度 O(n)
     * @param i
     * @return
     */
    @Override
    public boolean ListDelete(int i) {
        if(last == -1){
            return false;
        }
        for(int j = i; j < list.length - 1; j++){
            if(j == i){
                list[j - 1] = list[j];
            }
            list[j] = list[j + 1];
        }
        last--;
        list[last + 1] = 0;
        return true;
    }

    /**
     * 删除多个相同元素，时间复杂度 O(n^2)
     * @param i
     * @return
     */
    public boolean ListDeleteOf(int i) {
        if(last == -1){
            return false;
        }
        int j = 0;
        while (j <= last) {
            if (list[j] == i) {
                for (int k = j; k < last; k++) {
                    list[k] = list[k + 1];
                }
                last--;
                list[last + 1] = 0;
            } else {
                j++;
            }
        }
        return true;
    }

    /**
     * 删除多个相同元素，时间复杂度 O(n)
     * @param i
     * @return
     */
    public boolean ListDeleteOfLast(int i){
        if(last == -1){
            return false;
        }
        int[] newList = new int[list.length];
        int newLast = 0;
        for(int j = 0; j <= last; j++){
            if(list[j] != i){
                newList[newLast++] = list[j];
            }
        }
        list = newList;
        last = newLast - 1;
        return true;
    }

}

