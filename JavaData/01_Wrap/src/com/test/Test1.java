package com.test;

public class Test1 {
    public static void main(String[] args) {
        Double d=100d;
        Float f=1.5f;

        //�Ƿ���ͬ��
        Object obj1=true? new Integer(1):new Double(2.0);
        /**��Ŀ������ı��ʽ1��2ҪΪ�ɽ��ձ��������ͣ�Ҫ����һ������*/
//        double i=true? 1 : 2.0;������������i�����η�ʹ��int�ͻᱨ��
        System.out.println(obj1);


        Object obj2;
        if(true)
            obj2=new Integer(1);
        else
            obj2=new Double(2.0);
        System.out.println(obj2);
    }
}
