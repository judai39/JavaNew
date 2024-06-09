package Enum;

public class EnumWithInterface {
    //使用enum关键字后就不可用enum去继承其他类了（java是单继承机制），但可以继承接口
    interface  PrintSeason{
        public void print();
    }
    enum Seasons implements PrintSeason{
        SPRING("春天"),SUMMER("夏天"),AUTUMN("秋天"),WINTER("冬天");
        private String seasonName;
        private Seasons(String name){
            this.seasonName=name;
        }
        @Override
        public void print(){
            Seasons[] seasons=Seasons.values();
            for (int i=0;i<seasons.length;i++){
                System.out.println(seasons[i]);
            }
        }
    }
}

