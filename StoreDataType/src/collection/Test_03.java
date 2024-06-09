package collection;

import java.util.HashSet;
import java.util.Objects;

public class Test_03 {
    public static void main(String[] args) {
        Employee3 employee1=new Employee3("bob",21);
        Employee3 employee2=new Employee3("hare",22);
        Employee3 employee3=new Employee3("bob",21);
        HashSet hashset=new HashSet();
        hashset.add(employee1);
        hashset.add(employee2);
        hashset.add(employee3);
        System.out.println(hashset);
    }


}
class Employee3{
    private String _name;
    private int _age;
    public Employee3(String name,int age){
        this._name=name;
        this._age=age;
    }
    public String toString(){
        return this._name+this._age;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==this)return true;
        if (obj==null||getClass()!=obj.getClass())return false;
        Employee3 employee3=(Employee3)obj;
        return _age==employee3._age&& Objects.equals(_name,employee3._name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _age);
    }
}