package com.test;

public class Test3 {
    public static void main(String[] args) {
        /**����Ƚ��������л����������ͣ���ô���ǱȽ�ֵ�Ƿ����*/
        Integer i11=127;
        int i12=127;
        System.out.println(i11==i12);//true

        Integer i13=128;
        int i14=128;
        //int i14=i13.intValue();��Ҫ��һ��new Integer()ʵ������Ϊ�գ�������ʹ��intValue()���Ķ���ֵ
        System.out.println(i13==i14);//true
        System.out.println(i13.hashCode());
    }
}
