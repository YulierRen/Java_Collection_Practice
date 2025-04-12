package com.Yuli.Collection.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[]args){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(222);
        set.add(3);
        set.add(444);
        set.add(555);
        set.add(3);
        set.add(6);
        set.add(4);
        set.add(8);
        set.add(1);
        set.add(10);
        System.out.println(set);
        //无序，不是随机，不重复，无索引
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(1);
        set2.add(222);
        set2.add(3);
        set2.add(444);
        set2.add(555);
        set2.add(3);
        set2.add(6);
        set2.add(4);
        set2.add(8);
        set2.add(1);
        set2.add(10);
        System.out.println(set2);
        //有序，不重复，无索引

        Set<Integer> set3 = new TreeSet<>();
        set3.add(1);
        set3.add(222);
        set3.add(3);
        set3.add(444);
        set3.add(555);
        set3.add(3);
        set3.add(6);
        set3.add(4);
        set3.add(8);
        set3.add(1);
        set3.add(10);
        System.out.println(set3);
        //升序（默认），不重复，无索引

        //set的方法几乎与Collection方法相同，只是存储方式不同
    }
}
