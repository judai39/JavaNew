package collection.MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Employee emp1=new Employee(01,"A",12000);
        Employee emp2=new Employee(02,"B",20000);
        Employee emp3=new Employee(03,"C",15000);
        Map empMap=new HashMap();
        empMap.put(emp1.getId(),emp1);
        empMap.put(emp2.getId(),emp2);
        empMap.put(emp3.getId(),emp3);
        /**1*/
//        Set set=empMap.entrySet();
//        for(Object map:set){
//            Map.Entry entry=(Map.Entry)map;
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }

        Set set=empMap.entrySet();
        for(Object obj:set){
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
        /**2*/
//        Set set = empMap.entrySet();
//        Iterator iterator=set.iterator();
//        while(iterator.hasNext()){
//            Object obj=iterator.next();
//            Map.Entry entry=(Map.Entry)obj;
//            Employee emp=(Employee)entry.getValue();
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
class Employee{
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name,double salary) {
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