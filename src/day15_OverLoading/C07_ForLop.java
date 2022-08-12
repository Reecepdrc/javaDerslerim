package day15_OverLoading;

public class C07_ForLop {
    public static void main(String[] args) {

        C06_StringTerseCevirme.terstenYazdir("baba");

        // 100'den 1'e kadar(sinirlar dahil) 8 ile bolunebilen sayilari yazdirin
        for (int i = 100; i >=1 ; i--) {
            if (i%8==0){
                System.out.print(i+" ");
            }
        }
    }


}
