package com.zhaozhao.List.Linked_List.exer;

/**
 * 题目描述：
 *     假设有一个带头结点的单链表L，每个结点值由单个数字、小写字母和大写字母构成。
 *     设计一个算法将其拆分成3个带头结点的单链表L1、L2和L3,
 *     L1包含L 中的所有数字结点，L2包含L中的所有小写字母结点，L3包含L中的所有大写字母结点。用Java语言设计该算法。
 */

//定义结点类
class Node {
    char data; //结点值
    Node next; //后继结点引用

    //构造方法
    public Node(char data) {
        this.data = data;
        this.next = null;
    }
}

//定义单链表类
class LinkedList {
    Node head; //头结点

    //构造方法
    public LinkedList() {
        head = new Node('\0'); //创建空的头结点
    }

    //向链表尾部插入一个结点
    public void insert(char data) {
        Node p = head; //从头结点开始遍历
        while (p.next != null) { //找到尾结点
            p = p.next;
        }
        p.next = new Node(data); //在尾部插入新结点
    }

    //打印链表中的所有结点值
    public void print() {
        Node p = head.next; //从第一个有效结点开始遍历
        while (p != null) { //遍历到链表尾部
            System.out.print(p.data + " "); //打印结点值
            p = p.next; //后移指针
        }
        System.out.println(); //换行
    }
}

//定义拆分算法类
class SplitAlgorithm {
    //拆分方法，参数为原链表L，返回值为拆分后的三个链表L1,L2,L3组成的数组
    public static LinkedList[] split(LinkedList L) {
        LinkedList[] result = new LinkedList[3]; //创建结果数组
        result[0] = new LinkedList(); //创建L1，存放数字结点
        result[1] = new LinkedList(); //创建L2，存放小写字母结点
        result[2] = new LinkedList(); //创建L3，存放大写字母结点
        Node p = L.head.next; //从原链表的第一个有效结点开始遍历
        while (p != null) { //遍历到原链表的尾部
            char c = p.data; //获取当前结点的值
            if (Character.isDigit(c)) { //如果是数字，插入到L1中
                result[0].insert(c);
            } else if (Character.isLowerCase(c)) { //如果是小写字母，插入到L2中
                result[1].insert(c);
            } else if (Character.isUpperCase(c)) { //如果是大写字母，插入到L3中
                result[2].insert(c);
            }
            p = p.next; //后移指针
        }
        return result; //返回结果数组
    }
}

//测试类，用于验证算法的正确性
class Test {
    public static void main(String[] args) {
        LinkedList L = new LinkedList(); //创建原链表L
        L.insert('a');
        L.insert('1');
        L.insert('B');
        L.insert('c');
        L.insert('2');
        L.insert('D');
        L.insert('3');
        L.insert('e');
        L.insert('F');
        L.insert('4');
        L.insert('g');
        L.insert('5');
        L.insert('H');
        L.insert('6');
        L.insert('i');  //向L中插入一些数据，形成如下链表：
        /*
         *  a -> 1 -> B -> c -> 2 -> D -> 3 -> e -> F -> 4 -> g -> 5 -> H -> 6 -> i
         */

        System.out.println("原链表L为：");
        L.print(); //打印原链表L

        LinkedList[] result = SplitAlgorithm.split(L); //调用拆分方法，得到结果数组

        System.out.println("拆分后的三个链表为：");

        System.out.println("L1（数字）：");
        result[0].print(); //打印L1

        System.out.println("L2（小写字母）：");
        result[1].print(); //打印L2

        System.out.println("L3（大写字母）：");
        result[2].print(); //打印L3

    }
}
