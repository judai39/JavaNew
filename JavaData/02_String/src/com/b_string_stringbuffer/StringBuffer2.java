package com.b_string_stringbuffer;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("11");   //添加元素和StringBuilder代码一致
        /**StringBuffer线程安全的具体体现
         *
         * debug以下代码
         *  StringBuffer.toString()
         *      // Create a copy, don't share the array
         *         return new String(value, 0, count);
         *
         *  StringBuilder.toString()
         *      if (toStringCache == null) {
         *             toStringCache = Arrays.copyOfRange(value, 0, count);
         *         }
         *         return new String(toStringCache, true);
         *
         * */
        StringBuffer stringBuffer = new StringBuffer("11");
        System.out.println(stringBuilder.toString());      //return一个新对象
        System.out.println(stringBuffer.toString());       //从缓存池找
    }
}
