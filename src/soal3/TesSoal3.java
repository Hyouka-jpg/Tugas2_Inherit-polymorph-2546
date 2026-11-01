package soal3;

/**
 * Main class pengujian untuk Soal 3.
 */
public class TesSoal3 {
    public static void main(String[] args) {
        Titik t1 = new Titik(0, 0);
        Titik t2 = new Titik(3, 4);

        Garis g1 = new Garis(t1, t2);
        System.out.println("Garis g1: " + g1);
        System.out.printf("Panjang g1: %.2f%n", g1.panjang());

        // Pengujian Defensive Copying
        Titik t = new Titik(1, 1);
        Garis g2 = new Garis(t, new Titik(5, 5));
        
        System.out.println("\nSebelum t.setX(100): " + g2);
        t.setX(100); // Mencoba mengubah nilai titik dari luar
        System.out.println("Setelah t.setX(100): " + g2);
        
        System.out.printf("Panjang g2: %.4f%n", g2.panjang());
    }
}