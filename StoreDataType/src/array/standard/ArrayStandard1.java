package array.standard;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStandard1 {
    public static void main(String[] args) {
        //数组是存储数据类型(引用),数组底层没有直接输出的方法,遍历需要自行实现
        //声明一个数组,并初始化(初始化又分为静态初始化,动态初始化)
        int[] arrIntDynamic=new int[3];//动态
        int[] arrIntStatic={1,2,3};//静态

        //闲话到此为止吧,这样的数组是没有意义的,所谓的数组,我更希望能够称作存储数据类型
        Person[] personArr=new Person[2];
        Person person1 = new Person("存储信息1");
        Person person2 = new Person("存储信息2");
        personArr[0]=person1;
        personArr[1]=person2;
    }


}
