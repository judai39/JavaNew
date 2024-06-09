package collection.CollectionInterface.ArrayList.traverse;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(new Book("三国演义", "罗贯中",10.1));
        collection.add(new Book("红楼梦","曹雪芹",20));
        //1.使用Iterator迭代器遍历
        Iterator iterator=collection.iterator();
        while(iterator.hasNext()){
//            Object nextObject=iterator.next();
            System.out.println(iterator.next());     //重写toString()方法
        }
        //iterator.next();  NoSuchElementException异常(此时的iterator指针未被重置)
        iterator = collection.iterator();  //重置iterator指针

        //2.使用增强for循环遍历(简化版iterator,正因为本质还是Iterator,所以只能用于遍历,底层维护着另一个集合)
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
        return "书名是"+name+"  作者是"+author+"  价格是"+price;
    }

}
