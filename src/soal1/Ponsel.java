package soal1;

/**
 * Subclass yang merepresentasikan perangkat Ponsel.
 */
public class Ponsel extends Perangkat {
    private int kapasitasGb;
    private int jumlahKamera;

    /**
     * Constructor untuk menginisialisasi objek Ponsel.
     *
     * @param merek        nama merek
     * @param harga        harga ponsel
     * @param garansiBulan durasi garansi
     * @param kapasitasGb  kapasitas memori (GB)
     * @param jumlahKamera jumlah kamera
     */
    public Ponsel(String merek, double harga, int garansiBulan, int kapasitasGb, int jumlahKamera) {
        super(merek, harga, garansiBulan);
        if (kapasitasGb <= 0 || jumlahKamera < 0) {
            throw new IllegalArgumentException("Kapasitas memori dan jumlah kamera tidak valid.");
        }
        this.kapasitasGb = kapasitasGb;
        this.jumlahKamera = jumlahKamera;
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | " + kapasitasGb + " GB | " + jumlahKamera + " kamera";
    }
}