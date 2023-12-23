import java.util.ArrayList;
import java.util.List;

// Kelas TokoElektronik (contoh implementasi)
class TokoElektronik {
    private List<Produk> stokProduk;

    // Konstruktor
    public TokoElektronik() {
        stokProduk = new ArrayList<>();
    }

    // Metode untuk menambahkan produk ke dalam stok toko
    public void tambahProduk() {
        // Simulasi input data dari pengguna (bisa menggunakan JavaFX TextInputDialog)
        String nama = "Smartphone ABC";
        double harga = 1500.0;
        int stok = 10;
        String merek = "ABC";
        String sistemOperasi = "Android";
        int kapasitasRAM = 4;

        // Buat objek Smartphone (bisa menggunakan kelas lain seperti Laptop)
        Smartphone smartphoneBaru = new Smartphone(nama, harga, stok, merek, sistemOperasi, kapasitasRAM);

        // Tambahkan produk ke dalam stok
        stokProduk.add(smartphoneBaru);

        System.out.println("Produk berhasil ditambahkan ke dalam stok.");
    }

    // Metode untuk menampilkan stok produk
    public void lihatStok() {
        System.out.println("Stok Produk:");
        for (Produk produk : stokProduk) {
            produk.tampilkanInfoProduk();
            System.out.println("-----------------------------");
        }
    }

    // Metode untuk memproses pembelian (contoh sederhana)
    public void prosesPembelian() {
        // Simulasi pembelian produk (bisa menggunakan JavaFX ChoiceBox)
        if (!stokProduk.isEmpty()) {
            Produk produkDibeli = stokProduk.get(0);
            System.out.println("Pembelian berhasil: " + produkDibeli.getNama());
            stokProduk.remove(0);
        } else {
            System.out.println("Stok produk kosong.");
        }
    }
}
