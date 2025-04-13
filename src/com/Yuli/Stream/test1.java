package com.Yuli.Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"a","b","c","d","e","f","g");

        list.stream().filter(s->s.equals("a")).forEach(s->System.out.println(s));
    }
}
