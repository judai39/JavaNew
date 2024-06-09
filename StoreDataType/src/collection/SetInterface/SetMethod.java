package collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        /*1.重复元素添加不会成功（但可以通过实例化加入）
        2.无序性（存放顺序与取出顺序不一致）
        3.有size()方法（可使用迭代器与增强for），但只有set()没有get(),不可以使用普通for
        */
        Set set = new HashSet();
        //1.add()添加元素
        System.out.println(set.add("john"));   //add()添加成功返回true值
        System.out.println(set.add("john"));   //false
        Dog dog=new Dog("john");
        System.out.println(set.add(dog));   //true
        System.out.println(set.add(new Dog("john")));   //true
        System.out.println(set.add(new String("str")));//true
        System.out.println(set.add(new String("str")));//false
        set.add(null);
        System.out.println(set);
        //2.remove()删除元素
        /*set.remove("john");     //删除指定元素
        set.remove(dog);          //删除指定对象的元素
        set.removeAll(set);       //删除全部元素
        System.out.println(set);    */
        //3.size(),set()（没有get()）
        /*System.out.println(set.size());
        for(int i=0;i< set.size();i++){
            System.out.println(set.get(1));     //报错
        }*/
        //4.contains()判断是否存在,Set1.containsAll(Set2)判断Set1是否有Set2中的所有元素
        System.out.println(set.contains("john"));
        Set set1=new HashSet();
        set1.add("john");
        System.out.println(set.containsAll(set1));
    }
}
class Dog{
    private String _name;

    public Dog(String name){
        this._name=name; }
}
