# Tugas 2 - Sistem Inventaris & Transaksi OOP (Inheritance & Polymorphism)

## Judul & Identitas
- **Nama Tugas**: Tugas 2 Praktikum Pemrograman Berorientasi Objek
- **Nama**: Ahmad Damanhuri
- **NPM**: 250810701100046
- **Kelas**: Praktikum PBO A
- **Repository**: [https://github.com/Hyouka-jpg/Tugas2_Inherit-polymorph-2546](https://github.com/Hyouka-jpg/Tugas2_Inherit-polymorph-2546)

## Deskripsi Singkat
Aplikasi berbasis Java console yang menerapkan konsep dasar hingga lanjut dari Object-Oriented Programming (OOP) seperti Inheritance, Composition, dan Polimorfisme. Program ini terbagi ke dalam 4 modul utama untuk mengelola hierarki perangkat elektronik, analisis konsep polimorfisme, pemodelan objek geometri (Titik dan Garis), serta mini project sistem keranjang belanja toko digital.

## Fitur Utama
- **Pengelolaan Perangkat Elektronik (Soal 1)**: Perhitungan garansi otomatis, kalkulasi pajak 10%, dan skema diskon promo pada laptop gaming dan perangkat seluler.
- **Analisis & Keamanan Tipe Objek (Soal 2)**: Demonstrasi *constructor chaining*, *late binding*, serta pengujian *downcasting* aman menggunakan `instanceof` untuk mencegah `ClassCastException`.
- **Pemodelan Geometri Berkelanjutan (Soal 3)**: Perhitungan panjang garis dengan penerapan *Defensive Copying* pada relasi Komposisi untuk menjaga enkapsulasi data dari perubahan luar (*side-effect aliasing*).
- **Keranjang Belanja Toko Digital (Soal 4)**: Penambahan produk fisik, digital, dan langganan secara dinamis dengan pemrosesan struk berbasis Polimorfisme serta validasi duplikasi data produk.

## Konsep OOP yang Diterapkan

| Konsep OOP | Lokasi Penerapan | Alasan Penerapan |
| :--- | :--- | :--- |
| **Inheritance** | Class `Laptop extends Perangkat`, `Langganan extends ProdukDigital` | Memungkinkan subclass mewarisi atribut dan perilaku umum dari superclass untuk menghindari duplikasi kode. |
| **Protected Access** | Atribut `protected double harga` pada `Perangkat` | Memberikan akses langsung bagi subclass (seperti `Laptop`) untuk membaca/mengolah nilai tanpa membuka akses secara `public`. |
| **Composition (Has-A)** | Class `Garis` memuat objek `Titik`, `Keranjang` memuat `ArrayList<Produk>` | Memodelkan hubungan kepemilikan di mana siklus hidup objek bagian terikat dan dikelola oleh objek utama. |
| **Polimorfisme** | Method `hitungHargaAkhir()` dan `cetakStruk()` | Eksekusi method secara dinamis berdasarkan tipe riil objek saat *runtime* tanpa perlu pengecekan tipe manual. |
| **Safe Downcasting** | Method `Keranjang.hitungPerJenis()` | Mengelompokkan dan menghitung jumlah produk secara aman menggunakan pengecekan `instanceof` sebelum *downcasting*. |
| **Defensive Copying** | Constructor dan Getter pada Class `Garis` | Menginstansiasi ulang objek `Titik` baru agar perubahan variabel dari luar tidak merusak status (*state*) internal objek. |

## Struktur Proyek

```text
Tugas2_Inherit-polymorph-2546/
├── 📁 src/
│   ├── 📁 soal1/
│   │   ├── ☕ Perangkat.java
│   │   ├── ☕ Laptop.java
│   │   ├── ☕ Ponsel.java
│   │   ├── ☕ LaptopGaming.java
│   │   └── ☕ TesSoal1.java
│   ├── 📁 soal2/
│   │   ├── ☕ Hewan.java
│   │   ├── ☕ Kucing.java
│   │   ├── ☕ A.java
│   │   ├── ☕ B.java
│   │   ├── ☕ Lingkaran.java
│   │   ├── ☕ Titik.java
│   │   └── ☕ TesSoal2.java
│   ├── 📁 soal3/
│   │   ├── ☕ Titik.java
│   │   ├── ☕ Garis.java
│   │   └── ☕ TesSoal3.java
│   └── 📁 soal4/
│       ├── ☕ Produk.java
│       ├── ☕ ProdukFisik.java
│       ├── ☕ ProdukDigital.java
│       ├── ☕ Langganan.java
│       ├── ☕ Keranjang.java
│       └── ☕ TesSoal4.java
├── ⚙️ .gitignore
└── 📝 README.md
```

### Pertanyaan Tambahan Soal 1 (Eksperimen Private Access)

**Pesan Error yang Muncul:**
```text
src/soal1/Laptop.java:39: error: harga has private access in Perangkat
        return harga - (harga * (diskonPersen / 100.0));
               ^
src/soal1/Laptop.java:39: error: harga has private access in Perangkat
        return harga - (harga * (diskonPersen / 100.0));
                        ^
2 errors
```
- **Penjelasan**: Error kompilasi tersebut terjadi karena atribut berakses private diisolasikan secara ketat dan hanya dapat diakses langsung dari dalam kelas tempat ia dideklarasikan (Perangkat). Subclass seperti Laptop tidak memiliki hak akses langsung ke atribut private milik superclass-nya. Agar subclass dapat membaca/mengakses variabel atribut secara langsung tanpa harus lewat getter, penentu akses (access modifier) harus diubah menjadi protected.

### Jawaban Soal 2

**Output Program Bagian A:**
   ```text
   Hewan dibuat: Tom
   Kucing dibuat
   Tom makan
   meong
   meong
   Tom memanjat
   Hewan dibuat: Generik
   h2 bukan merupakan instance dari Kucing (Downcasting terhindar).
   ```
   - **Penjelasan**:
   Pada Bagian A, pemanggilan h.panjat() menghasilkan compile-time error karena tipe statis variabel h adalah Hewan yang tidak memiliki method panjat(), sementara downcasting langsung seperti (Kucing) h2 pada objek superclass murni dapat menyebabkan ClassCastException sehingga harus dicegah menggunakan pengecekan if (h2 instanceof Kucing). Panggilan h.makan() tetap mengeksekusi suara() milik Kucing akibat dynamic binding berdasar tipe dinamis objeknya. Selanjutnya pada Bagian B, init B mencetak nilai 0 karena method init() yang di-override oleh kelas B dipanggil saat konstruktor superclass A berjalan sebelum inisialisasi atribut nilai = 5 di kelas B selesai. Terakhir pada Bagian C, l3.luas() menghasilkan 0.0 karena tipe dinamisnya adalah Titik, yang mana secara desain OOP relasi "Titik adalah sebuah Lingkaran" ini kurang tepat dan melanggar Liskov Substitution Principle sebab titik tidak memiliki dimensi area maupun keliling.