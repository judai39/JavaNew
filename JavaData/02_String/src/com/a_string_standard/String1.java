package com.a_string_standard;


public class String1 {
    public static void main(String[] args) {
        //1.String�����ڲ�ά����һ���ַ�����( final char[] value={"",""....}),�����String�����valueֵ
        //�ײ�������final���Σ����ݵĵ�ַ���ɸ���
        /**����Ϊʲôϵͳ����ʹ��final�������Σ�String2�����н���*/
        final char[] value={'a','b','c'};
        char[] value2={'h'};
//        value[0]=value2;  value[0]ָ��value2�ĵ�ֵַ������

        //2.String����StringBuffer/StringBuilder�Ĺ���������
        String str=new String();
        str="ddd";//�����str�����������,ֻ������ָ��һ���µ�hashcode


        StringBuilder builder=new StringBuilder("aaa");
        //����debug���д���
        builder.append("dfd");//StringBuilder/StringBuffer�����append()��ʵ���ַ��������
        /**������Ҳֻ�ǿ������������,�ײ�ʵ�����Ƕ�����"�����ַ���String����",Ȼ��ȥ�������ַ�����char[],���ν�Ԫ��
         * ��ӵ�StringBuffer��ά����char[]��,���������StringBuffer/Builder,����String,������char[]Ϊ������λ
         * ���в�����,ֻ����String��ʼ�������Ǿ�̬(��ʼ��ָ������,char[].len()�ͷ�����ٿռ�),StringBuilder/Buffer
         * �Ƕ�̬����,������������ݶԿռ��������
         *
         * ����?�գࣩ�g:��ʵ��������������array,��list
         * */

        builder.append("dfsfaff");
        System.out.println(builder);


    }
}
