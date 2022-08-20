package A_PRACTICS;

import java.util.Scanner;

public class Q20_kilo {
    /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve kilo 50 ve 50 den agir ise kan bagisi yapabilir.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("kilonuzu giriniz");
        int kilo=scan.nextInt();

        if (yas>0&& yas<18){
            System.out.println("yasi 18 den kucukler kan bagısı yapamaz");

        } else if (yas>=18) {
            if (kilo>0&& kilo<50){
                System.out.println("kilonuz 50 den kucuk oldugu icin kan bagısı yapamazsınız");
            } else if (kilo>=50) {
                System.out.println("kan bagısı yapabılırsınız");

            }

        }
    }

    public static class ElemanlariToplaArrayla {
        /*
         * arr1 = { {0,2,-1}, {3,8,9}, {7} }  ve  arr2 = { {-7,6,-9}, {0,12}, {19} }  veriliyor.
         * Bu iki array'in tum elemanlarinin toplamini bulan programi yaziniz.
         */
        public static void main(String[] args) {
            int arr1 [] [] = { {0,2,-1}, {3,8,9}, {7} };
            int arr2 [] [] = { {-7,6,-9}, {0,12}, {19} };
            int sum1 = 0;
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[i].length; j++) {
                    sum1 +=arr1[i][j];
                }
            }
            System.out.println("sum1 = " + sum1);
            int sum2 = 0;
            for (int i = 0; i <arr2.length ; i++) {
                for (int j = 0; j < arr2[i].length; j++) {
                    sum2 += arr2[i][j];
                }
            }
            System.out.println("sum2 = " + sum2);
            System.out.println("arr1 + arr2 nin elemanlari toplami : " + (sum1 + sum2));
        }
    }
}
