package soal4;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Keranjang yang mengelola koleksi Produk (Komposisi).
 * Menerapkan Polimorfisme pada cetakStruk() dan Safe Downcasting pada hitungPerJenis().
 */
public class Keranjang {
    private List<Produk> daftarProduk;

    public Keranjang() {
        this.daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk p) {
        if (daftarProduk.contains(p)) {
            System.out.println("Gagal menambahkan! Produk dengan SKU " + p.getSku() + " sudah ada di keranjang.");
            return;
        }
        daftarProduk.add(p);
        System.out.println("Berhasil menambahkan: " + p.getNama());
    }

    public double hitungTotalSemua() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.hitungHargaAkhir(); // Dynamic Binding / Polimorfisme
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("\n========= STRUK BELANJA =========");
        for (Produk p : daftarProduk) {
            System.out.printf("%-35s Rp %,10.2f%n", p.deskripsi(), p.hitungHargaAkhir());
        }
        System.out.println("---------------------------------");
        System.out.printf("TOTAL BAYAR                        Rp %,10.2f%n", hitungTotalSemua());
        System.out.println("=================================");
    }

    public void hitungPerJenis() {
        int countFisik = 0;
        int countDigital = 0;
        int countLangganan = 0;

        for (Produk p : daftarProduk) {
            // Safe Downcasting menggunakan instanceof (Langganan diperiksa lebih dulu karena subclass ProdukDigital)
            if (p instanceof Langganan) {
                countLangganan++;
            } else if (p instanceof ProdukDigital) {
                countDigital++;
            } else if (p instanceof ProdukFisik) {
                countFisik++;
            }
        }

        System.out.println("\n--- Ringkasan Item per Jenis ---");
        System.out.println("Produk Fisik    : " + countFisik);
        System.out.println("Produk Digital  : " + countDigital);
        System.out.println("Item Langganan  : " + countLangganan);
    }
}