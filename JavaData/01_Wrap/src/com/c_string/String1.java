package com.c_string;

public class String1 {
    public static void main(String[] args) {
        //Integer=>String
        Integer i=100;
        String str1=i+"";
        String str2=String.valueOf(i);

        //String=>Integer
        Integer num1=Integer.parseInt(str1);//ʹ��Integer�Դ��ľ�̬�ŷ�
        Integer num2=new Integer(str2); //ʹ��Integer�Դ��Ĺ�����


    }
}
