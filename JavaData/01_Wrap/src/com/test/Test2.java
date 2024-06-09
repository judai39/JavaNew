package com.test;

public class Test2 {
    public static void main(String[] args) {
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);//false

        Integer m=1;//m=i-IntegerCache.min<==if(m<IntegerCache.max || m>IntegerCache.min)<==Integer.valueOf(m)
        Integer n=1;//Integer.valueOf()
        System.out.println(m==n);//true

        Integer x=128;//x=new Integer(x) <== if(x<IntegerCache.max || x>IntegerCache.min) <== Integer.valueOf(x)
        Integer y=128;
        System.out.println(x==y);//false
    }
}
