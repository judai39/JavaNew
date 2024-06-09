package collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

////1.输出当前时间
//        SimpleDateFormat Date_cn = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
//                String format = Date_cn.format(date);
//                System.out.println(format);
//                //2.输出字符串指定的时间
//                String str1="1996年01月01日 10:20:30 星期一";
//                String str2="08月15日 04:21:27 周二";
//                /*Date parseDate=Date_cn.parse(str2);*/ //抛出异常，str2的字符串格式与SimpleDateFormat不相符
//                Date parseDate=Date_cn.parse(str1);
//                System.out.println(Date_cn.format(parseDate));
public class Test_02 {
    public static void main(String[] args) throws ParseException {
        HashSet hashSet=new HashSet();
        hashSet.add(new Employee("Bob",3000,"2004年01月34日"));
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
        SimpleDateFormat date=new SimpleDateFormat("yyyy年MM月dd日");
       return date.parse(_dateString);
    }
    public String toString(){
        return this._dateString;
    }
}