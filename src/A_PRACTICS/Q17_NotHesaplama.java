package A_PRACTICS;

import java.util.Scanner;

public class Q17_NotHesaplama {
    public static void main(String[] args) {
        /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
        Scanner scan=new Scanner(System.in);
        int vize1;
        int vize2;
        int finalnot;
        System.out.println("birinci vize :");
        vize1=scan.nextInt();
        System.out.println("ikinci vize :");
        vize2=scan.nextInt();
        System.out.println("final notu:");
        finalnot=scan.nextInt();

        double sonuc= ((vize1+vize2)/2)*0.3 + finalnot*0.7;
        System.out.println("sonuc="+sonuc);
    }
}
