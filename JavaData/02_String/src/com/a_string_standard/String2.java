package com.a_string_standard;


public class String2 {
    public static void main(String[] args) {
        //����String�Ĵ���
        String string = new String();//�޲ι��촴�����ǿ��ַ���
        String string1="";
        System.out.println(string==string1); //false �Ƚϵ�ֵַ
        System.out.println(string1.hashCode());
        System.out.println(string.hashCode());
        System.out.println(string.equals(string1));//true �Ƚ�hashֵ

        /**String��Ԫ�ط�Ϊ��ֵַ������ֵ��hashֵ��,String���ε�������һ���ΪString������ֱ��ָ���ַ�ֵ��
         *      String�����뽨����hashcode�Ļ����ϣ���hashcode����ֵ������ĸ����װ��ĸ���������漰ֵ�ĸ���
         *     �������equals()����ֵ���бȽϣ�equals�Ƚϵ����ַ�����hashcodeֵ(�ַ���������ͬ��hashcodeֵ����ͬ)
         *      ��ֵַ��ÿ�����������֤�����ǲ�һ����
         *   ����������String1�е�char[]value�����޸ĳ�Ա�����ĵ�ַ�������Ϻ�String�ĵ�ַ�޹أ����漰String�ײ�ά������������
         *          ��ַ����Ա��ַ�Ĳ��ɸı����ζ��String�����ݽṹ��ע�ⲻ�����ݲ��ɸı䣩���ɸı䣬�����ݽṹ��֤String�Գ�Ա�Ŀ��ơ�
         *
         *          ����?�գࣩ�gjava�е�����߼���������������������
         * */

        System.out.println(string1==string.intern());
        //��ԱA.intern() ���᷵��һ�����ԱA hash��ͬ����ַ��ͬ  �ĳ�ԱB
        //���û���ҵ���A hashֵ��ͬ����һ��Ա���򷵻�A��hashֵ
        System.out.println(string==string.intern());
        System.out.println(string.intern());
    }
}
