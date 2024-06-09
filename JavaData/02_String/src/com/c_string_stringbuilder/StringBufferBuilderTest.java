package com.c_string_stringbuilder;

import java.sql.Time;

public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        long startTime;
        long endTime;

        startTime=System.currentTimeMillis();
        for(int i=0;i<20000000;i++){
            stringBuilder.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);//723Ãë

        startTime=System.currentTimeMillis();
        for (int i=0;i<20000000;i++){
            stringBuffer.append(String.valueOf(i));
        }
        endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);//846Ãë
    }
}
