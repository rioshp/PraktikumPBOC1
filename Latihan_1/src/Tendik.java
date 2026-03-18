/* Nama File    : Tendik.Java 
 * Deskripsi    : berisi atribut dan method dalam class Tendik
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public class Tendik extends Pegawai {
    /***************ATRIBUT***************/
    private String bidang;
    private int bup;

    /***************METHOD***************/
    // Konstruktor
    public Tendik() {
        super();
        this.bidang = "";
        this.bup = 55;
    }
    
    public Tendik(String nip, String nama, LocalDate tgl_lahir, LocalDate tmt, double gaji, String bidang) {
        super(nip, nama, tgl_lahir, tmt, gaji);
        this.bidang = bidang;
        this.bup = 55;
    }

    // Selektor
    public String getBidang() {
        return bidang;
    }

    public int getBup() {
        return bup;
    }

    // Mutator
    public void setBidang(String bidang) {
        this.bidang = bidang;
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
        return 0.01 * hitungMasaKerja().getYears() * getGaji();
    }

    @Override
    public void printInfo() {
        double tunjangan = hitungTunjangan();
        System.out.println("\n=== DATA TENAGA KEPENDIDIKAN ===");
        super.printInfo();
        System.out.println("Bidang          : " + getBidang());
        System.out.println("Batas Pensiun   : " + getBup() + " Tahun");
        System.out.println("Tanggal Pensiun : " + hitungTglPensiun());
        System.out.println("Tunjangan       : " + tunjangan);
        System.out.println("Total Gaji      : " + (getGaji() + tunjangan));
        System.out.println("================================");
    }
}