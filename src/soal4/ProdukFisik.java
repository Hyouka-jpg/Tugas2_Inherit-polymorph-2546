package soal4;

/**
 * Subclass ProdukFisik (Inheritance dari Produk).
 * Menambahkan komponen berat (kg) dan biaya kirim Rp 10.000 / kg.
 */
public class ProdukFisik extends Produk {
    private double beratKg;

    public ProdukFisik(String sku, String nama, double hargaDasar, double beratKg) {
        super(sku, nama, hargaDasar);
        this.beratKg = beratKg;
    }

    @Override
    public double hitungHargaAkhir() {
        // Biaya kirim Rp 10.000 per kg
        return getHargaDasar() + (beratKg * 10000);
    }

    @Override
    public String deskripsi() {
        return String.format("[Fisik] %s - Berat: %.1f kg", getNama(), beratKg);
    }
}