package day03_variables;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        //kullanıcı ismi alma

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String kullaniciIsmi=scan.next();

        System.out.println("Isminiz:"+ kullaniciIsmi);


    }
}
