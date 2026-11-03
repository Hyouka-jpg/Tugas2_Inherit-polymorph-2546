package soal4;

/**
 * Subclass ProdukDigital (Inheritance dari Produk).
 * Menambahkan ukuran file (MB) dan tanpa ongkir.
 */
public class ProdukDigital extends Produk {
    private double ukuranMB;

    public ProdukDigital(String sku, String nama, double hargaDasar, double ukuranMB) {
        super(sku, nama, hargaDasar);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public double hitungHargaAkhir() {
        return getHargaDasar();
    }

    @Override
    public String deskripsi() {
        return String.format("[Digital] %s - Size: %.1f MB", getNama(), ukuranMB);
    }
}