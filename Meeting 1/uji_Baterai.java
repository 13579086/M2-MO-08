public class uji_Baterai {
    public static void main(String[] args) {
        ujiBaterai(12);
        System.out.println("--- Ganti Perangkat ---");
        ujiBaterai(7);
    }

    public static void ujiBaterai(int kapasitasAwal) {
        int baterai = kapasitasAwal;

        while (baterai > 0) {
            baterai = baterai - 1;

            if (baterai == 8) {
                continue;
            } else if (baterai == 3) {
                System.out.println("CRITICAL ERROR: Baterai bocor! Sistem dimatikan paksa.");
                break;
            } else if (baterai == 4 || baterai == 5) {
                System.out.println("AWAS: Lowbat! Segera cas. Sisa: " + baterai + "%");
            } else {
                System.out.println("Kondisi aman. Sisa baterai: " + baterai + "%");
            }
        }
    }
}