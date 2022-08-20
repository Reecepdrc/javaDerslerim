package A_PRACTICS;

public class D2_switchCase {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        String gun = "pazar";

        switch (gun) {
            case "Pazartesi":
            case "sali":
                System.out.println("java gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("Sgl dersi");
                break;
            case "Persembe":
            case "Cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("izin günü");


        }
    }
}
