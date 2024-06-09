package Enum;

public class EnumInstance {
    enum Season{
        //enum常量用“,”连接
        /*public static final Season AUTUMN=new Season("秋天");*/
        SPRING("春天","this is spring"),SUMMER("夏天","this is summer");

        private String seasonName;
        private Season(String seasonName,String description){
            this.seasonName=seasonName;
        }
        //只有getter，只读不设
        private String getSeasonName(){
            return seasonName;
        }
    }
}
