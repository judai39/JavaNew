package inner_class.static_outin;

class StaticOutInInstance {
    public static void main(String[] args) {
        StaticOutInClass.StaticInner inner = new StaticOutInClass.StaticInner();
        inner.talkToOut();
    }
}

public class StaticOutInClass {
    static String staticParameter = "静态变量";
    String parameter = "普通变量";

    static class StaticInner {
        String innerParameter = "内部类中的变量";
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
        staticInner.talkToOut();/**普通成员访问内部静态内部类,需实例化静态内部类*/
    }
}
