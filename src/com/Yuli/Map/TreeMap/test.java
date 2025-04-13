package com.Yuli.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class test {
    public static void main(String[] args) {
        Map<Person,Integer> map = new TreeMap<>((o1,o2)->Integer.compare(o2.getAge(),o1.getAge()));
        map.put(new Person("李华",18),1);
        map.put(new Person("张三",19),2);
        map.put(new Person("莉莉",17),3);
        System.out.println(map);
    }
}

class Person{
    String name;
    int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}