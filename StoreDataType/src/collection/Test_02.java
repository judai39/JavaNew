package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

////1.�����ǰʱ��
//        SimpleDateFormat Date_cn = new SimpleDateFormat("yyyy��MM��dd�� hh:mm:ss E");
//                String format = Date_cn.format(date);
//                System.out.println(format);
//                //2.����ַ���ָ����ʱ��
//                String str1="1996��01��01�� 10:20:30 ����һ";
//                String str2="08��15�� 04:21:27 �ܶ�";
//                /*Date parseDate=Date_cn.parse(str2);*/ //�׳��쳣��str2���ַ�����ʽ��SimpleDateFormat�����
//                Date parseDate=Date_cn.parse(str1);
//                System.out.println(Date_cn.format(parseDate));
public class Test_02 {
    public static void main(String[] args) throws ParseException {
        HashSet hashSet=new HashSet();
        hashSet.add(new Employee("Bob",3000,"2004��01��34��"));
        System.out.println(hashSet);
    }
}
class Employee{
    private String _name;
    private double _salary;
    private MyDate _birthday;
    public Employee(String name, double salary, String birthday) throws ParseException {
        this._name=name;
        this._salary=salary;
        this._birthday= new MyDate(birthday);
    }
    public String toString(){
        return this._name+this._salary+this._birthday;
    }
}
class MyDate{
    private String _dateString;
    public MyDate(String dateString) throws ParseException {
        this._dateString=dateString;
        getDate(_dateString);
    }

    public Date getDate(String dateString) throws ParseException {
        SimpleDateFormat date=new SimpleDateFormat("yyyy��MM��dd��");
       return date.parse(_dateString);
    }
    public String toString(){
        return this._dateString;
    }
}