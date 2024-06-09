package collection.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapAttention {
    public static void main(String[] args) {
        /**
         *  1.Map��Collection���д��ڣ��������ӳ���ϵ������
         *  2.Map<K(Object key),V(Object value)>,key�������ظ�(�滻֮��ǰ����ͬkey��Ԫ��)
         *  3.Set Collection �����Ǵ�����һ���µ��������ͣ�ֻ����table�д�����ָ��HashMapNode
         *      ��һ����ֵַ
         *  4.(EntrySet<Entry<K,V>>)�������Map.Entry����ʵ�ʴ�ŵ���HashMap$Node��Nodeʵ����
         *      Entry�ӿڣ�������������ԣ����HashMap���Ա���ֵ��Map.Entry��
         *      ������static class Node <k,v> implements MapEntry<k,v>
         *      ��Ϊʲô�����߽�mapʵ��Entry�ӿ�-->������� for(Object Entry : set)
        */
        //Map�Ĵ����߼�
        Map map = new HashMap();
        map.put("no1","����ԭ��no1");
        map.put("no2","����no2");
        map.put("no1","no1�����");
        map.put(null,null);
        map.put(null,"null��value�пɴ��ڶ��");
        System.out.println(map.get("no1"));
        System.out.println(map);

        //Map�ı���
        Set set = map.entrySet();
        System.out.println(set.getClass()); //HashMap$EntrySet

        for (Object obj : set){
            Map.Entry entry = (Map.Entry) obj;  //These Map.Entry objects are valid only for the duration of the iteration;
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
