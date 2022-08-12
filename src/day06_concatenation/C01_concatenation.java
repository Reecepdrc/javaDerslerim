package day06_concatenation;

import java.util.Scanner;

public class C01_concatenation {
    public static void main(String[] args) {
        String str="Java ile hayat ne güzel";
        System.out.println(str.toUpperCase());
        boolean guzelMi=true;
        Boolean buGüzelMi=true;
        buGüzelMi.toString();
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        String ogrNo="123456";

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 5basamaklı bir sifre giriniz");
        String sifre=scan.nextLine();
        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen sifrenin üc fazlası:"+(sifre+3));
        System.out.println("Integer sifre:+(sifre+3))");






    }
}
