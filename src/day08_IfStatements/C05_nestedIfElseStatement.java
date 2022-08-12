package day08_IfStatements;

import java.util.Scanner;

public class C05_nestedIfElseStatement {
    public static void main(String[] args) {
        //Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
        // Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        // Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
        // Ilk harf z ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String sifre = scan.nextLine();
        char ilkharf = sifre.charAt(0);
        if (ilkharf >= 'A' && ilkharf <= 'Z') ;


    }}