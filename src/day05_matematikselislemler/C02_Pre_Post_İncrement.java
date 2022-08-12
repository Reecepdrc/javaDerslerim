package day05_matematikselislemler;

public class C02_Pre_Post_İncrement {
    public static void main(String[] args) {

        int sayi=10;
        System.out.println("preincrement:"+ ++sayi);

        System.out.println("post-increment:"+ sayi++);

        System.out.println("post-increment'den somra:"+ sayi);
    }
}
