package com.Yuli.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class test3_It {
    public static void main(String[]args){
        Collection<Person> ps = new ArrayList<>();
        ps.add(new Person("Alice", 25, "Female"));
        ps.add(new Person("Bob", 30, "Male"));
        ps.add(new Person("Charlie", 20, "Male"));
        System.out.println(ps);
        //这里打印地址信息，说明集合中存储的是元素地址，而不是元素内容。重写toString显示详细信息。

        for (Person p : ps) {
            System.out.println(p.getName());
            System.out.println(p.getAge());
            System.out.println(p.getGender());
        }
    }
}


class Person{
    String name;
    int age;
    String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}