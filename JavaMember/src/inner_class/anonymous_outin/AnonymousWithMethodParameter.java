package inner_class.anonymous_outin;

//匿名内部类本质是具有对象性质的类，实例化一次后出栈废弃

//1.使用接口作为方法参数调用某个方法
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
        String sound = "汪汪";
        AnonymousWithMethodParameter.animalShout(new AnonymousWithMethodParameter.Animal() {
            @Override
            public void shout() {
                System.out.println(name + "叫声是" + sound);
            }
        });
            /* 匿名内部类的常用情况（临时重写接口，突破了接口和抽象类不能实例化的局限性）
            Animal animal = new Animal() {
                @Override
                public void shout() {
                    System.out.println("我被临时重写咧");
                }
            };  */
    }
}