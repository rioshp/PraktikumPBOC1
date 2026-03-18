/* Nama File    : DosenTetap.Java 
 * Deskripsi    : berisi atribut dan method dalam class DosenTetap
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class DosenTetap extends Dosen {
    /***************ATRIBUT***************/
    private String nidn;
    private int bup;

    /***************METHOD***************/
    // Konstruktor
    public DosenTetap() {
        super("", "", LocalDate.now(), LocalDate.now(), 0.0, "");
        this.nidn = "";
        this.bup = 65;
    }
    
    public DosenTetap(String nip, String nama, LocalDate tgl_lahir, LocalDate tmt, double gaji, String fakultas, String nidn) {
        super(nip, nama, tgl_lahir, tmt, gaji, fakultas);
        this.nidn = nidn;
        this.bup = 65;
    }

    // Selektor
    public String getNidn() {
        return nidn;
    }

    public int getBup() {
        return bup;
    }

    // Mutator
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setBup(int bup) {
        this.bup = bup;
    }

    // Method lain
    public LocalDate hitungTglPensiun() {
        return getTglLahir().plusYears(bup).plusMonths(1).withDayOfMonth(1);
    }

    @Override
    public double hitungTunjangan() {
        return 0.02 * hitungMasaKerja().getYears() * getGaji();
    }

    @Override
    public void printInfo() {
        double tunjangan = hitungTunjangan();
        System.out.println("\n=== DATA DOSEN TETAP ===");
        System.out.println("NIDN            : " + getNidn());
        super.printInfo();
        System.out.println("Batas Pensiun   : " + getBup() + " Tahun");
        System.out.println("Tanggal Pensiun : " + hitungTglPensiun());
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (getGaji() + tunjangan));
        System.out.println("==========================");
    }
}