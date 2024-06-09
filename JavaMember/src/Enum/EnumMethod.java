package Enum;

public class EnumMethod {
    enum Season{
        SPRING("����"), SUMMER("����"),AUTUMN("����"),WINTER("����"),
        Season("СдҲ����");

        private String name;
        Season(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Season summer=Season.SUMMER;
        //1.toString()
        System.out.println(summer); //���õ���enum��Ĭ��sout(),Ҳ���Զ�����д
        //2.name()���ص�ǰ����ĳ�����
        System.out.println(summer.name());
        //3.ordinal()���ص�ǰ��ö�ٱ��
        System.out.println(summer.ordinal());
        //4.values()���ص�ǰö�����е����г���
        Season[] values=Season.values();
        for (int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        //5.valueOf()��ָ����ö�ٳ������ַ���ת��Ϊö�ٶ���
        Season summer1=Season.valueOf("SUMMER");
        System.out.println(summer1);
        System.out.println(summer == summer1);
        //6.compareTo()�Ƚ�ö�ٱ��(�����ͬ����0,��ͬ����-1)
        System.out.println(Season.SUMMER.compareTo(Season.AUTUMN));
        //�ȼ���Season.valueOf("SUMMER").compareTo(Season.valueOf("AUTUMN"));
        System.out.println(summer.compareTo(summer1));
    }

}
