package com.Yuli.Collection;

import org.w3c.dom.ls.LSOutput;

public class More_Param_test {
    public static void main(String[] args) {
        print();
        print(1);
        print(1, 2, 3);
        print(new int[] {1, 2, 3});
    }

    //形参列表只能有一个可变形参，并且放在形参列表的最后
    public static void print(int... nums) {
        //本质上是一个数组
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
