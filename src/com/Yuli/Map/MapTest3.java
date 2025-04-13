package com.Yuli.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest3 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        map1.put("d",4);
        map1.put("e",5);

        //遍历方式。
        Iterator<Map.Entry<String,Integer>> iterator = map1.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Lambda表达式
        map1.forEach((k,v)->{
            System.out.println(k+v);
        });

    }
}
