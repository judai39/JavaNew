package com.a_string_standard;

public class String3 {
    public static void main(String[] args) {
        Person p1 = new Person("dhy");
        Person p2 = new Person("dhy");
        //p1.name  p2.name本质上全部都是"dhy"
        System.out.println(p1.name.equals(p2.name));
        System.out.println(p1.name==p2.name);
        System.out.println(p1.name=="dhy");
    }
}

class Person{
    String name;

    public Person(String name) {
        this.name = name;
    }
}
