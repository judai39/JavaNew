package collection.SetInterface.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Traverse {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        Iterator iterator= set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
