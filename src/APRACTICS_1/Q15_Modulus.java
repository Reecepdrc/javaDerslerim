package APRACTICS_1;

import java.util.Scanner;

public class Q15_Modulus {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("gideceğiniz yol mesafesi");
        double yol=scan.nextDouble();
        System.out.println("ortalama hızınız km/saat):");
        double ort_hiz=scan.nextDouble();

        double varis_suresi=yol/ort_hiz;
        System.out.println("varis sureniz :"+varis_suresi+"sa");
        scan.close();

    }
}
