package com.Yuli.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayList_test {
    public static void main(String[] args) {
        // create an ArrayList object;
        Collection<Integer> list = new ArrayList<>();
        //ArrayList基于数组实现，查找快增删慢
        list.add(1);
        //添加时扩容到10,过边界添加时扩容到1.5倍
        //一次添加多个元素以添加元素的数量为准扩容
    }
}
