package collection.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAttention {
    public static void main(String[] args) {
        /**
         *  1.Map与Collection并列存在，保存具有映射关系的数据
         *  2.Map<K(Object key),V(Object value)>,key不允许重复(替换之先前的相同key的元素)
         *  3.Set Collection 并不是创建的一个新的数据类型，只是于table中创建的指向HashMapNode
         *      的一个地址值
         *  4.(EntrySet<Entry<K,V>>)定义的是Map.Entry，但实际存放的是HashMap$Node（Node实现了
         *      Entry接口，获得了链表属性，因此HashMap可以被赋值给Map.Entry）
         *      ·即：static class Node <k,v> implements MapEntry<k,v>
         *      ·为什么开发者将map实现Entry接口-->方便遍历 for(Object Entry : set)
        */
        //Map的创建逻辑
        Map map = new HashMap();
        map.put("no1","我是原来no1");
        map.put("no2","我是no2");
        map.put("no1","no1被替代");
        map.put(null,null);
        map.put(null,"null在value中可存在多个");
        System.out.println(map.get("no1"));
        System.out.println(map);

        //Map的遍历
        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet

        for (Object obj : set){
            Map.Entry entry = (Map.Entry) obj;  //These Map.Entry objects are valid only for the duration of the iteration;
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
