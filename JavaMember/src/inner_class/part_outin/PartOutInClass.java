package inner_class.part_outin;

public class PartOutInClass {
    public Use Method() {
        //�ֲ��ڲ���ֻ�ܱ�final���Σ���Ϊ�ֲ������Ͳ�����������
        final class usefulMethod implements Use {
            @Override
            public void useful() {
                System.out.println("�ֲ��ڲ�����д�ӿڷ���");
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



