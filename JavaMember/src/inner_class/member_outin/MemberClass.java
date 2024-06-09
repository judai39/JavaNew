package inner_class.member_outin;

public class MemberClass {
    private String privateParameter="私有属性";
    String parameter="外部类属性";
    void test(){
        System.out.println("这里是外部方法");
    }

    class Inner{
        String  parameter="内部类属性";
        void talkOut(){
            test();
            System.out.println("内部类访问了外部类方法（内部类直接访问）");
            System.out.println("可通过类名调用加this来调用同名的外部类属性和方法"
                    +MemberClass.this.parameter);
            System.out.println("成员内部类可访问外部类的一切成员"+privateParameter);
        }
    }
    void talkIn(){
        Inner inner=new MemberClass().new Inner();
        //等价于MemberClass member=new Member();Inner inner=member.new Inner();
        inner.talkOut();
        System.out.println("外部类访问了内部方法（实例化对象访问）");
    }

    public static void main(String[] args) {
        //通过实例化对象直接调用
        MemberClass.Inner inner=new MemberClass().new Inner();
        inner.talkOut();
        //通过方法间接调用
        MemberClass memberClass=new MemberClass();
        memberClass.talkIn();

        //子类继续享有局部内部类的访问(普通成员会被继承给子类)

    }

}
