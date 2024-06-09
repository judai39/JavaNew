package test;

import java.util.ArrayList;
import java.util.Iterator;

//使用List排序元素？
public class Test1 {
    public static void main(String[] args) {
        ArrayList arrayList=new <Book>ArrayList();
        arrayList.add(new Book("红楼梦",10));
        arrayList.add(new Book("西游记",50));
        arrayList.add(new Book("三国",30));
        arrayList.add(new Book("水浒",20));

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



