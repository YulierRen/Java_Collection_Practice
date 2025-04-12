package com.Yuli.Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSet_test {
    public static void main(String[] args) {
        //在Hashset的基础上，元素有前一个和后一个元素的地址保证有序，内存上比较大。
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");
        set.add("pear");
        set.add("watermelon");
        System.out.println(set);
    }
}
