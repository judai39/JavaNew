package com.b_string_stringbuffer;

public class StringBufferMethod1 {
    public static void main(String[] args) {
        //StringBuffer常用方法
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("012345");
//        stringBuffer.delete(1,2);
        stringBuffer.replace(1,3,"");
        stringBuffer.replace(2,3,"");/*replace后的字符串会重新排序*/
        System.out.println(stringBuffer);
    }
}
