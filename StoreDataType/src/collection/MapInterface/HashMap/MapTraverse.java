package collection.MapInterface.HashMap;

import java.util.*;

public class MapTraverse {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("С��","������");
        map.put("С��","Ӣ����");
        map.put("С��","��ѧ��");
        map.put("С��","������");

        //1.��HashMap�е�key����ȡ��,��ͨ��get()ȡ��Ԫ��
        Set set = map.keySet();
        for (Object key:set){
            System.out.println(key + "-" + map.get(key));
        }
        //2.������Iterator
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            Object key=iterator.next();
            System.out.println(key+"-"+map.get(key));
        }
        //3.���������value
        Collection values= map.values();
        /**����ȡ��Collection�ķ���*/
        //4.EntrySet��ȡk-v
            //��ǿfor
            Set entrySet = map.entrySet();
            for(Object entry:entrySet){
                Map.Entry en=(Map.Entry)entry;  /**����ת��*/
                System.out.println(en.getKey()+"-"+en.getValue());
            }
            //Iterator
            Iterator iterator1=entrySet.iterator();
            while(iterator1.hasNext()){
                Object entry=iterator1.next();   /**entry��ʱΪHashMap$Node*/
                Map.Entry en=(Map.Entry)entry;
                System.out.println(en.getKey()+"-"+en.getValue());
            }

    }
}
