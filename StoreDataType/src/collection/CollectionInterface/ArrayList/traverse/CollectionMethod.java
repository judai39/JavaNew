package collection.CollectionInterface.ArrayList.traverse;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        //List�ӿ�ʵ����
        List list = new ArrayList();
//       1.add()�������Ӽ���Ԫ��
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
//        2.remove()ɾ��Ԫ�أ���ָ��Ŀ�����ݻ�Ŀ�����У�
        list.remove(2); //list.remove("jack");
        System.out.println(list);
//        3.contains()����Ԫ��
        System.out.println(list.contains("jack"));
//        4.size()��ȡԪ�ظ���
        System.out.println(list.size());
//        5.clear()���Ԫ��
        //list.clear();
//        6.addAll()��Ӷ��Ԫ��,removeAll()ɾ������Ԫ��
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("��¥��");
        list1.add("��������");
        list1.add("ˮ䰴�");
        list.addAll(list1);
        list.removeAll(list1);
        System.out.println(list);
    }
}
