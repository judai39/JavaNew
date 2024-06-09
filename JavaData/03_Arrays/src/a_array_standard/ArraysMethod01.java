package a_array_standard;


import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {
        //Arrays.toString
        Integer[] integer1={1,23,57};
        System.out.println(Arrays.toString(integer1));

        //Arrays.sort()
        Integer[] integer2={-1,23,4,1};
        Arrays.sort(integer2);
        /**System.out.println(integer2); 仅能输出地址值*/
        System.out.println(Arrays.toString(integer2));

        /**重写sort中的java比较器中的compare()以自定义排序方法*/
        Arrays.sort(integer2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1<o2?1:0;
            }
        });

        //binarySearch() 二分搜索
//        [1] 该搜索键在范围内，但不是数组元素，由1开始计数，得“ - 插入点索引值”；
//        [2] 该搜索键在范围内，且是数组元素，由0开始计数，得搜索值的索引值；
//        [3] 该搜索键不在范围内，且小于范围（数组）内元素，返回–(fromIndex + 1)；
//        [4] 该搜索键不在范围内，且大于范围（数组）内元素，返回 –(toIndex + 1)。
//        System.out.println(Arrays.binarySearch(integer1, 60));

        //Arrays.copyOf()

        //Arrays.copyOf()
        Integer[] integer = {1,2,3,4};
        Integer[] integers=new Integer[2];
        Integer[] newInteger=Arrays.copyOf(integer,2);
        System.out.println(Arrays.toString(newInteger));



    }
}
