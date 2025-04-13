package com.Yuli.Map;

import java.util.*;

public class nest {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Map<String,List<String>> map = new HashMap<>();
        map.put("hello nest",list);
        System.out.println(map);
    }
}
