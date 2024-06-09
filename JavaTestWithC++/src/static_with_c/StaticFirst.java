package static_with_c;

public class StaticFirst {
    static int num=1;
    static Object numNull;
}
class Client{
    public void Find(){
        String str;
        //全局静态变量,赋值,通过输出
        System.out.println(StaticFirst.num);
        //全局静态变量未赋值,依然通过输出(底层会分配默认值null)
        System.out.println(StaticFirst.numNull);
        //局部变量未赋值,不可通过编译
//        System.out.println(str);
        //补充一点,没有静态局部成员一说,静态成员是为了让全局成员获取,将静态成员封装到另一个成员里是要怎样?
//        static int num=1;

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.Find();
        StaticFirst staticFirst = new StaticFirst();
        System.out.println(staticFirst.num);
    }
}