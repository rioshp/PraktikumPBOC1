/* Nama File    : Pegawai.Java 
 * Deskripsi    : berisi atribut dan method dalam class Pegawai
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;
import java.time.Period;

public abstract class Pegawai {
    /***************ATRIBUT***************/
    private String nip;
    private String nama;
    private LocalDate tgl_lahir;
    private LocalDate tmt;
    private double gaji;

    /***************METHOD***************/
    // Konstruktor
    public Pegawai() {
        this.nip = "";
        this.nama = "";
        this.tgl_lahir = LocalDate.now();
        this.tmt = LocalDate.now();
        this.gaji = 0.0;
    }
    
    public Pegawai(String nip, String nama, LocalDate tgl_lahir, LocalDate tmt, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.tmt = tmt;
        this.gaji = gaji;
    }

    // Selektor
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public LocalDate getTglLahir() {
        return tgl_lahir;
    }

    public LocalDate getTmt() {
        return tmt;
    }

    public double getGaji() {
        return gaji;
    }

    // Mutator
    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTglLahir(LocalDate tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public void setTmt(LocalDate tmt) {
        this.tmt = tmt;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Method lain
    public Period hitungMasaKerja() {
        return Period.between(this.tmt, LocalDate.now());
    }

    public abstract double hitungTunjangan();

    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        System.out.println("NIP             : " + getNip());
        System.out.println("Nama            : " + getNama());
        System.out.println("Tanggal Lahir   : " + getTglLahir());
        System.out.println("TMT Bekerja     : " + getTmt());
        System.out.println("Masa Kerja      : " + masaKerja.getYears() + " Tahun " + masaKerja.getMonths() + " Bulan");
        System.out.println("Gaji Pokok      : " + getGaji());
    }
}