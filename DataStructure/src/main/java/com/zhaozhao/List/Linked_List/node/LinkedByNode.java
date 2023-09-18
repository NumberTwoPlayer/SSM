package com.zhaozhao.List.Linked_List.node;

/**
 * @author 刘梹晨
 * @Classname LinkedByNode
 * @Date 2023/9/12 8:46
 */

public class LinkedByNode {
    private Object data;//结点值
    private LinkedByNode next;//后继结点引用

    //无参构造方法
    public LinkedByNode() {
    }

    //有参构造方法
    public LinkedByNode(Object data, LinkedByNode next) {
        this.data = data;
        this.next = next;
    }
    public LinkedByNode(char data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public LinkedByNode getNext() {
        return next;
    }

    public void setNext(LinkedByNode next) {
        this.next = next;
    }
}
