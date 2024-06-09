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
        /**System.out.println(integer2); ���������ֵַ*/
        System.out.println(Arrays.toString(integer2));

        /**��дsort�е�java�Ƚ����е�compare()���Զ������򷽷�*/
        Arrays.sort(integer2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1<o2?1:0;
            }
        });

        //binarySearch() ��������
//        [1] ���������ڷ�Χ�ڣ�����������Ԫ�أ���1��ʼ�������á� - ���������ֵ����
//        [2] ���������ڷ�Χ�ڣ���������Ԫ�أ���0��ʼ������������ֵ������ֵ��
//        [3] �����������ڷ�Χ�ڣ���С�ڷ�Χ�����飩��Ԫ�أ����بC(fromIndex + 1)��
//        [4] �����������ڷ�Χ�ڣ��Ҵ��ڷ�Χ�����飩��Ԫ�أ����� �C(toIndex + 1)��
//        System.out.println(Arrays.binarySearch(integer1, 60));

        //Arrays.copyOf()

        //Arrays.copyOf()
        Integer[] integer = {1,2,3,4};
        Integer[] integers=new Integer[2];
        Integer[] newInteger=Arrays.copyOf(integer,2);
        System.out.println(Arrays.toString(newInteger));



    }
}
