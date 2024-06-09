package com.a_string_standard;


public class String2 {
    public static void main(String[] args) {
        //关于String的创建
        String string = new String();//无参构造创建的是空字符串
        String string1="";
        System.out.println(string==string1); //false 比较地址值
        System.out.println(string1.hashCode());
        System.out.println(string.hashCode());
        System.out.println(string.equals(string1));//true 比较hash值

        /**String的元素分为地址值和内容值（hash值）,String修饰的量我们一般成为String常量（直接指向字符值）
         *      String的引入建立在hashcode的基础上（以hashcode编码值代替字母，封装字母），并不涉及值的概念
         *     因此引入equals()来对值进行比较，equals比较的是字符串的hashcode值(字符串内容相同，hashcode值就相同)
         *      地址值是每个变量的身份证，都是不一样的
         *   ！！！对于String1中的char[]value不可修改成员变量的地址，本质上和String的地址无关，仅涉及String底层维护的内容数组
         *          地址，成员地址的不可改变就意味着String的内容结构（注意不是内容不可改变）不可改变，【内容结构保证String对成员的控制】
         *
         *          （；?д｀）ゞjava中的类的逻辑都可依照以上描述进行
         * */

        System.out.println(string1==string.intern());
        //成员A.intern() 将会返回一个与成员A hash相同但地址不同  的成员B
        //如果没有找到与A hash值相同的另一成员，则返回A的hash值
        System.out.println(string==string.intern());
        System.out.println(string.intern());
    }
}
