package address_with_c;

public class StringAddress {
    public static void main(String[] args) {
        String str1="sdfsdfsf";
        String str2="l;jlib";
        int address=12;
        System.out.println(address);
        str1=str2;
        address=str1.hashCode();
        System.out.println(address);
        //str1.hashCode()=str2.hashCode();
        //java: ���������
        //  ��Ҫ: ����
        //  �ҵ�:    ֵ
        //str.hashCode()ֻ��ָ��һ������(=����),������һ��ֵָ��,������*����=&ַ
    }
}
