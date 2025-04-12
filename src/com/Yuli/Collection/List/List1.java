package com.Yuli.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[]args){
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        System.out.println(list);

        list.add(2,"index");
        System.out.println(list);

        System.out.println(list.remove(2));
        System.out.println(list);

        list.set(2,"index");
        System.out.println(list);
    }
}
