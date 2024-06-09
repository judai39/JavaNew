package Enum;

public class EnumMethod {
    enum Season{
        SPRING("春天"), SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天"),
        Season("小写也可以");

        private String name;
        Season(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Season summer=Season.SUMMER;
        //1.toString()
        System.out.println(summer); //调用的是enum的默认sout(),也可自定义重写
        //2.name()返回当前对象的常量名
        System.out.println(summer.name());
        //3.ordinal()返回当前的枚举编号
        System.out.println(summer.ordinal());
        //4.values()返回当前枚举类中的所有常量
        Season[] values=Season.values();
        for (int i=0;i<values.length;i++){
            System.out.println(values[i]);
        }
        //5.valueOf()将指定的枚举常量的字符串转换为枚举对象
        Season summer1=Season.valueOf("SUMMER");
        System.out.println(summer1);
        System.out.println(summer == summer1);
        //6.compareTo()比较枚举编号(编号相同返回0,不同返回-1)
        System.out.println(Season.SUMMER.compareTo(Season.AUTUMN));
        //等价于Season.valueOf("SUMMER").compareTo(Season.valueOf("AUTUMN"));
        System.out.println(summer.compareTo(summer1));
    }

}
