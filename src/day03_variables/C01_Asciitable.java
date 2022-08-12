package day03_variables;

public class C01_Asciitable {
    public static void main(String[] args) {

        int sayi=10;
        char harf= 'a';
        String str="banan";
        char deger='1';
        System.out.println(sayi + harf);//107
        System.out.println(sayi*harf);//970
        System.out.println(str+harf);//banana
        System.out.println(harf+2);//99
        System.out.println(""+sayi+harf);//10a
        System.out.println(str+sayi+harf);//banan10a
        System.out.println(deger+harf);//146

    }
}
