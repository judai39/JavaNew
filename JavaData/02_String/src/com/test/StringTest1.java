package com.test;

public class StringTest1 {
    public static void main(String[] args) {
        //������䴴���˼��������뽫�����������䲹��
        String s1="hello";
        s1="hh";

        String str1=new String("hello");
        String str2=new String("hh");
        str1=str2;
        System.out.println(str1);//��������


        //������䴴���˼��������뽫�����������䲹��
        String a="hello"+"abc";

        /***
        String str3=new String("hello");
        String str4=new String("abc");
        String str5=new String();
        str5=str3+str4;
        System.out.println(str5);//��������??????
        /**��Ȼ�ǴӺ���ǰ���У�����ֻ������hello��+��abc��ʱ��������ȴ��������������
         * java�����ϣ���������ٵĽ��ж���Ĵ���
         * */
        String str3=new String("hello"+"abc");
        System.out.println(str3);//����һ��


        //������䴴���˼��������뽫�����������䲹��
        String x="hi"+"efg";

        String str4=new String("hello");
        String str5=new String("abc");
        String str6=new String();
        str6=str4+str5;
        System.out.println(str6);//��������



    }
}
