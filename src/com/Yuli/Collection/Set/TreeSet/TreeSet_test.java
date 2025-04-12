package com.Yuli.Collection.Set.TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet_test {
    public static void main(String[] args) {
        //基于红黑树实现
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(4);
        ts.add(3);
        ts.add(2);
        ts.add(2);
        System.out.println(ts);
        //如果要存入非常规的对象，需要重写compareTo方法
        Dog d1 = new Dog("小狗1", 3);
        Dog d2 = new Dog("小狗2", 5);
        Dog d3 = new Dog("小狗3", 2);
//        TreeSet<Dog> dogs = new TreeSet<>();
//        dogs.add(d1);
//        dogs.add(d2);
//        dogs.add(d3);
//        System.out.println(dogs);
        //或者使用有参构造器
        Set<Dog> set1 = new TreeSet<>((o1, o2) -> o1.getAge() - o2.getAge());
        set1.add(d1);
        set1.add(d2);
        set1.add(d3);
        System.out.println(set1);
    }
}

class Dog {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compareTo(Dog dog) {
//        return this.age - dog.getAge();
//    }
}
