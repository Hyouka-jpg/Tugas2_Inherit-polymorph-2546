package soal4;

/**
 * Main class pengujian untuk Soal 4.
 */
public class TesSoal4 {
    public static void main(String[] args) {
        Keranjang keranjang = new Keranjang();

        System.out.println("=== MENAMBAHKAN PRODUK KE KERANJANG ===");
        Produk p1 = new ProdukFisik("P001", "Mouse Gaming Logitech", 250000, 0.5);
        Produk p2 = new ProdukDigital("P002", "E-Book Java OOP Complete", 120000, 15.5);
        Produk p3 = new Langganan("P003", "Aplikasi Cloud Storage", 50000, 0.0, 6);
        Produk p4 = new ProdukFisik("P001", "Mouse Gaming Logitech Duplikat", 250000, 0.5); // SKU sama

        keranjang.tambahProduk(p1);
        keranjang.tambahProduk(p2);
        keranjang.tambahProduk(p3);
        keranjang.tambahProduk(p4); // Harus ditolak karena duplikat SKU

        // Cetak Struk Belanja
        keranjang.cetakStruk();

        // Hitung Jumlah per Jenis Produk
        keranjang.hitungPerJenis();
    }
}