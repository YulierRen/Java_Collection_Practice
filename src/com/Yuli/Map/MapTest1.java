package com.Yuli.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest1 {
    public static void main(String[]args){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("a",1);//无序，不重复,无索引
        map.put("a",2);//一个键对应一个值，会覆盖
        System.out.println(map);

        Map<String,Integer> map1 = new LinkedHashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        map1.put("d",4);
        map1.put("a",1);
        map1.put("a",2);//有序，不重复，无索引
        System.out.println(map1);

        Map<Integer,String> map2 = new TreeMap<>();
        map2.put(1,"a");
        map2.put(3,"b");
        map2.put(2,"c");
        map2.put(5,"d");
        map2.put(4,"a");//排序，不重复，无索引
        System.out.println(map2);
    }
}
