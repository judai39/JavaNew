package com.a_string_standard;


public class String1 {
    public static void main(String[] args) {
        //1.String对象内部维护着一串字符序列( final char[] value={"",""....}),这代表String对象的value值
        //底层数据由final修饰，内容的地址不可更改
        /**关于为什么系统对其使用final进行修饰，String2类中有解释*/
        final char[] value={'a','b','c'};
        char[] value2={'h'};
//        value[0]=value2;  value[0]指向value2的地址值，错误

        //2.String类与StringBuffer/StringBuilder的功能上区别
        String str=new String();
        str="ddd";//这里的str不能添加内容,只能重新指向一个新的hashcode


        StringBuilder builder=new StringBuilder("aaa");
        //尝试debug下列代码
        builder.append("dfd");//StringBuilder/StringBuffer里带有append()可实现字符串的添加
        /**但这样也只是看起来添加上了,底层实际上是对生成"新增字符串String对象",然后去除新增字符串的char[],依次将元素
         * 添加到StringBuffer所维护的char[]中,因此无论是StringBuffer/Builder,还是String,都是以char[]为基本单位
         * 进行操作的,只不过String初始化分区是静态(初始化指定多少,char[].len()就分配多少空间),StringBuilder/Buffer
         * 是动态分区,会根据新增内容对空间进行扩容
         *
         * （；?д｀）ゞ:其实这个区别很类似与array,和list
         * */

        builder.append("dfsfaff");
        System.out.println(builder);


    }
}
