package day04_dataCasting;

public class C05_Pre_PostIncrament {
    public static void main(String[] args) {

        int sayi1=10;

        int sayi2=sayi1+1;


        sayi2 +=5;
        System.out.println("sayi2:"+sayi2);


        int sayi3=sayi2++;
        System.out.println("sayi3:"+sayi3);


        int sayi4=--sayi1;
        System.out.println("sayi4 = " + sayi4);

    }
}
