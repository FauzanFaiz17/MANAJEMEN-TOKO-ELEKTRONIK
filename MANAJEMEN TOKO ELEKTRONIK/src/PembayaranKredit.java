// Interface untuk kontrak antarmuka pembayaran
interface Pembayaran {
    void prosesPembayaran();
}

// Kelas PembayaranKredit yang mengimplementasikan antarmuka Pembayaran
class PembayaranKredit implements Pembayaran {
    private String nomorKartu;
    private String namaPemilikKartu;
    private int bulanCicilan;
    private double totalPembayaran;

    // Konstruktor
    public PembayaranKredit(String nomorKartu, String namaPemilikKartu, int bulanCicilan, double totalPembayaran) {
        this.nomorKartu = nomorKartu;
        this.namaPemilikKartu = namaPemilikKartu;
        this.bulanCicilan = bulanCicilan;
        this.totalPembayaran = totalPembayaran;
    }

    // Getter dan setter
    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    public String getNamaPemilikKartu() {
        return namaPemilikKartu;
    }

    public void setNamaPemilikKartu(String namaPemilikKartu) {
        this.namaPemilikKartu = namaPemilikKartu;
    }

    public int getBulanCicilan() {
        return bulanCicilan;
    }

    public void setBulanCicilan(int bulanCicilan) {
        this.bulanCicilan = bulanCicilan;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    // Implementasi metode dari antarmuka Pembayaran
    @Override
    public void prosesPembayaran() {
        double cicilanPerBulan = totalPembayaran / bulanCicilan;
        System.out.println("Proses pembayaran kredit untuk " + bulanCicilan + " bulan.");
        System.out.println("Nomor Kartu: " + nomorKartu);
        System.out.println("Nama Pemilik Kartu: " + namaPemilikKartu);
        System.out.println("Total Pembayaran: " + totalPembayaran);
        System.out.println("Cicilan per Bulan: " + cicilanPerBulan);
    }
}
