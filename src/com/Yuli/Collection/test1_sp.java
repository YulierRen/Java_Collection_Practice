package com.Yuli.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;

public class test1_sp {
    public static void main(String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.get(3);
        //有序，可重复，提供索引

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);
//        set.get
        //无序，不可重复，不提供索引
    }
}
