package A_PRACTICS;

import java.time.LocalDate;
import java.time.Period;

public class YasHesapla {
    public static void main(String[] args) {

        LocalDate tarih1=LocalDate.of(1940,4,20);
        LocalDate bugun=LocalDate.now();
        Period period=Period.between(tarih1,bugun);
        System.out.println(period);
        System.out.println(period.getYears());

    }
}
