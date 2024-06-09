package com.test;

public class StringTest2 {
    public static void main(String[] args) {
        //下面代码输出什么
        String s1="dhy123";
        String s2="java";
        String s3="dhy123java";
        String s4=(s1+s2).intern(); //返回与s1+s2的hash值相同的另一个成员的地址值
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
