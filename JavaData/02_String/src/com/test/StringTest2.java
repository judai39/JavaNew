package com.test;

public class StringTest2 {
    public static void main(String[] args) {
        //����������ʲô
        String s1="dhy123";
        String s2="java";
        String s3="dhy123java";
        String s4=(s1+s2).intern(); //������s1+s2��hashֵ��ͬ����һ����Ա�ĵ�ֵַ
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}
