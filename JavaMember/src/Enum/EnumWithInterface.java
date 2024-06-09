package Enum;

public class EnumWithInterface {
    //ʹ��enum�ؼ��ֺ�Ͳ�����enumȥ�̳��������ˣ�java�ǵ��̳л��ƣ��������Լ̳нӿ�
    interface  PrintSeason{
        public void print();
    }
    enum Seasons implements PrintSeason{
        SPRING("����"),SUMMER("����"),AUTUMN("����"),WINTER("����");
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

