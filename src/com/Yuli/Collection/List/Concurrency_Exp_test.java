package com.Yuli.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Concurrency_Exp_test {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            int i = iterator.next();
//            if(i % 2 == 0){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);这里会报异常，是迭代器预置好的

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
        //这里发现索引由于集合元素删除导致没有扫描到已删除元素的下一个元素

        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(list.get(i));
                i--;//处理删除元素导致的索引变化，因为删除元素会导致索引自动加一
            }
        }
        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)%2==0){
                list.remove(list.get(i));
                //倒着删，后面的元素往前走，索引往后走，两不相误/
            }
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            if(i % 2 == 0){
//                list.remove(i);
                iterator.remove();//使用迭代器删除元素,也就是删除迭代器当前遍历到的数据，更优雅
            }
        }
        System.out.println(list);
    }
}
