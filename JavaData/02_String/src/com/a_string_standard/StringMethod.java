package com.a_string_standard;

public class StringMethod {
    public static void main(String[] args) {
        String str="core ";
        System.out.println(str.charAt(0));
        System.out.println(str.trim());//去除前后空格
        System.out.println(str.substring(1, 3));//截取（前开后闭）
    }
}
