package com.b_string_stringbuffer;

public class StringBufferMethod1 {
    public static void main(String[] args) {
        //StringBuffer���÷���
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("012345");
//        stringBuffer.delete(1,2);
        stringBuffer.replace(1,3,"");
        stringBuffer.replace(2,3,"");/*replace����ַ�������������*/
        System.out.println(stringBuffer);
    }
}
