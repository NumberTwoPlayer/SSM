package com.zhaozhao.List_Test;

import com.zhaozhao.List.Linked_List.My_LinkedList;
import com.zhaozhao.List.Linked_List.node.LinkedListByNode;
import org.junit.Test;

/**
 * @author 刘梹晨
 * @Classname LinkedList_Test
 * @Date 2023/9/12 9:16
 */

public class LinkedList_Test {
    @Test
    public void Demo_My_LinkedList() throws Exception {
        My_LinkedList l = new My_LinkedList();
        System.out.println("***初始化链表***");
        l.InitList();
        System.out.println("***测试链表插入***");
        l.ListInsert(1,"1");
        l.ListInsert(2,"a");
        l.ListInsert(3,"A");
        l.ListInsert(2,"2");

        System.out.println("***测试链表的输出***");
        l.DispList();


        System.out.println("***测试链表的长度***");
        System.out.println(l.ListLength() + "\t" + l.Length());

        System.out.println("***测试链表是否为空***");
        System.out.println(l.ListEmpty() + "\t" + l.Empty());

        System.out.println("***测试序号求元素***");
        LinkedListByNode node1 = l.GetElem(1);
        System.out.println(node1.getData());
        LinkedListByNode node2 = l.GetElem(2);
        System.out.println(node2.getData());
        LinkedListByNode node3 = l.GetElem(3);
        System.out.println(node3.getData());
        LinkedListByNode node4 = l.GetElem(4);
        System.out.println(node4.getData());

        System.out.println("***测试值查找***");
        LinkedListByNode byNode = l.LocateElem("a");
        System.out.println(byNode.getData());

        System.out.println("***测试删除元素***");
        l.ListDelete(2);

        System.out.println("***测试链表的输出***");
        l.DispList();

        System.out.println("***测试链表的长度***");
        System.out.println(l.ListLength() + "\t" + l.Length());

    }
}
