package com.Yuli.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class test2_Collection {
    public static void main(String[]args){
        Collection<String> test = new ArrayList<>();
        test.add("1");
        test.add("2");
        test.add("1");
        test.add("2");
        test.add("3");
        //Collection的add
        System.out.println(test);

        test.clear();
        //清空
        System.out.println(test);
        //以下略
        System.out.println(test.isEmpty());
        test.add("1");
        test.add("2");
        test.add("1");
        test.add("2");
        test.add("3");
        System.out.println(test.size());

        System.out.println(test.contains("1"));

        test.remove("2");

        System.out.println(test);

        Object[]s = test.toArray();
        String[]s2=test.toArray(new String[test.size()]);
        //需要知道集合里都是String
        System.out.println(Arrays.toString(s2));


        //集合倒入
        Collection<String> test2 = new ArrayList<>();

        test2.add("1");
        test2.add("2");
        test2.add("1");
        test2.add("2");
        test2.addAll(test);
        System.out.println(test2);
    }
}
