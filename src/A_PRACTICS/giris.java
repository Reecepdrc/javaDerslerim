package A_PRACTICS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class giris {
    public static void main(String[] args) {/*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */
        System.out.println("Hos  Geldiniz Okulumuza");

        System.out.println("isim giriniz");
        Scanner scan=new Scanner(System.in);
        String isim=scan.nextLine();
        System.out.println("soyisim giriniz");
        String soyisim=scan.nextLine();
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("brans giriniz");
        String brans=scan.nextLine();
        scan.nextLine();
        System.out.println("tel giriniz");
        String tel=scan.nextLine();

        OgretmenBilgileri adayOgretmen=new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
        List<OgretmenBilgileri> OgretmenList=new ArrayList<>();
        OgretmenList.add(adayOgretmen);
        System.out.println("OgretmenList=");
    }
}
