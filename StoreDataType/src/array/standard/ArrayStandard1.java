package array.standard;


import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayStandard1 {
    public static void main(String[] args) {
        //�����Ǵ洢��������(����),����ײ�û��ֱ������ķ���,������Ҫ����ʵ��
        //����һ������,����ʼ��(��ʼ���ַ�Ϊ��̬��ʼ��,��̬��ʼ��)
        int[] arrIntDynamic=new int[3];//��̬
        int[] arrIntStatic={1,2,3};//��̬

        //�л�����Ϊֹ��,������������û�������,��ν������,�Ҹ�ϣ���ܹ������洢��������
        Person[] personArr=new Person[2];
        Person person1 = new Person("�洢��Ϣ1");
        Person person2 = new Person("�洢��Ϣ2");
        personArr[0]=person1;
        personArr[1]=person2;
    }


}
