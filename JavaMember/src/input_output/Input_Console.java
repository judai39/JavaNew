package input_output;

import java.io.Console;

public class Input_Console {
    public static void main(String[] args) {
        Console console = System.console();
        String username = console.readLine();
        console.printf("username:" + username);
        char[] password = console.readPassword();
        console.printf("password:" + String.valueOf(password));
        /**直接运行会报空指针异常,因为我们没有开辟Console空间*/
        //应该在命令行运行该文件,在目标文件夹下新建txt,填写
        /*  javac Input_Console.java

            java Input_Console

            pause
        * */
        //系统在通过编译生成字节码文件后,会在控制台中请求数据(在填写char[] password数组数据时是不显示的)
    }
}
