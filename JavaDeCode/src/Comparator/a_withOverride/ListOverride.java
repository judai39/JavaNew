package Comparator.a_withOverride;

import java.util.*;

public class ListOverride {
    public static void compare(List<Person> peopleList){

        Collections.sort(peopleList, new Comparator<Person>() {
            @Override
            /**compare±ØÐëÖØÐ´*/
            public int compare(Person o1, Person o2) {
                return o1.age>o2.age?1: o1.age==o2.age?0:1;
            }
        });
    }
}
class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
