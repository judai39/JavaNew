package input_output;

import java.io.Console;

public class Input_Console {
    public static void main(String[] args) {
        Console console = System.console();
        String username = console.readLine();
        console.printf("username:" + username);
        char[] password = console.readPassword();
        console.printf("password:" + String.valueOf(password));
        /**ֱ�����лᱨ��ָ���쳣,��Ϊ����û�п���Console�ռ�*/
        //Ӧ�������������и��ļ�,��Ŀ���ļ������½�txt,��д
        /*  javac Input_Console.java

            java Input_Console

            pause
        * */
        //ϵͳ��ͨ�����������ֽ����ļ���,���ڿ���̨����������(����дchar[] password��������ʱ�ǲ���ʾ��)
    }
}
