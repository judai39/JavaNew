package collection.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put()���Ԫ��
        map.put("С��","������");
        map.put("С��","Ӣ����");
        map.put("С��","��ѧ��");
        map.put("С��","������");
        //2.remove()���ݼ�ɾ��ӳ���ϵ
        map.remove("С��");
        //3.get()���ݼ���ȡֵ
        System.out.println(map.get("С��"));
        //4.size()��ȡԪ�ظ���
        System.out.println(map.size());
        //5.isEmpty()�жϸ����Ƿ�Ϊ��
        System.out.println(map.isEmpty());
        //6.clear()���
         //map.clear();
        //7.containKey()���Ҽ��Ƿ����
        System.out.println(map.containsKey("С��"));
    }
}
