package collection.CollectionInterface.LinkedList.traverse;
import java.util.Iterator;
import java.util.LinkedList;
public class traverse {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(3);
        /*linkedList.remove();*///�޲�Ĭ��ɾ����һ���ڵ� .remove(index)ɾ���ض��ڵ�
                            // .remove(object o)ɾ���ض�����ڵ�

     /*�������*/
     //iterator���������
        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            Object next=iterator.next();
            System.out.println(next);
        }
     //��ǿforѭ��(����û��size())
        for (Object o:linkedList){  //for(����Ԫ������ �ֲ����� ��Ŀ�����)
                                    // ���磨for(int i : arr)��
            System.out.println(o);
        }
     //��ͨforѭ��(����û��get())
        /**ע��:!!! get()��LinkedList�����е�,����������ΪCollection�޷�ʹ��*/
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(1));
        }
    }
}
