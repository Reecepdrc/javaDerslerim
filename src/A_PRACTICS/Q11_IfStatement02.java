package A_PRACTICS;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        double note= scan.nextDouble();
        if (note<0 || note>100){
            System.out.println("Lutfen gecerli bir not giriniz".toUpperCase());
        }  else if(note<59) {
            System.out.println("Notunuz : F");
        } else if(note<69) {
            System.out.println("Notunuz D");
        } else if(note<79) {
            System.out.println("Notunuz : C");
        } else if (note<89){
            System.out.println("Notunuz : B");
        }else {
            System.out.println("Notunuz : A");
        }
    }
    /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */


}
