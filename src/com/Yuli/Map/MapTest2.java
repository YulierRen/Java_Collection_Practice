package com.Yuli.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);
        System.out.println(map1);

        System.out.println(map1.size());

        map1.clear();
        System.out.println(map1);
        System.out.println(map1.isEmpty());

        map1.put("a",1);
        map1.put("b",2);
        map1.put("c",3);

        System.out.println(map1.get("a"));

        map1.remove("a");
        System.out.println(map1.get("a"));

        System.out.println(map1.containsKey("a"));
        map1.containsValue(2);

        Iterator<String> it1 = map1.keySet().iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        Iterator<Integer> it2 = map1.values().iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        Map<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("e",5);
        map2.putAll(map1);
        System.out.println(map2);
    }
}
