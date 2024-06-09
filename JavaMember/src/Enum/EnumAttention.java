package Enum;

import javax.management.MBeanAttributeInfo;

public class EnumAttention {
    enum Gender{
        /**枚举量一定要在首行*/
        BOY,GIRL;   //public static final Gender=new Gender();  默认调用Gender构造器的无参构造

    }

    public static void main(String[] args) {
        Gender boy1=Gender.BOY;
        Gender boy2=Gender.BOY;
        Gender girl=Gender.GIRL;
        System.out.println(girl);
        System.out.println(boy1.getClass());
        System.out.println(boy1==boy2);
    }
}