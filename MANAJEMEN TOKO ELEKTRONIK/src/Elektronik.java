// Kelas Elektronik yang merupakan subkelas dari Produk
class Elektronik extends Produk {
    private String merek;

    // Konstruktor
    public Elektronik(String nama, double harga, int stok, String merek) {
        super(nama, harga, stok);
        this.merek = merek;
    }

    // Getter dan setter untuk atribut khusus Elektronik
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    // Metode untuk menampilkan informasi khusus Elektronik
    public void tampilkanInfoElektronik() {
        System.out.println("Merek: " + merek);
    }

    // Implementasi metode abstrak dari kelas Produk
    @Override
    public void tampilkanInfoProduk() {
        System.out.println("Informasi Elektronik");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Merek: " + merek);
    }

    // Metode khusus untuk Elektronik
    public void jalankan() {
        System.out.println("Elektronik dijalankan.");
    }
}
