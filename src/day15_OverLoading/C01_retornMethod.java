package day15_OverLoading;

public class C01_retornMethod {
    public static void main(String[] args) {
        // verilen iki sayiyi carpip
        // sonucu bize donduren bir method olusturun
        int sayi1=10;
        int sayi2=5;
        int sonuc=carpGetir(sayi1,sayi2);
        System.out.println(  "SONUC:"+sonuc);
    }
    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;;
        return sonuc;

    }
}