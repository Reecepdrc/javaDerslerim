package day03_variables;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı girin");
        double sayi1=scan.nextDouble();
        System.out.println("Lütfen 2. sayıyı giriniz");
        double sayi2=scan.nextDouble();
        System.out.println("Girilen sayıların çarpımı"+ sayi1*sayi2);
    }
}
