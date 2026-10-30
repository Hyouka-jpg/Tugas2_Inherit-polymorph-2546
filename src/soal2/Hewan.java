package soal2;

/**
 * Superclass Hewan untuk demo upcasting dan downcasting.
 */
public class Hewan {
    private String nama;

    public Hewan(String nama) {
        this.nama = nama;
        System.out.println("Hewan dibuat: " + nama);
    }

    public String getNama() {
        return nama;
    }

    public void makan() {
        System.out.println(nama + " makan");
        suara();
    }

    public void suara() {
        System.out.println("suara hewan umum");
    }
}
