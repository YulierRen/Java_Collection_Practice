package com.Yuli.Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);

        Stream<Map.Entry<String,Integer>> stream = map.entrySet().stream();

        stream.filter(e -> e.getKey().equals("a")).forEach(System.out::println);

        String[]names = {"a","b","c","d","e","f","g"};

        Stream<String> stream1 = Arrays.stream(names);
        Stream<String> stream2 = Stream.of("a","b","c","d","e","f","g");
        stream1.filter(e -> e.equals("a")).forEach(System.out::println);
    }
}
