package soal2;

/**
 * Main class pengujian untuk Soal 2.
 */
public class TesSoal2 {
    public static void main(String[] args) {
        System.out.println("=== BAGIAN A ===");
        Hewan h = new Kucing("Tom"); // Upcasting
        h.makan();

        // Downcasting aman
        if (h instanceof Kucing) {
            Kucing k = (Kucing) h;
            k.suara();
            k.panjat();
        }

        // h.panjat(); // ERROR KOMPILASI: Variabel h bertipe statis Hewan (tidak punya method panjat)

        Hewan h2 = new Hewan("Generik");
        // Downcasting yang diproteksi dengan instanceof (mencegah ClassCastException)
        if (h2 instanceof Kucing) {
            Kucing k2 = (Kucing) h2;
            k2.suara();
        } else {
            System.out.println("h2 bukan merupakan instance dari Kucing (Downcasting terhindar).");
        }

        System.out.println("\n=== BAGIAN B ===");
        B b = new B();

        System.out.println("\n=== BAGIAN C ===");
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l3 = new Titik(); // Late binding

        System.out.println(l1.luas());
        System.out.println(l3.luas());

        Titik t = new Titik();
        System.out.println(t.luas());
    }
}