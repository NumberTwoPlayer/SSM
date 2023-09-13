package com.zhaozhao.MyList_Test;

import com.zhaozhao.MyList.Sequential_List.My_Sequential;
import org.junit.Test;

/**
 * @author 刘梹晨
 * @Classname List_Test
 * @Date 2023/9/5 10:44
 */

public class List_Test {
    @Test
    public void test_SequentialList(){
        My_Sequential list = new My_Sequential(10);
        //判断线性表是否为空
        //System.out.println(list.ListEmpty());

        //求线性表的长度
        //System.out.println(list.ListLength());

        //插入元素
        System.out.println(list.ListInsert(1));
        System.out.println(list.ListInsert(2));
        System.out.println(list.ListInsert(3));
        System.out.println(list.ListInsert(3));
        System.out.println(list.ListInsert(5));
        System.out.println(list.ListInsert(6));
        System.out.println(list.ListInsert(7));
        System.out.println(list.ListInsert(8));
        System.out.println(list.ListInsert(9));
        System.out.println(list.ListInsert(10));

        //输出线性表
        list.DispList();

        //删除元素
        System.out.println(list.ListDeleteOfLast(3));

        //输出线性表
        list.DispList();

        ////按元素查找
        //System.out.println("查找元素在list数组的位置为：" + list.LocateElem(3));
        //
        ////按序号查找线性表的元素
        //System.out.println(list.GetElem(2));
    }
}
