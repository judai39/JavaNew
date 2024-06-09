package input_output;

import java.io.InputStream;
import java.util.Scanner;

public class Input_Scanner {

    public static void main(String[] args) {
        System.out.println("scanner context");
        Scanner scanner=new Scanner(System.in);
        String context=scanner.next();
        System.out.println(context);

    }
}
