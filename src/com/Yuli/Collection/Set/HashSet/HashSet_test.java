package com.Yuli.Collection.Set.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class HashSet_test {
    public static void main(String[]args){
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        //新元素添加时，创建一个默认长度为16的数组，默认加载因子为0.75
        //不同的元素往哈希表中存储的位置依据与哈希值和compareto的实现有关
        //如果哈希值对应的表的位置上桶的值为null，直接存入
        //如果桶的值不为null，则比较元素大小，形成链表
        //当链表中元素数量大于8且哈希表的size大于64，链表形成自平衡二叉搜索树（红黑树），并且根据compareto的实现，调整树的结构插入节点
        //equals比较的是元素地址，会造成内容相等的两个元素equals不相等。需要重写hashcode和equals方法

        Person p1 = new Person("Tom", 20);
        Person p2 = new Person("Jack", 30);
        Person p3 = new Person("Tom", 20);
        HashSet<Person> set1 = new HashSet<>();
        set1.add(p1);
        set1.add(p2);
        set1.add(p3);
        set1.forEach(s->System.out.println(s.getName() + " " + s.getAge()));
        //注释重写的hashcode和equals方法，输出结果为Tom 20 Jack 30 Tom 20
    }
}

class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
