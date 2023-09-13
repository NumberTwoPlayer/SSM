package com.zhaozhao.List.SequentialList;

public interface My_SequentialList {

    /**
     * 判断线性表是否为空
     * @return
     */
    public boolean ListEmpty();

    /**
     * 求线性表的长度
     * @return
     */
    public Integer ListLength();

    /**
     * 输出线性表
     */
    public void DispList();

    /**
     * 按序号查找线性表的元素
     * @param target
     * @return
     */
    public boolean GetElem(int target);

    /**
     * 按元素查找
     * @param target
     * @return
     */
    public int LocateElem(int target);

    /**
     * 插入元素
     * @param i
     * @return
     */
    public boolean ListInsert(int i);

    /**
     * 删除元素
     * @param i
     * @return
     */
    public boolean ListDelete(int i);
}
