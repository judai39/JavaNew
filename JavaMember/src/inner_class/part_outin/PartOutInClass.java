package inner_class.part_outin;

public class PartOutInClass {
    public Use Method() {
        //局部内部类只能被final修饰（因为局部变量就不可以这样）
        final class usefulMethod implements Use {
            @Override
            public void useful() {
                System.out.println("局部内部类重写接口方法");
            }
        }
        return new usefulMethod();
    }

    interface Use {
        public void useful();
    }
}

class test {
    public static void main(String[] args) {
        PartOutInClass partOutInClass = new PartOutInClass();
        partOutInClass.Method().useful();
    }
}



