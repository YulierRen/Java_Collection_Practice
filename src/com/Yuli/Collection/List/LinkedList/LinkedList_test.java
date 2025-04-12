package com.Yuli.Collection.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_test {
    public static void main(String[]args){
        LinkedList<Integer> list = new LinkedList<>();
        //基于双链表实现，查询慢，增删相对较快，首尾增删极快，可以用来队列,栈设计
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println("----------------------------------------");
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list);

        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list.pop());
        System.out.println(list);
    }
}
