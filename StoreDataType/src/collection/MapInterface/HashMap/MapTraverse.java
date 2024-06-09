package collection.MapInterface.HashMap;

import java.util.*;

public class MapTraverse {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("小明","语文书");
        map.put("小红","英语书");
        map.put("小刚","数学书");
        map.put("小紫","政治书");

        //1.将HashMap中的key单独取出,再通过get()取出元素
        Set set = map.keySet();
        for (Object key:set){
            System.out.println(key + "-" + map.get(key));
        }
        //2.迭代器Iterator
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            Object key=iterator.next();
            System.out.println(key+"-"+map.get(key));
        }
        //3.仅输出所有value
        Collection values= map.values();
        /**三种取出Collection的方法*/
        //4.EntrySet获取k-v
            //增强for
            Set entrySet = map.entrySet();
            for(Object entry:entrySet){
                Map.Entry en=(Map.Entry)entry;  /**向下转型*/
                System.out.println(en.getKey()+"-"+en.getValue());
            }
            //Iterator
            Iterator iterator1=entrySet.iterator();
            while(iterator1.hasNext()){
                Object entry=iterator1.next();   /**entry此时为HashMap$Node*/
                Map.Entry en=(Map.Entry)entry;
                System.out.println(en.getKey()+"-"+en.getValue());
            }

    }
}
