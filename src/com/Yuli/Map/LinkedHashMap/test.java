package com.Yuli.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class test {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        System.out.println(map);//有序
    }
}
