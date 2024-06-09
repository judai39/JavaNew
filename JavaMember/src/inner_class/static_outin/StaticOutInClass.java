package inner_class.static_outin;

class StaticOutInInstance {
    public static void main(String[] args) {
        StaticOutInClass.StaticInner inner = new StaticOutInClass.StaticInner();
        inner.talkToOut();
    }
}

public class StaticOutInClass {
    static String staticParameter = "��̬����";
    String parameter = "��ͨ����";

    static class StaticInner {
        String innerParameter = "�ڲ����еı���";
        static int i = 0;
        int i1;

        void talkToOut() {
            System.out.println(innerParameter);
            System.out.println(staticParameter);
            System.out.println(StaticOutInClass.staticParameter);
        }
    }

    void talkToIn() {
        StaticInner staticInner = new StaticInner();
        staticInner.talkToOut();/**��ͨ��Ա�����ڲ���̬�ڲ���,��ʵ������̬�ڲ���*/
    }
}
