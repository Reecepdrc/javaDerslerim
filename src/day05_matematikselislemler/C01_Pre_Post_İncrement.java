package day05_matematikselislemler;

public class C01_Pre_Post_İncrement {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;


        sayi2 +=5;


        int sayi3=sayi2++;
        System.out.println("sayi3 = " + sayi3);


        int sayi4=++sayi1;
        System.out.println("sayi4:"+sayi4);
        System.out.println("sayi1:"+sayi1);


    }


}
