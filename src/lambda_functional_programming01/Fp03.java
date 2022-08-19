package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        System.out.println();
        buyukHarfleYazdir(liste);
        System.out.println();

        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(liste);
        /*buyukHarfleYazdir02(liste);*/

    }//1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1.yol
    public static void buyukHarfleYazdir(List<String>list){
        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
        System.out.println();
    }//2.yol
   /* //public static void buyukHarfleYazdir02(List<String>list){
    //    list.replaceAll(String::toUpperCase);
    //    System.out.println(list);*/
    /*/2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.*/
    public static void uzunlugaGoreYazdir(List<String>list){
        list
                .stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(Utils::ayniSatirdaBosluklaYazdir);

    }public static void uzunlugaGoreTersYazdir(List<String>list){
        list
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(Utils::ayniSatirdaBosluklaYazdir);
}public static void sonKaraktereGoreTekrarsizYazdir(List<String>list){
        list.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
