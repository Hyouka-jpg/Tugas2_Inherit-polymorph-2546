package soal1;

/**
 * Superclass yang merepresentasikan perangkat elektronik umum.
 */
public class Perangkat {
    private static final double TARIF_PAJAK = 0.10;

    private String merek;
    protected double harga;
    private int garansiBulan;

    /**
     * Constructor untuk menginisialisasi objek Perangkat.
     *
     * @param merek        nama merek perangkat
     * @param harga        harga perangkat
     * @param garansiBulan durasi garansi dalam bulan
     * @throws IllegalArgumentException jika harga negatif atau merek kosong
     */
    public Perangkat(String merek, double harga, int garansiBulan) {
        if (merek == null || merek.trim().isEmpty()) {
            throw new IllegalArgumentException("Merek tidak boleh kosong.");
        }
        if (harga < 0) {
            throw new IllegalArgumentException("Harga tidak boleh negatif.");
        }
        if (garansiBulan < 0) {
            throw new IllegalArgumentException("Garansi bulan tidak boleh negatif.");
        }
        this.merek = merek;
        this.harga = harga;
        this.garansiBulan = garansiBulan;
    }

    public String getMerek() {
        return merek;
    }

    public int getGaransiBulan() {
        return garansiBulan;
    }

    /**
     * Menghitung pajak berdasarkan tarif standar 10%.
     *
     * @return jumlah pajak perangkat
     */
    public double hitungPajak() {
        return harga * TARIF_PAJAK;
    }

    /**
     * Mengembalikan informasi singkat perangkat.
     *
     * @return string informasi singkat
     */
    public String infoSingkat() {
        return merek + " garansi " + garansiBulan + " bulan";
    }
}