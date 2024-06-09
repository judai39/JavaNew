package com.b_integer;

public class Integer01 {
    public static void main(String[] args) {
        //以Integer为例说明装箱和拆箱
        int i=1;
        //1. 手动装箱和拆箱(jdk5之前)
        Integer integer01=new Integer(i);
        Integer integer02=Integer.valueOf(i);
        int value=integer01.intValue();

        //2.自动装箱和拆箱(底层仍然还是手动装箱的代码，被封装起来了)
        int num=200;
        Integer integer=num;
        int numGet=integer;
    }
}
