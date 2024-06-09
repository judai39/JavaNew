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
        /*linkedList.remove();*///无参默认删除第一个节点 .remove(index)删除特定节点
                            // .remove(object o)删除特定对象节点

     /*关于输出*/
     //iterator迭代器输出
        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            Object next=iterator.next();
            System.out.println(next);
        }
     //增强for循环(看有没有size())
        for (Object o:linkedList){  //for(集合元素类型 局部变量 ：目标对象)
                                    // 例如（for(int i : arr)）
            System.out.println(o);
        }
     //普通for循环(看有没有get())
        /**注意:!!! get()是LinkedList中特有的,编译类型若为Collection无法使用*/
        for(int i=0;i<linkedList.size();i++){
            System.out.println(linkedList.get(1));
        }
    }
}
