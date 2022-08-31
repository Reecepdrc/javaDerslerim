package day48_maps_TheEnd;

import java.util.ArrayList;
import java.util.List;

public class lambdalarim {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);
        listElemanlariniYazdir(list);
        System.out.println();
        ciftElemanlariYazdir(list);
        System.out.println();
        teklerinKaresiYazdir(list);
        System.out.println();
        teklerinKüpleriYazdir(list);
        System.out.println();
        ciftSayilarinKareleriniYazdir(list);
        System.out.println();
        ciftSayilarinKareleriniYazdir(list);
        ciftSayilarinKüplerininCarpimiYazdir(list);
        getMaxEleman(list);
        getYedidenBuyukCiftMinEleman(list);
    }

    public static void listElemanlariniYazdir(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));//sadece list elemanlarini yazdirma
    }

    public static void ciftElemanlariYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));//cift olan elemanları yazdırır
    }

    public static void teklerinKaresiYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));//tek sayıların karesi

    }

    public static void teklerinKüpleriYazdir(List<Integer> list) {
        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));//tek sayilarin küpleri
    }

    public static void ciftSayilarinKareleriniYazdir(List<Integer> list) {
        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(toplam);
    }

    public static void ciftSayilarinKüplerininCarpimiYazdir(List<Integer> list) {
        Integer carpim = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carpim);
    }

    public static void getMaxEleman(List<Integer> list) {
        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);//en buyuk elemanı bul
        System.out.println(max);
    }

    public static void getYedidenBuyukCiftMinEleman(List<Integer> list) {
        Integer min = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);//en buyuk elemanı bul
        System.out.println(min);
    }
}
