package APRACTICS_1;

import java.util.Scanner;

public class kelimeninHangisiUzun {
    // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen ismini ve soyisminizi giriniz :\nisim");
        String isim = scan.next();
        System.out.println("soyisim");
        String soyisim = scan.next();
        if(isim.length()>soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");
        }else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminiz ile esit uzunlukta");
        }else System.out.println("soyisminiz isminizden uzun");
    }
}
