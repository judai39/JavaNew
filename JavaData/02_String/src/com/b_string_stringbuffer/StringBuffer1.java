package com.b_string_stringbuffer;

public class StringBuffer1 {
    public static void main(String[] args) {
//        引入StringBuilder，String每次的修改都要重新创建一个新的String对象去接收修改的数据
//        StringBuffer
        /**重点：实现AbstractString接口(AbstractStringBuilder实现Appendable,CharSequence接口)，
         * 可允许字符串可在自身基础上进行添加而不需要再次创建一个母对象接收*/
        //String保存的是字符串常量（修改是修改地址），StringBuffer保存的是字符串变量（修改是修改内容）
        //StringBuffer final修饰

        /**注意源码这块,debug以下代码*/
        /*底层创建一个Sequence char[],无参方法自动创建len(16)*/
        StringBuffer stringBuffer = new StringBuffer();
        /*StringBuffer所实现的AbstractStringBuilder接口,其底层维护者名为"slot_2"的一个char数组
        *   在StringBuffer执行append方法后,方法会指向AbstractStringBuilder接口中的getChars()方法对slot_2数组进行赋值操作*/
        stringBuffer.append("学习");
        System.out.println(stringBuffer);


    }
}
