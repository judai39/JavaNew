package com.b_string_stringbuffer;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("11");   //���Ԫ�غ�StringBuilder����һ��
        /**StringBuffer�̰߳�ȫ�ľ�������
         *
         * debug���´���
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
        System.out.println(stringBuilder.toString());      //returnһ���¶���
        System.out.println(stringBuffer.toString());       //�ӻ������
    }
}
