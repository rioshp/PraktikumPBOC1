/* Nama File    : DosenTamu.Java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTamu
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */


import java.time.LocalDate;

public class DosenTamu extends Dosen {
    /***************ATRIBUT***************/
    private String nidk;
    private LocalDate akhirKontrak;

    /***************METHOD***************/
    // Konstruktor
    public DosenTamu() {
        super("", "", LocalDate.now(), LocalDate.now(), 0.0, "");
        this.nidk = "";
        this.akhirKontrak = LocalDate.now();
    }
    
    public DosenTamu(String nip, String nama, LocalDate tgl_lahir, LocalDate tmt, double gaji, String fakultas, String nidk, LocalDate akhirKontrak) {
        super(nip, nama, tgl_lahir, tmt, gaji, fakultas);
        this.nidk = nidk;
        this.akhirKontrak = akhirKontrak;
    }

    // Selektor
    public String getNidk() {
        return nidk;
    }

    public LocalDate getAkhirKontrak() {
        return akhirKontrak;
    }

    // Mutator
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setAkhirKontrak(LocalDate akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    // Method lain
    @Override
    public double hitungTunjangan() {
        return 0.025 * getGaji();
    }

    @Override
    public void printInfo() {
        double tunjangan = hitungTunjangan();
        System.out.println("\n=== DATA DOSEN TAMU ===");
        System.out.println("NIDK            : " + getNidk());
        super.printInfo();
        System.out.println("Akhir Kontrak   : " + getAkhirKontrak());
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (getGaji() + tunjangan));
        System.out.println("==========================");
    }
}