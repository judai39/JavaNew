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
        /**�����Ǵ������,����дʲô...�˴�����������,����1 PrintInfo����(δʵ��)*/
        printJob((statement1,statement2) -> { System.out.println("�ײ㷵����һ��PrintInfoʵ����,����Ϊ:+statement1+statement2");}
                ,"����message","����data");

    }

}
