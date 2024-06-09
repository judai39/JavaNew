package com.test;

public class StringTest1 {
    public static void main(String[] args) {
        //以下语句创建了几个对象，请将创建对象的语句补齐
        String s1="hello";
        s1="hh";

        String str1=new String("hello");
        String str2=new String("hh");
        str1=str2;
        System.out.println(str1);//两个对象


        //以下语句创建了几个对象，请将创建对象的语句补齐
        String a="hello"+"abc";

        /***
        String str3=new String("hello");
        String str4=new String("abc");
        String str5=new String();
        str5=str3+str4;
        System.out.println(str5);//三个对象??????
        /**既然是从后往前运行，当你只看到”hello“+”abc“时，你会优先创建对象再相加吗？
         * java设计者希望尽可能少的进行对象的创建
         * */
        String str3=new String("hello"+"abc");
        System.out.println(str3);//仅有一个


        //以下语句创建了几个对象，请将创建对象的语句补齐
        String x="hi"+"efg";

        String str4=new String("hello");
        String str5=new String("abc");
        String str6=new String();
        str6=str4+str5;
        System.out.println(str6);//三个对象



    }
}
