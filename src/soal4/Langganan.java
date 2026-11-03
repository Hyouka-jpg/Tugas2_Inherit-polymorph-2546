package soal4;

/**
 * Subclass Langganan (Inheritance dari ProdukDigital).
 * Menghitung harga akhir berdasarkan durasi bulan.
 */
public class Langganan extends ProdukDigital {
    private int durasiBulan;

    public Langganan(String sku, String nama, double hargaBulanan, double ukuranMB, int durasiBulan) {
        super(sku, nama, hargaBulanan, ukuranMB);
        this.durasiBulan = durasiBulan;
    }

    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar() * durasiBulan;
    }

    @Override
    public String deskripsi() {
        return String.format("[Langganan] %s - Durasi: %d Bulan", getNama(), durasiBulan);
    }
}