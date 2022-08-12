package day15_OverLoading;

import static day14_methodCration.C01_MethodCration.terstenYazdir;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun
        String input="ıcıraD peceR";
        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}
