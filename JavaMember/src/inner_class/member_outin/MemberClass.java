package inner_class.member_outin;

public class MemberClass {
    private String privateParameter="˽������";
    String parameter="�ⲿ������";
    void test(){
        System.out.println("�������ⲿ����");
    }

    class Inner{
        String  parameter="�ڲ�������";
        void talkOut(){
            test();
            System.out.println("�ڲ���������ⲿ�෽�����ڲ���ֱ�ӷ��ʣ�");
            System.out.println("��ͨ���������ü�this������ͬ�����ⲿ�����Ժͷ���"
                    +MemberClass.this.parameter);
            System.out.println("��Ա�ڲ���ɷ����ⲿ���һ�г�Ա"+privateParameter);
        }
    }
    void talkIn(){
        Inner inner=new MemberClass().new Inner();
        //�ȼ���MemberClass member=new Member();Inner inner=member.new Inner();
        inner.talkOut();
        System.out.println("�ⲿ��������ڲ�������ʵ����������ʣ�");
    }

    public static void main(String[] args) {
        //ͨ��ʵ��������ֱ�ӵ���
        MemberClass.Inner inner=new MemberClass().new Inner();
        inner.talkOut();
        //ͨ��������ӵ���
        MemberClass memberClass=new MemberClass();
        memberClass.talkIn();

        //����������оֲ��ڲ���ķ���(��ͨ��Ա�ᱻ�̳и�����)

    }

}
