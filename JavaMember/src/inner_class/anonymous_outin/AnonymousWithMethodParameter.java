package inner_class.anonymous_outin;

//�����ڲ��౾���Ǿ��ж������ʵ��࣬ʵ����һ�κ��ջ����

//1.ʹ�ýӿ���Ϊ������������ĳ������
public class AnonymousWithMethodParameter {
    interface Animal {
        void shout();
    }

    public static void animalShout(Animal animal) {
        animal.shout();
    }
}


class Instance {
    public static void main(String[] args) {
        String name = "dog";
        String sound = "����";
        AnonymousWithMethodParameter.animalShout(new AnonymousWithMethodParameter.Animal() {
            @Override
            public void shout() {
                System.out.println(name + "������" + sound);
            }
        });
            /* �����ڲ���ĳ����������ʱ��д�ӿڣ�ͻ���˽ӿںͳ����಻��ʵ�����ľ����ԣ�
            Animal animal = new Animal() {
                @Override
                public void shout() {
                    System.out.println("�ұ���ʱ��д��");
                }
            };  */
    }
}