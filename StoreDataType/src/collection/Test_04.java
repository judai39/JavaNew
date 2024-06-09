package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test_04 {
    public static void main(String[] args) {
        Employees emp1=new Employees(01,"A",12000);
        Employees emp2=new Employees(02,"B",20000);
        Employees emp3=new Employees(03,"C",15000);
        Map empMap=new HashMap();
        empMap.put(emp1.getId(),emp1);
        empMap.put(emp2.getId(),emp2);
        empMap.put(emp3.getId(),emp3);
        /**将hashMap转成EntrySet，使用EntrySet的方法*/
//        Set set=empMap.entrySet();
//        for (Object obj:set){
//            Map.Entry entry=(Map.Entry)obj;
//            System.out.println(entry.getKey() + "-" + entry.getValue());
//        }
        /**将hashMap中的key通过keySet()取出遍历key取出value值（要求该map中的value必须是数据对象）*/
//        Set set1=empMap.keySet();
//        for (Object obj:set1){
//            Employees emp=(Employees)empMap.get(obj);
//            System.out.println(emp);
//        }





        /**1*/
//        Set set=empMap.entrySet();
//        for(Object map:set){
//            Map.Entry entry=(Map.Entry)map;
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }
            /**2*/
//        Set set = empMap.entrySet();
//        Iterator iterator=set.iterator();
//        while(iterator.hasNext()){
//            Object obj=iterator.next();
//            Map.Entry entry=(Map.Entry)obj;
//            Employees emp=(Employees)entry.getValue();
//            if(emp.getSalary()>18000){
//                System.out.println(entry.getKey()+"-"+entry.getValue());
//            }
//        }
        /**3*/
//        Set set = empMap.keySet();
//        for(Object key:set){
//            Employee emp=(Employee)empMap.get(key);
//            if(emp.getSalary()>18000){
//                System.out.println(emp);
//            }
//        }

    }
}
class Employees{
    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public double getSalary(){
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +"salary=" + salary+
                '}';
    }
}
