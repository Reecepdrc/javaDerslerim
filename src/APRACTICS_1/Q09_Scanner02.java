package APRACTICS_1;

import java.util.Scanner;

public class Q09_Scanner02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi, memleketinizi,\n konumunuzu, boyunuzu, ve yasinizi giriniz\n aralarda Enter tusuna basiniz".toUpperCase());
        String isminiz= scan.nextLine ();
        System.out.println("isminiz = " + isminiz.toUpperCase());
        String soyisiminiz= scan.nextLine ();
        System.out.println("soyisiminiz = " + soyisiminiz.toUpperCase());
        String memleketiniz= scan.nextLine ();
        System.out.println("memleketiniz = " + memleketiniz.toUpperCase());
        String konumunuz= scan.nextLine ();
        System.out.println("konumunuz = " + konumunuz.toUpperCase());
        double boy= scan.nextDouble ();
        System.out.println("boyunuz = " + boy);
           int yas=scan.nextInt();
        System.out.println("yasiniz = " + yas);
        String cvp=scan.nextLine();

        System.out.println("yasadiginiz" + konumunuz + "u seviyor musunuz? true/false= ");
        boolean seviyorMu=scan.nextBoolean();



    }
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line




}
