package collection.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        /*1.�ظ�Ԫ����Ӳ���ɹ���������ͨ��ʵ�������룩
        2.�����ԣ����˳����ȡ��˳��һ�£�
        3.��size()��������ʹ�õ���������ǿfor������ֻ��set()û��get(),������ʹ����ͨfor
        */
        Set set = new HashSet();
        //1.add()���Ԫ��
        System.out.println(set.add("john"));   //add()��ӳɹ�����trueֵ
        System.out.println(set.add("john"));   //false
        Dog dog=new Dog("john");
        System.out.println(set.add(dog));   //true
        System.out.println(set.add(new Dog("john")));   //true
        System.out.println(set.add(new String("str")));//true
        System.out.println(set.add(new String("str")));//false
        set.add(null);
        System.out.println(set);
        //2.remove()ɾ��Ԫ��
        /*set.remove("john");     //ɾ��ָ��Ԫ��
        set.remove(dog);          //ɾ��ָ�������Ԫ��
        set.removeAll(set);       //ɾ��ȫ��Ԫ��
        System.out.println(set);    */
        //3.size(),set()��û��get()��
        /*System.out.println(set.size());
        for(int i=0;i< set.size();i++){
            System.out.println(set.get(1));     //����
        }*/
        //4.contains()�ж��Ƿ����,Set1.containsAll(Set2)�ж�Set1�Ƿ���Set2�е�����Ԫ��
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
