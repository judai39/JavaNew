package Enum;

public class EnumInstance {
    enum Season{
        //enum�����á�,������
        /*public static final Season AUTUMN=new Season("����");*/
        SPRING("����","this is spring"),SUMMER("����","this is summer");

        private String seasonName;
        private Season(String seasonName,String description){
            this.seasonName=seasonName;
        }
        //ֻ��getter��ֻ������
        private String getSeasonName(){
            return seasonName;
        }
    }
}
