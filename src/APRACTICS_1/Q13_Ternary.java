package APRACTICS_1;

import java.util.Scanner;

public class Q13_Ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ürünün fiyatını giriniz");
        double fiyat=scan.nextDouble();
        if (fiyat<10){
            System.out.println("ucuz");
        } else if (fiyat<20){
            System.out.println("normal");

        } else if (fiyat>=20) {
            System.out.println("pahali");

        }

        System.out.println(fiyat<10?"ucuz":fiyat<20?"normal":"pahali");

    }

    }
    /*
     * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
     * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
     * olsun
     */


