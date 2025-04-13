package com.Yuli.Map.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class test {
    public static void main(String[] args) {
        cat cat1 = new cat("哈基米",8);
        cat cat3 = new cat("哈基米",8);
        cat cat2 = new cat("哈基耄",9);
        Map<cat,Integer> map = new HashMap<>();
        map.put(cat1,1);
        map.put(cat2,2);
        map.put(cat3,2);
        //重写Hashcode和equals方法，存储时就会在内容上保持HashMap的特点
        System.out.println(map);
    }
}

class cat{
    String name;
    int age;

    public cat() {
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
    public String toString() {
        return "cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        cat cat = (cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}