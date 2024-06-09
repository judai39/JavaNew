package array.standard;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayStandard2_ArraysUtil {
    public static void main(String[] args) {
        //����ϻ�,���ǵõ���һ����ȷ�Ĵ洢����,���ڳ���ʹ��Array������ľ�̬����ȥ��������
        Person[] personArr=new Person[2];
        Person person1 = new Person("�洢��Ϣ1");
        Person person2 = new Person("�洢��Ϣ2");
        personArr[0]=person1;
        personArr[1]=person2;

        /**Arrays.copyOf(Ŀ������,�������鳤��)*/
        Person[] personArrNew=Arrays.copyOf(personArr,2);

        /**Arrays.toString(Ŀ������)*/
        System.out.println(Arrays.toString(personArrNew));
        //[array.standard.Person@4554617c, array.standard.Person@74a14482]  Person����û����дtoString()
        //��Ӻ�person�ɹ������Ϣ,���˵��Arrays�������е�toString()������Ϊ����������Ԫ�ص�toString()

        /**Arrays.copyOfRange(Ŀ������,��ʼ�±�,�����±�(��))*/
        Person[] personArrNewRange=Arrays.copyOfRange(personArr,0,6);//��������ʹ��null���
        System.out.println(Arrays.toString(personArrNewRange));

        /**Arrays.fill(Ŀ������,�����)*/
        Arrays.fill(personArrNewRange,new Person("��Ҫ������������"));
        System.out.println(Arrays.toString(personArrNewRange));

        /**Arrays.equals(Ŀ������1,Ŀ������2)*/
        System.out.println(Arrays.equals(personArr,personArrNew)); //true,�Ƚ�����Ԫ�ص�ַ�����(��д��������,δ��д��equals()�ǱȽ϶��ߵĵ�ַ�Ƿ����)
        //��֮���Ƶ���String�е�equals()
        /*String str1="";
        String str2="";
        System.out.println(str1.equals(str2));*/
        /**Arrays.hashCode(Ŀ������)*/
        System.out.println(Arrays.hashCode(personArr)==Arrays.hashCode(personArrNew));//��������Ԫ���е�hashֵ(��̫�Ͻ�,��һ������ͬ������hashֵ��Ӻ������?)

        /**Arrays.sort(Ŀ������)��������*/
        String[] toSort={"first","second","third","d"};
        Arrays.sort(toSort);//�Ƚ�hashֵ����Ҫע��,�����޷�ʹ��hashֵ��ʾ
        System.out.println(Arrays.toString(toSort));

        /**Arrays.binarySearch(Ŀ������)���ַ�����Ԫ��*/
        System.out.println(Arrays.binarySearch(toSort, "third"));
        Arrays.binarySearch(toSort,"third",String::compareToIgnoreCase);//���ַ�ģ����ѯ

        /**Arrays.stream(Ŀ������,��ʼ�±�,�����±�)*/
        System.out.println(Arrays.stream(personArr, 0, 1).count());
        //����������?

        /**Arrays.asList(Ŀ������)*/
        List<Person> personList=Arrays.asList(personArrNew);
        //�Զ����������������ת����ļ���
        Iterator iterator=personList.iterator();
        while(iterator.hasNext()){
            Person person=(Person)iterator.next();
            System.out.println(person);
        }
        //��ע��!!!!!!!    Arrays.asList() ���ص��� java.util.Arrays.ArrayList��
        //������ java.util.ArrayList�����ĳ����ǹ̶��ģ��޷�����Ԫ�ص�ɾ��������ӡ�
        //��˵��ʲô?    Arrays�з�װ��һ������asList()��static ArrayList(),static ��Ա�в��ܴ�Ŵ��ָ��,Ҳ���ܱ�ָ��ָ��
        /*personList.add(new Person("���޷���Ϊ�б�Ԫ�ض������,�ҵ�����Զ�������~~"));*/

        /**Arrays.setAll(Ŀ������,lambda����ʽ)*/
        int[] intArr=new int[9];
        Arrays.setAll(intArr,i->i*10);
        System.out.println(Arrays.toString(intArr));//[0, 10, 20, 30, 40, 50, 60, 70, 80]
        //Ϊ������������ԭ�������������

        /**Arrays.parallelPrefix()*/
    }
}
