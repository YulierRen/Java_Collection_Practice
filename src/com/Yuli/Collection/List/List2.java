package com.Yuli.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List2 {
    public static void main(String[]args){
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");
        list1.add("grape");

        //索引遍历
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }

        Iterator<String> iterator = list1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(String fruit:list1){
            System.out.println(fruit);
        }

        list1.forEach(s->System.out.println(s));
    }
}
