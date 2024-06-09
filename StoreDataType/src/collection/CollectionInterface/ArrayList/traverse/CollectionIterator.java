package collection.CollectionInterface.ArrayList.traverse;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("��������", "�޹���",10.1));
        collection.add(new Book("��¥��","��ѩ��",20));
        //1.ʹ��Iterator����������
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
//            Object nextObject=iterator.next();
            System.out.println(iterator.next());     //��дtoString()����
        }
        //iterator.next();  NoSuchElementException�쳣(��ʱ��iteratorָ��δ������)
        iterator = collection.iterator();  //����iteratorָ��

        //2.ʹ����ǿforѭ������(�򻯰�iterator,����Ϊ���ʻ���Iterator,����ֻ�����ڱ���,�ײ�ά������һ������)
        for(Object book:collection){
            System.out.println(book);
        }
    }
}

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String toString(){
        return "������"+name+"  ������"+author+"  �۸���"+price;
    }

}
