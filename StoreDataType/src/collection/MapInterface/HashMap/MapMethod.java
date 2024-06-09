package collection.MapInterface.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put()添加元素
        map.put("小明","语文书");
        map.put("小红","英语书");
        map.put("小刚","数学书");
        map.put("小紫","政治书");
        //2.remove()根据键删除映射关系
        map.remove("小明");
        //3.get()根据键获取值
        System.out.println(map.get("小红"));
        //4.size()获取元素个数
        System.out.println(map.size());
        //5.isEmpty()判断个数是否为零
        System.out.println(map.isEmpty());
        //6.clear()清除
         //map.clear();
        //7.containKey()查找键是否存在
        System.out.println(map.containsKey("小粉"));
    }
}
