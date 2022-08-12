package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {
        int[][] sayilar = {{1, 2, 3, 4,}, {3, 4}};
        System.out.println(sayilar[0]);
        System.out.println(Arrays.toString(sayilar[0]));
        System.out.println(sayilar[0][1]);
        System.out.println(sayilar[1][0]);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.deepToString(sayilar));

    }
}