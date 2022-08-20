package A_PRACTICS;

import java.util.Scanner;

public class Q18_isciHesapla {
    public static void main(String[] args) {
        /*  Problem Tanımı
    Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
    hesaplayan kodu yazınız.
    Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
    Buna göre 2 işçi aynı işi kaç günde yapar?

    Örnek Ekran Çıktısı
     Bir işçi işi kaç günde bitirmektedir? 10
     Toplam kaç işçi çalışacak? 2
    İşin bitme süresi 5 gündür.
    
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir isci bir isi kac günde bitirir");
        int isBitmeSüresi=scan.nextInt();
        System.out.println("toplam kac işci calıstıracak");
        int isci_Sayisi= scan.nextInt();
        double coklubitirmeSuresi=isBitmeSüresi/isci_Sayisi;
        System.out.println("coklubSuresi = " + coklubitirmeSuresi);
    }
}
