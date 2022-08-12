package day03_variables;

import java.util.Scanner;

public class C08_Scannerilkharf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("Ismin ilk harfi:"+ilkHarf);
    }
}
