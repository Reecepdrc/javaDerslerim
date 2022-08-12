package day15_OverLoading;

import java.util.Scanner;

public class adeneme {
    public static void main(String[] args) {
        String input="recep darici";
        tekrarsiz (input);
}

    private static void tekrarsiz(String input) {
        String benzersizInput="";
        String islenecekKelime=input.replaceAll("\\W","");
        System.out.println(input.substring(0,1));
        benzersizInput+=islenecekKelime.substring(0,1);
        for (int i = 1; i <islenecekKelime.length()-1;  i++) {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1)));
            System.out.print(", "+islenecekKelime.substring(i,i+1));
            benzersizInput+=islenecekKelime.substring(i,i+1);

        }
        System.out.println("");
        System.out.println("input:"+input);
        System.out.println("benzersiz input:"+benzersizInput);
    }

}