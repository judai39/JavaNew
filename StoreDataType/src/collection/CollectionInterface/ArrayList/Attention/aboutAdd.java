package collection.CollectionInterface.ArrayList.Attention;
import java.util.ArrayList;
import java.util.Vector;

public class aboutAdd {
            /*����ֱ�Ӷ�ȡ���� && Vector��ArrayList��ά�������飨��Ҫ���ݣ�Ч�ʵͣ�*/
    public static void main(String[] args) {
        //Vector�������ݣ��̰߳�ȫ�����л�ȫ��Ԫ��(ֻ���ж�һ���Ƿ����Ԫ��)��ÿ������2��
        /**private void grow(int minCapacity) {
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + ((capacityIncrement > 0) ?capacityIncrement : oldCapacity);
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            elementData = Arrays.copyOf(elementData, newCapacity); ����
         }*/
        Vector vector = new Vector();       //Ĭ�ϳ�ʼInitialCapacity(10)��С��Vector���������������Ϊÿ�ε�2��(Arrays.copyOf())
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }


        //ArrayList�������ݣ��̲߳���ȫ�����л����Ԫ��(���ÿ�ζ�Ҫ�ж��Ƿ����Ԫ��)��ÿ������1.5��

        ArrayList arrayList = new ArrayList(1);//Ĭ�ϳ�ʼ��С(10)��ArrayList����,���������Ϊ1.5��
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

    }
}
