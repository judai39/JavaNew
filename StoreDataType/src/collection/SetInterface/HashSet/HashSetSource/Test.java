package collection.SetInterface.HashSet.HashSetSource;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;

public class Test{


    public static void main(String[] args) {
        Employee employee1 = new Employee("bob", 1400,new MyDate("2004","05","23"));
        Employee employee2 = new Employee("hair", 31000,new MyDate("1993","03","01"));
        Employee employee3 = new Employee("bob", 1400,new MyDate("2004","05","23"));
        HashSet hashSet = new HashSet();
        hashSet.add(employee1);
        hashSet.add(employee2);
        hashSet.add(employee3);
        System.out.println(hashSet);
    }
}
class Employee{
    private String _name,_birthday;private int _salary;
    public Employee(String name,int salary,MyDate mydate){
        this._name=name;
        this._salary=salary;
        this._birthday=mydate._year+mydate._month+mydate._day;
    }

        @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Employee employee=(Employee)obj;
        return _salary == employee._salary && Objects.equals(_birthday,employee._birthday)
                && Objects.equals(_name,employee._name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name,_salary,_birthday);
    }
    public String toString(){
        return this._name+this._salary+this._birthday;
    }
}
class MyDate{
    String _year,_month,_day;
    Calendar  calendar= Calendar.getInstance();
    /**输入字符串时的构造器*/
    public MyDate(String year, String month, String day) {
        this._year = year;
        this._month = month;
        this._day = day;
    }
    /**输入日期时的构造器*/
    public MyDate(Date date){
        calendar.setTime(date);
        this._year=""+calendar.get(Calendar.YEAR);
//        this._month=(calendar.get(Calendar.MONTH)).toString();    toString()转换字符不是都适用的，要看该对象的所属类是否有toString()方法的适配
        this._month=String.valueOf(calendar.get(Calendar.MONTH));
        this._day=String.valueOf(calendar.get(Calendar.DATE));
    }
    public String DateString(Date date){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        return dateFormat.format(dateFormat);
    }
}
