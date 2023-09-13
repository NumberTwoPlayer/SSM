package com.zhaozhao.MyList.Linked_List.Node;

/**
 * @author 刘梹晨
 * @Classname Node
 * @Date 2023/9/12 8:46
 */

public class Node {
    private Object data;
    private Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
