package com.zhaozhao.List.Linked_List.exer;

/**
 * @author 刘梹晨
 * @Classname My_Node
 * @Date 2023/9/18 14:52
 *
 * 题目描述：
 *      假设有一个带头结点的单链表L，每个结点值由单个数字、小写字母和大写字母构成。
 *      设计一个算法将其拆分成3个带头结点的单链表L1、L2和L3,
 *      L1包含L 中的所有数字结点，L2包含L中的所有小写字母结点，L3包含L中的所有大写字母结点。用Java语言设计该算法。
 */

// 定义结点类
class My_Node {
    Object data; // 结点的值
    My_Node next; // 指向下一个结点的引用

    // 构造方法
    public My_Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

// 定义单链表类
class My_LinkedList_Test {
    My_Node head; // 头结点的引用

    // 构造方法
    public My_LinkedList_Test(Object[] arr) {
        // 如果数组为空或者长度为0，则返回空链表
        if (arr == null || arr.length == 0) {
            this.head = null;
            return;
        }
        // 创建头结点，并将其值设为第一个元素
        this.head = new My_Node(arr[0]);
        // 创建一个指针p，指向头结点
        My_Node p = this.head;
        // 从第二个元素开始遍历数组
        for (int i = 1; i < arr.length; i++) {
            // 创建一个新结点，并将其值设为当前元素
            My_Node node = new My_Node(arr[i]);
            // 将新结点插入到p的后面，并更新p
            p.next = node;
            p = p.next;
        }
    }

    // 定义拆分方法
    public My_LinkedList_Test[] split() {
        // 创建三个空的单链表L1、L2和L3
        My_LinkedList_Test L1 = new My_LinkedList_Test(new Object[0]);
        My_LinkedList_Test L2 = new My_LinkedList_Test(new Object[0]);
        My_LinkedList_Test L3 = new My_LinkedList_Test(new Object[0]);
        // 创建三个指针p1、p2和p3，分别指向它们的头结点
        My_Node p1 = L1.head;
        My_Node p2 = L2.head;
        My_Node p3 = L3.head;
        // 创建一个指针p，从头结点开始遍历L
        My_Node p = this.head;
        while (p != null) {
            // 判断当前结点的值的类型
            if (isDigit(p.data)) { // 如果是数字
                // 如果L1为空，则将当前结点设为L1的头结点，并更新p1
                if (L1.head == null) {
                    L1.head = p;
                    p1 = p;
                } else { // 否则，将当前结点插入到L1的尾部，并更新p1
                    p1.next = p;
                    p1 = p1.next;
                }
            } else if (isLowerCase(p.data)) { // 如果是小写字母
                // 如果L2为空，则将当前结点设为L2的头结点，并更新p2
                if (L2.head == null) {
                    L2.head = p;
                    p2 = p;
                } else { // 否则，将当前结点插入到L2的尾部，并更新p2
                    p2.next = p;
                    p2 = p2.next;
                }
            } else if (isUpperCase(p.data)) { // 如果是大写字母
                // 如果L3为空，则将当前结点设为L3的头结点，并更新p3
                if (L3.head == null) {
                    L3.head = p;
                    p3 = p;
                } else { // 否则，将当前结点插入到L3的尾部，并更新p3
                    p3.next = p;
                    p3 = p3.next;
                }
            }
            // 将p指向下一个结点
            p = p.next;
        }
        // 将p1、p2和p3的next设为null，断开与原链表的连接
        if (p1 != null) {
            p1.next = null;
        }
        if (p2 != null) {
            p2.next = null;
        }
        if (p3 != null) {
            p3.next = null;
        }
        // 返回由L1、L2和L3组成的数组
        return new My_LinkedList_Test[] {L1, L2, L3};
    }

    // 定义判断对象是否是数字的方法
    public boolean isDigit(Object o) {
        // 如果对象是String类型，可以用Character.isDigit方法判断
        if (o instanceof String) {
            String s = (String) o;
            // 如果字符串长度不为1，返回false
            if (s.length() != 1) {
                return false;
            }
            // 否则，返回字符是否是数字的结果
            return Character.isDigit(s.charAt(0));
        }
        // 如果对象是其他类型，可以根据具体情况实现
        // 这里为了简单，假设只有String类型的对象，所以返回false
        return false;
    }

    // 定义判断对象是否是小写字母的方法
    public boolean isLowerCase(Object o) {
        // 如果对象是String类型，可以用Character.isLowerCase方法判断
        if (o instanceof String) {
            String s = (String) o;
            // 如果字符串长度不为1，返回false
            if (s.length() != 1) {
                return false;
            }
            // 否则，返回字符是否是小写字母的结果
            return Character.isLowerCase(s.charAt(0));
        }
        // 如果对象是其他类型，可以根据具体情况实现
        // 这里为了简单，假设只有String类型的对象，所以返回false
        return false;
    }

    // 定义判断对象是否是大写字母的方法
    public boolean isUpperCase(Object o) {
        // 如果对象是String类型，可以用Character.isUpperCase方法判断
        if (o instanceof String) {
            String s = (String) o;
            // 如果字符串长度不为1，返回false
            if (s.length() != 1) {
                return false;
            }
            // 否则，返回字符是否是大写字母的结果
            return Character.isUpperCase(s.charAt(0));
        }
        // 如果对象是其他类型，可以根据具体情况实现
        // 这里为了简单，假设只有String类型的对象，所以返回false
        return false;
    }

    // 定义打印方法，用于测试
    public void print() {
        // 创建一个指针p，从头结点开始遍历链表
        My_Node p = this.head;
        while (p != null) {
            // 打印当前结点的值
            System.out.print(p.data + " -> ");
            // 将p指向下一个结点
            p = p.next;
        }
        // 打印null表示链表结束
        System.out.println("null");
    }

    // 主方法，用于测试
    public static void main(String[] args) {
        // 创建一个单链表L，参数为一个对象数组{"1", "a", "B", "2", "c", "D", "3"}
        My_LinkedList_Test L = new My_LinkedList_Test(new Object[]{"1", "a", "B", "2", "c", "D", "3"});
        // 打印L
        System.out.println("L:");
        L.print();
        // 调用拆分方法，得到L1、L2和L3
        My_LinkedList_Test[] result = L.split();
        My_LinkedList_Test L1 = result[0];
        My_LinkedList_Test L2 = result[1];
        My_LinkedList_Test L3 = result[2];
        // 打印L1、L2和L3
        System.out.println("L1:");
        L1.print();
        System.out.println("L2:");
        L2.print();
        System.out.println("L3:");
        L3.print();
    }
}

