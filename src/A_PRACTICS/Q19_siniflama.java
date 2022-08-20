package A_PRACTICS;

import java.util.Scanner;

public class Q19_siniflama {
    /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;
        System.out.println("Kilonuzu kg olarak giriniz");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy*boy);
        if (bmi <= 20) {
            System.out.println("bmi indexsiniz"+"oldukca zayifsiniz");

        } else if (bmi<25) {
            System.out.println("bmi indexiniz"+bmi+"normalsiniz");

        }else if (bmi<30) {
            System.out.println("bmi indexiniz"+bmi+"sismansiniz");

        }else if (bmi>30) {
            System.out.println("bmi indexiniz"+bmi+"obezsiniz");

        }

    }
}
