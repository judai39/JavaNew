package collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_01 {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Book("sf","sf",1));
        list.add(new Book("sdffs","hgr",2));
        list.add(new Book("jipe","hswg",3));

        for (Object book:list){
            System.out.println(book);
        }
        Iterator iterator= list.iterator();
        while(iterator.hasNext()){
            Object bookInstanceObject=iterator.next();
            System.out.println(bookInstanceObject);
        }
    }
}
class Book{
    String _name;
    String _author;
    int _id;
    public Book(String name, String author,int id){
        _name=name;
        _author=author;
        _id=id;
    }
    public String toString(){
        return "书名为"+this._name+"  作者为"+this._author+"  id为"+this._id;
    }
}
