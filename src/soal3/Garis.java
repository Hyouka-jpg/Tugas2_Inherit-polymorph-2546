package soal3;

/**
 * Representasi Garis yang terdiri dari dua objek Titik (Komposisi).
 * Menerapkan Defensive Copying untuk menjaga enkapsulasi.
 */
public class Garis {
    private Titik tAwal;
    private Titik tAkhir;

    /**
     * Constructor dengan Defensive Copying dari objek Titik yang diberikan.
     */
    public Garis(Titik tAwal, Titik tAkhir) {
        if (tAwal == null || tAkhir == null) {
            throw new IllegalArgumentException("Titik awal dan akhir tidak boleh null.");
        }
        // Defensive Copy: Buat instance Titik baru agar tidak berbagi referensi memori dari luar
        this.tAwal = new Titik(tAwal.getX(), tAwal.getY());
        this.tAkhir = new Titik(tAkhir.getX(), tAkhir.getY());
    }

    /**
     * Constructor overloading berbasis nilai koordinat langsung.
     */
    public Garis(double x1, double y1, double x2, double y2) {
        this.tAwal = new Titik(x1, y1);
        this.tAkhir = new Titik(x2, y2);
    }

    /**
     * Getter dengan Defensive Copying.
     */
    public Titik getTAwal() {
        return new Titik(tAwal.getX(), tAwal.getY());
    }

    public Titik getTAkhir() {
        return new Titik(tAkhir.getX(), tAkhir.getY());
    }

    /**
     * Menghitung panjang garis menggunakan rumus jarak Euclidean.
     */
    public double panjang() {
        double dx = tAkhir.getX() - tAwal.getX();
        double dy = tAkhir.getY() - tAwal.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return tAwal.toString() + "-" + tAkhir.toString();
    }
}