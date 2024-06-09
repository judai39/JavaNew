package com.test;

public class Test3 {
    public static void main(String[] args) {
        /**如果比较类型中有基本数据类型，那么就是比较值是否相等*/
        Integer i11=127;
        int i12=127;
        System.out.println(i11==i12);//true

        Integer i13=128;
        int i14=128;
        //int i14=i13.intValue();总要找一个new Integer()实例对象（为空？），再使用intValue()更改对象值
        System.out.println(i13==i14);//true
        System.out.println(i13.hashCode());
    }
}
