package soal1;

/**
 * Subclass yang merepresentasikan perangkat Laptop.
 */
public class Laptop extends Perangkat {
    private int ramGb;
    private double ukuranLayarInci;

    /**
     * Constructor untuk menginisialisasi objek Laptop.
     *
     * @param merek           nama merek
     * @param harga           harga laptop
     * @param garansiBulan    durasi garansi dalam bulan
     * @param ramGb           kapasitas RAM (GB)
     * @param ukuranLayarInci ukuran layar (inci)
     */
    public Laptop(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci) {
        super(merek, harga, garansiBulan);
        if (ramGb <= 0 || ukuranLayarInci <= 0) {
            throw new IllegalArgumentException("RAM dan ukuran layar harus bernilai positif.");
        }
        this.ramGb = ramGb;
        this.ukuranLayarInci = ukuranLayarInci;
    }

    /**
     * Menghitung harga promo setelah mendapat diskon.
     *
     * @param diskonPersen persentase diskon
     * @return harga setelah diskon
     * @throws IllegalArgumentException jika diskon di luar rentang 0-100
     */
    public double hitungHargaPromo(double diskonPersen) {
        if (diskonPersen < 0 || diskonPersen > 100) {
            throw new IllegalArgumentException("Persentase diskon harus di antara 0 dan 100.");
        }
        return harga - (harga * (diskonPersen / 100.0));
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | RAM " + ramGb + " GB | layar " + ukuranLayarInci + " inci";
    }
}