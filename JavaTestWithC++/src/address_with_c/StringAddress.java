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
        //java: 意外的类型
        //  需要: 变量
        //  找到:    值
        //str.hashCode()只能指向一个变量(=变量),不能用一个值指向,类似于*变量=&址
    }
}
