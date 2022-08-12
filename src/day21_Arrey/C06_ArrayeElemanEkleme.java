package day21_Arrey;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {
    public static void main(String[] args) {
        // C05 deki method'u kullanarak array'e eleman ekleyelim
        String [] takimListesi={"Suleyman", "Osman"};
        String eklenecekIsim="Talha";
        C05_ArrayeElemanEkleme C05_ArrayeElementEkleme = new C05_ArrayeElemanEkleme();
        takimListesi= C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);
        System.out.println(Arrays.toString(takimListesi));
    }
}
