package com.b_integer;

public class Integer01 {
    public static void main(String[] args) {
        //��IntegerΪ��˵��װ��Ͳ���
        int i=1;
        //1. �ֶ�װ��Ͳ���(jdk5֮ǰ)
        Integer integer01=new Integer(i);
        Integer integer02=Integer.valueOf(i);
        int value=integer01.intValue();

        //2.�Զ�װ��Ͳ���(�ײ���Ȼ�����ֶ�װ��Ĵ��룬����װ������)
        int num=200;
        Integer integer=num;
        int numGet=integer;
    }
}
