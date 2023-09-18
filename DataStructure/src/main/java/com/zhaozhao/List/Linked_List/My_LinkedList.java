package com.zhaozhao.List.Linked_List;


import com.zhaozhao.List.Linked_List.node.LinkedByNode;
import com.zhaozhao.List.Linked_List.pojo.LinkedList;

/**
 * @author 刘梹晨
 * @Classname My_LinkedList
 * @Date 2023/9/7 10:44
 */

public class My_LinkedList implements LinkedList {
    //单链表的头节点
    public LinkedByNode head = new LinkedByNode();
    //链表的长度
    int size = 0;

    @Override
    public void InitList() {
        head = new LinkedByNode();
    }

    @Override
    public void DestoryList() {

    }

    @Override
    public boolean ListEmpty() {
        return head.getNext() == null;
    }

    public boolean Empty() {
        return size == 0;
    }

    @Override
    public int ListLength() {
        int n = 0;
        LinkedByNode node = head;
        while (node != null) {
            n++;
            node = node.getNext();
        }
        return n;
    }

    public int Length() {
        return size;
    }

    @Override
    public void DispList() {
        LinkedByNode node = head;
        while (node != null) {
            System.out.print(node.getData() + "\t");
            node = node.getNext();
        }
        System.out.println();
    }

    @Override
    public LinkedByNode GetElem(int i) {
        int j = 1;
        LinkedByNode node = head;
        while (node != null && j < i) {
            node = node.getNext();
            j++;
        }
        if (j == i) {
            return node;
        } else {
            return null;
        }
    }

    @Override
    public LinkedByNode LocateElem(Object obj) {
        LinkedByNode node = head;
        while (node != null && node.getData() != obj) {
            node = node.getNext();
        }
        return node;
    }

    @Override
    public LinkedByNode ListInsert(int i, Object data) throws Exception {
        //p指的是要插入的位置之前的结点，s指的是要新插入的结点
        LinkedByNode p, s;
        //如果新结点要插在表头
        if (i == 1) {
            //申请新的结点
            s = new LinkedByNode();
            //设置新结点的数据
            s.setData(data);
            //处理第一个结点问题
            if (size == 0) {
                //设置新结点的指针(下一个结点)的位置
                s.setNext(null);
            } else {
                //设置新结点的指针(下一个结点)的位置
                s.setNext(head);
            }
            head = s;
            size++;
            return s;
        }
        p = GetElem(i - 1);
        if (p == null) {
            throw new Exception("参数i错误");
        } else {
            //申请新结点
            s = new LinkedByNode();
            //设置新结点的数据
            s.setData(data);
            //设置新结点的指针(下一个结点的位置)为查询到的结点的指针
            s.setNext(p.getNext());
            //将要插入位置的前一个结点的指针指向当前要添加的新结点
            p.setNext(s);
            size++;
            return head;
        }
    }


    @Override
    public LinkedByNode ListDelete(int i) throws Exception {
        //p指的是要删除的结点之前的结点，s指的是要删除的结点
        LinkedByNode p, s;
        //如果要删除第一个结点
        if(i == 1){
            s = head;
            if(head != null){
                //从链表中删除，即指针指向了第一个结点的下一个结点
                size--;
                head = head.getNext();
            }else{
                return null;
            }
            return head;
        }
        //查询要删除结点的上一个结点
        p = GetElem(i - 1);
        if(p == null){
            throw new Exception("第" + (i - 1) + "个结点不存在");
        } else if (p.getNext() == null) {
            throw new Exception("第" + i + "个结点不存在");
        }else{
            //将s指向第i个结点，即获取要删除的结点(通过上一个结点的指针获取要删除的结点的位置)
            s = p.getNext();
            //从链表中删除
            p.setNext(s.getNext());
            size--;
            return head;
        }

    }
    //向链表尾部插入一个结点
    public void insert(char data) {
        LinkedByNode p = head; //从头结点开始遍历
        while (p.getNext() != null) { //找到尾结点
            p = p.getNext();
        }
        p.setNext(new LinkedByNode(data)); //在尾部插入新结点
    }

}
