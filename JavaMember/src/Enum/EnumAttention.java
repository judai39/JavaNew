package Enum;

import javax.management.MBeanAttributeInfo;

public class EnumAttention {
    enum Gender{
        /**ö����һ��Ҫ������*/
        BOY,GIRL;   //public static final Gender=new Gender();  Ĭ�ϵ���Gender���������޲ι���

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