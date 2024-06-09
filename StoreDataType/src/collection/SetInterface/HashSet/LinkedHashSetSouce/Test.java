package collection.SetInterface.HashSet.LinkedHashSetSouce;

import java.util.*;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("°ÂÍÐ",3000);
        Car car2 = new Car("°ÂµÏ",10000);
        Car car3 = new Car("°ÂÍÐ",3000);
        Set set = new LinkedHashSet();
        set.add(car1);
        set.add(car2);
        set.add(car3);
        System.out.println(set);
    }


}
class Car{
    private String _name;
    private double _price;
    public Car(String name,double price){
        this._name=name;this._price=price;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)return true;
        if(obj==null || getClass()!=obj.getClass())return false;
        Car car=(Car)obj;
        return this._price==car._price && Objects.equals(_name,car._name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "_name='" + _name + '\'' +
                ", _price=" + _price +
                '}';
    }
}
