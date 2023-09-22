package com.zhaozhao.List.Linked_List.node;

/**
 * @author 刘梹晨
 * @Classname LinkedListByNode
 * @Date 2023/9/12 8:46
 */

public class LinkedListByNode {
    private Object data;//结点值
    private LinkedListByNode next;//后继结点引用

    //无参构造方法
    public LinkedListByNode() {
    }

    //有参构造方法
    public LinkedListByNode(Object data, LinkedListByNode next) {
        this.data = data;
        this.next = next;
    }
    public LinkedListByNode(char data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LinkedListByNode getNext() {
        return next;
    }

    public void setNext(LinkedListByNode next) {
        this.next = next;
    }
}
