package day16_ForLop;

public class C01_ForLOOP {
    public static void main(String[] args) {
        // verilen bir pozitif tam sayinin
        // pozitif tam bolenlerini yazdiralim
        int input=100;

        for (int i = 100; i <=input ; i--) {

            if (input%13==0){

                System.out.print(i + " ");
            }
        }
    }
}
