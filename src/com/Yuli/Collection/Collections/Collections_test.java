package com.Yuli.Collection.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_test {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Collections.addAll(list,1,2,3,4);

        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (integer, t1) -> t1.compareTo(integer));
        System.out.println(list);
    }
}
