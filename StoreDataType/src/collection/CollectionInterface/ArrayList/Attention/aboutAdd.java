package collection.CollectionInterface.ArrayList.Attention;
import java.util.ArrayList;
import java.util.Vector;

public class aboutAdd {
            /*可以直接读取数据 && Vector与ArrayList中维护着数组（需要扩容，效率低）*/
    public static void main(String[] args) {
        //Vector容器扩容，线程安全，序列化全部元素(只需判断一次是否添加元素)，每次扩容2倍
        /**private void grow(int minCapacity) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + ((capacityIncrement > 0) ?capacityIncrement : oldCapacity);
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            elementData = Arrays.copyOf(elementData, newCapacity); 核心
         }*/
        Vector vector = new Vector();       //默认初始InitialCapacity(10)大小的Vector容器，而后的扩容为每次的2倍(Arrays.copyOf())
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }


        //ArrayList容器扩容，线程不安全，序列化添加元素(因此每次都要判断是否添加元素)，每次扩容1.5倍

        ArrayList arrayList = new ArrayList(1);//默认初始大小(10)的ArrayList容器,而后的扩容为1.5倍
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

    }
}
