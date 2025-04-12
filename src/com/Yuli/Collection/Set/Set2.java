package com.Yuli.Collection.Set;

public class Set2 {
    public static void main(String[] args) {
        test t1 = new test("Tom", 20);
        test t2 = new test("Tom", 20);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t1.hashCode());
    }
}

class test{
    String name;
    int age;
    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public test() {
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
}
