package day05_matematikselislemler;

import java.util.Scanner;

public class C03_RakamlarToplamiTam {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dört basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        int birlerBasamaği=0;

        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        birlerBasamaği=sayi%10;
        rakamlarToplami+=birlerBasamaği;
        sayi/=10;
        birlerBasamaği=birlerBasamaği%10;
        rakamlarToplami +=birlerBasamaği;
        sayi /=10;
        birlerBasamaği=sayi%10;
        rakamlarToplami+=birlerBasamaği;
        sayi/=10;
        birlerBasamaği=sayi%10;
        rakamlarToplami+=birlerBasamaği;
        sayi /=10;
        System.out.println(ilkGirilenSayi + "sayinin rakamlar toplami:"+rakamlarToplami);



    }
}
