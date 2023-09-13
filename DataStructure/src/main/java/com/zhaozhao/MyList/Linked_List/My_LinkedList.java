package com.zhaozhao.MyList.Linked_List;

import com.zhaozhao.MyList.Linked_List.Node.Node;

/**
 * @author 刘梹晨
 * @Classname My_LinkedList
 * @Date 2023/9/7 10:44
 */

public class My_LinkedList {
    private Node source = new Node();
    private int size = 0;

    public My_LinkedList(){
        super();
    }

    public boolean ListEmpty(){
        return size == 0;
    }

    public int ListLength(){
        return size;
    }

    public void DispList(){
        Node node = source;
        while (node != null){
            System.out.print(node.getData() + "\t");
            node = node.getNext();
        }
        System.out.println();
    }

    public Node GetElem(int i){
        Node node = source;
        int j = 1;
        while(j < i && node.getNext() != null){
            node = node.getNext();
            j++;
        }
        if(j == i){
            return node;
        }else{
            return null;
        }
    }

    public Node LocateElem(Object obj){
        Node node = source;
        int i = 1;
        while(node != null && node.getData() != obj){
            node = node.getNext();
        }
        return node;
    }
}
