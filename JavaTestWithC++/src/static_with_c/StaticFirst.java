package static_with_c;

public class StaticFirst {
    static int num=1;
    static Object numNull;
}
class Client{
    public void Find(){
        String str;
        //ȫ�־�̬����,��ֵ,ͨ�����
        System.out.println(StaticFirst.num);
        //ȫ�־�̬����δ��ֵ,��Ȼͨ�����(�ײ�����Ĭ��ֵnull)
        System.out.println(StaticFirst.numNull);
        //�ֲ�����δ��ֵ,����ͨ������
//        System.out.println(str);
        //����һ��,û�о�̬�ֲ���Աһ˵,��̬��Ա��Ϊ����ȫ�ֳ�Ա��ȡ,����̬��Ա��װ����һ����Ա����Ҫ����?
//        static int num=1;

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.Find();
        StaticFirst staticFirst = new StaticFirst();
        System.out.println(staticFirst.num);
    }
}