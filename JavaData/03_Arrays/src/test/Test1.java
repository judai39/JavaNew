package test;

import java.util.ArrayList;
import java.util.Iterator;

//ʹ��List����Ԫ�أ�
public class Test1 {
    public static void main(String[] args) {
        ArrayList arrayList=new <Book>ArrayList();
        arrayList.add(new Book("��¥��",10));
        arrayList.add(new Book("���μ�",50));
        arrayList.add(new Book("����",30));
        arrayList.add(new Book("ˮ�",20));

        Iterator iterator=new Iterator<Book>() {
            @Override
            public boolean hasNext() {

                return false;
            }

            @Override
            public Book next() {
                return null;
            }
        };

    }
}



