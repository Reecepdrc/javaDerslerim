package A_PRACTICS;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz:");
        int sayi1=scan.nextInt();
        System.out.println("Lütfen ikinci bir tam sayi giriniz:");
        int sayi2=scan.nextInt();

        System.out.println("iki sayinin toplami:"+(sayi1+sayi2));
    }


}
