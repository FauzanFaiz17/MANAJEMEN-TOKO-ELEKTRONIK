// Kelas Smartphone yang merupakan subkelas dari Elektronik
class Smartphone extends Elektronik {
    private String sistemOperasi;
    private int kapasitasRAM;

    // Konstruktor
    public Smartphone(String nama, double harga, int stok, String merek, String sistemOperasi, int kapasitasRAM) {
        super(nama, harga, stok, merek);
        this.sistemOperasi = sistemOperasi;
        this.kapasitasRAM = kapasitasRAM;
    }

    // Getter dan setter untuk atribut khusus Smartphone
    public String getSistemOperasi() {
        return sistemOperasi;
    }

    public void setSistemOperasi(String sistemOperasi) {
        this.sistemOperasi = sistemOperasi;
    }

    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }

    // Implementasi metode abstrak dari kelas Produk
    @Override
    public void tampilkanInfoProduk() {
        System.out.println("Spesifikasi Smartphone");
        System.out.println("Nama: " + getNama());
        System.out.println("Harga: " + getHarga());
        System.out.println("Stok: " + getStok());
        System.out.println("Merek: " + getMerek());
        System.out.println("Sistem Operasi: " + sistemOperasi);
        System.out.println("Kapasitas RAM: " + kapasitasRAM + " GB");
    }

    // Metode khusus untuk Smartphone
    public void lakukanPanggilan() {
        System.out.println("Melakukan panggilan telepon.");
    }
}
