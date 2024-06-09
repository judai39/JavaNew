package collection.CollectionInterface.ArrayList.traverse;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    public static void main(String[] args) {
        //List接口实例化
        List list = new ArrayList();
//       1.add()方法增加集合元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println(list);
//        2.remove()删除元素（可指定目标内容或目标序列）
        list.remove(2); //list.remove("jack");
        System.out.println(list);
//        3.contains()查找元素
        System.out.println(list.contains("jack"));
//        4.size()获取元素个数
        System.out.println(list.size());
//        5.clear()清空元素
        //list.clear();
//        6.addAll()添加多个元素,removeAll()删除所有元素
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("红楼梦");
        list1.add("三国演义");
        list1.add("水浒传");
        list.addAll(list1);
        list.removeAll(list1);
        System.out.println(list);
    }
}
