package com.zhaozhao.List.Linked_List.pojo;

import com.zhaozhao.List.Linked_List.node.LinkedListByNode;

/**
 * @author 刘梹晨
 * @Classname My_LinkedList
 * @Date 2023/9/17 19:25
 */

public interface LinkedList {
    /**
     * 初始化线性表：InitList(&L)
     */
    public void InitList();

    /**
     * 销毁线性表：DestoryList(&L)
     */
    public void DestoryList();

    /**
     * 判断线性表是否为空：ListEmpty(L)
     *
     * @return：为空，返回true，否则false
     */
    public boolean ListEmpty();

    /**
     * 求线性表的长度：ListLength(L)
     *
     * @return
     */
    public int ListLength();

    /**
     * 输出线性表：DispList(L)
     */
    public void DispList();

    /**
     * 按序号求线性表中的元素：GetElem(L,i,&e)
     *
     * @return：若单链表中没有第i个结点，则返回false，否则为true
     */
    public LinkedListByNode GetElem(int i);

    /**
     * 按元素值查找：LocateElem(L,e)
     *
     * @param obj：查找的元素值
     * @return 若存在返回其逻辑序号，否则返回0
     */
    public LinkedListByNode LocateElem(Object obj);

    /**
     * 插入数据元素：ListInsert(&L,i,e)
     *
     * @param i             要插入的位序
     * @param data          要插入的数据
     * @return  返回插入成功的链表
     * @throws Exception    抛出异常
     */
    public LinkedListByNode ListInsert(int i, Object data) throws Exception;

    /**
     * 删除数据元素：ListDelete(&L,i,&e)
     *
     * @param i 指定的位序
     * @return 返回删除成功的链表
     * @throws Exception    抛出异常
     */
    public LinkedListByNode ListDelete(int i) throws Exception;
}
