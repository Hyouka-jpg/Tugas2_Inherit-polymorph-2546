package soal4;

/**
 * Abstract Superclass Produk sebagai dasar seluruh item toko.
 */
public abstract class Produk {
    private String sku;
    private String nama;
    private double hargaDasar;

    public Produk(String sku, String nama, double hargaDasar) {
        this.sku = sku;
        this.nama = nama;
        this.hargaDasar = hargaDasar;
    }

    public String getSku() {
        return sku;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Abstract methods yang wajib di-override oleh subclass (Polimorfisme)
    public abstract double hitungHargaAkhir();
    public abstract String deskripsi();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produk produk = (Produk) obj;
        return sku.equals(produk.sku);
    }
}