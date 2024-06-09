package array.standard;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayStandard2_ArraysUtil {
    public static void main(String[] args) {
        //书接上回,我们得到了一个正确的存储数据,现在尝试使用Array工具类的静态方法去操作数组
        Person[] personArr=new Person[2];
        Person person1 = new Person("存储信息1");
        Person person2 = new Person("存储信息2");
        personArr[0]=person1;
        personArr[1]=person2;

        /**Arrays.copyOf(目标数组,作用数组长度)*/
        Person[] personArrNew=Arrays.copyOf(personArr,2);

        /**Arrays.toString(目标数组)*/
        System.out.println(Arrays.toString(personArrNew));
        //[array.standard.Person@4554617c, array.standard.Person@74a14482]  Person类中没有重写toString()
        //添加后person成功输出信息,间接说明Arrays工具类中的toString()调用作为参数的数组元素的toString()

        /**Arrays.copyOfRange(目标数组,起始下标,截至下标(开))*/
        Person[] personArrNewRange=Arrays.copyOfRange(personArr,0,6);//多余区间使用null填充
        System.out.println(Arrays.toString(personArrNewRange));

        /**Arrays.fill(目标数组,填充物)*/
        Arrays.fill(personArrNewRange,new Person("我要填满整个数组"));
        System.out.println(Arrays.toString(personArrNewRange));

        /**Arrays.equals(目标数组1,目标数组2)*/
        System.out.println(Arrays.equals(personArr,personArrNew)); //true,比较数组元素地址否相等(重写后是这样,未重写的equals()是比较二者的地址是否相等)
        //与之类似的是String中的equals()
        /*String str1="";
        String str2="";
        System.out.println(str1.equals(str2));*/
        /**Arrays.hashCode(目标数组)*/
        System.out.println(Arrays.hashCode(personArr)==Arrays.hashCode(personArrNew));//遍历数组元素中的hash值(不太严谨,万一两个不同的数组hash值相加后相等呢?)

        /**Arrays.sort(目标数组)排序数组*/
        String[] toSort={"first","second","third","d"};
        Arrays.sort(toSort);//比较hash值排序要注意,中文无法使用hash值表示
        System.out.println(Arrays.toString(toSort));

        /**Arrays.binarySearch(目标数组)二分法检索元素*/
        System.out.println(Arrays.binarySearch(toSort, "third"));
        Arrays.binarySearch(toSort,"third",String::compareToIgnoreCase);//二分法模糊查询

        /**Arrays.stream(目标数组,起始下标,截至下标)*/
        System.out.println(Arrays.stream(personArr, 0, 1).count());
        //数据流详情?

        /**Arrays.asList(目标数组)*/
        List<Person> personList=Arrays.asList(personArrNew);
        //自定义迭代器遍历我们转换后的集合
        Iterator iterator=personList.iterator();
        while(iterator.hasNext()){
            Person person=(Person)iterator.next();
            System.out.println(person);
        }
        //请注意!!!!!!!    Arrays.asList() 返回的是 java.util.Arrays.ArrayList，
        //并不是 java.util.ArrayList，它的长度是固定的，无法进行元素的删除或者添加。
        //这说明什么?    Arrays中封装着一个用于asList()的static ArrayList(),static 成员中不能存放存放指针,也不能被指针指向
        /*personList.add(new Person("我无法作为列表元素而被添加,我的心永远是数组的~~"));*/

        /**Arrays.setAll(目标数组,lambda函数式)*/
        int[] intArr=new int[9];
        Arrays.setAll(intArr,i->i*10);
        System.out.println(Arrays.toString(intArr));//[0, 10, 20, 30, 40, 50, 60, 70, 80]
        //为新数组填充基于原本数组的新数组

        /**Arrays.parallelPrefix()*/
    }
}
