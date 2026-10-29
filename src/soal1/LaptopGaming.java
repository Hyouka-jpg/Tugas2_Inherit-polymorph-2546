package soal1;

/**
 * Subclass spesifik dari Laptop untuk kategori Laptop Gaming.
 */
public class LaptopGaming extends Laptop {
    private static final int TAMBAHAN_GARANSI_BULAN = 6;
    private String kartuGrafis;

    /**
     * Constructor LaptopGaming. Menambahkan garansi 6 bulan secara otomatis.
     *
     * @param merek           nama merek
     * @param harga           harga laptop
     * @param garansiBulan    garansi dasar
     * @param ramGb           kapasitas RAM
     * @param ukuranLayarInci ukuran layar
     * @param kartuGrafis     model GPU
     */
    public LaptopGaming(String merek, double harga, int garansiBulan, int ramGb, double ukuranLayarInci, String kartuGrafis) {
        super(merek, harga, garansiBulan + TAMBAHAN_GARANSI_BULAN, ramGb, ukuranLayarInci);
        if (kartuGrafis == null || kartuGrafis.trim().isEmpty()) {
            throw new IllegalArgumentException("Kartu grafis tidak boleh kosong.");
        }
        this.kartuGrafis = kartuGrafis;
    }

    @Override
    public String infoSingkat() {
        return super.infoSingkat() + " | GPU " + kartuGrafis;
    }
}