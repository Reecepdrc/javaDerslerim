package A_PRACTICS;

import java.util.Scanner;

public class kelimeTerstenYazdir {
    // Kullanicidan 5 harfli bir kelime isteyin
    // ve girilen kelimeyi tersten yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String kelime = scan.next();
        System.out.println(kelime.length());
        if (kelime.length() <= 5) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);
            char bes = kelime.charAt(4);
            System.out.println("Tersden :" +bes+ dort + uc + iki + bir);
        } else {
            System.out.println("Girdiginiz kelime uzunlugu 5 karakterden fazla");
        }
    }
}
