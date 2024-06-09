package function.lambda_function;


interface PrintInfo {
    void print(String data,String message);
}


public class LambdaFunction {
    static void printJob(PrintInfo printInfo, String message,String data) {
        printInfo.print(message,data);
    }

    public static void main(String[] args) {
//        printJob((statement1,statement2) -> System.out.println("We're learning " + statement1), "Lambda");
        /**以上是错误理解,是在写什么...此处匿名体现在,参数1 PrintInfo匿名(未实现)*/
        printJob((statement1,statement2) -> { System.out.println("底层返回了一个PrintInfo实现类,参数为:+statement1+statement2");}
                ,"参数message","参数data");

    }

}
