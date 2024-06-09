package com.test;

public class Test1 {
    public static void main(String[] args) {
        Double d=100d;
        Float f=1.5f;

        //是否相同？
        Object obj1=true? new Integer(1):new Double(2.0);
        /**三目运算符的表达式1，2要为可接收变量的类型，要看作一个整体*/
//        double i=true? 1 : 2.0;例如这个，如果i的修饰符使用int就会报错
        System.out.println(obj1);


        Object obj2;
        if(true)
            obj2=new Integer(1);
        else
            obj2=new Double(2.0);
        System.out.println(obj2);
    }
}
