package com.b_string_stringbuffer;

public class StringBuffer1 {
    public static void main(String[] args) {
//        ����StringBuilder��Stringÿ�ε��޸Ķ�Ҫ���´���һ���µ�String����ȥ�����޸ĵ�����
//        StringBuffer
        /**�ص㣺ʵ��AbstractString�ӿ�(AbstractStringBuilderʵ��Appendable,CharSequence�ӿ�)��
         * �������ַ���������������Ͻ�����Ӷ�����Ҫ�ٴδ���һ��ĸ�������*/
        //String��������ַ����������޸����޸ĵ�ַ����StringBuffer��������ַ����������޸����޸����ݣ�
        //StringBuffer final����

        /**ע��Դ�����,debug���´���*/
        /*�ײ㴴��һ��Sequence char[],�޲η����Զ�����len(16)*/
        StringBuffer stringBuffer = new StringBuffer();
        /*StringBuffer��ʵ�ֵ�AbstractStringBuilder�ӿ�,��ײ�ά������Ϊ"slot_2"��һ��char����
        *   ��StringBufferִ��append������,������ָ��AbstractStringBuilder�ӿ��е�getChars()������slot_2������и�ֵ����*/
        stringBuffer.append("ѧϰ");
        System.out.println(stringBuffer);


    }
}
