/* Nama File    : Manusia.Java 
 * Deskripsi    : berisi atribut dan method dalam class Manusia
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

import java.time.LocalDate;

public abstract class Manusia {
    
    /*Atribut */
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

     /*Method */
    /*Konstruktor */
    public Manusia() {
        counterMns++;
        
    }
    public Manusia(String nama, LocalDate tmk, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_mulai_kerja = tmk;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    /*Selektor */
    public String getNama() {
        return this.nama;
    }
    public LocalDate getTglMulaiKerja() {
        return this.tgl_mulai_kerja;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public double getPendapatan() {
        return this.pendapatan;
    }

       public static int getCounterMns() {
        return counterMns;
    }

    /*Mutator */
     public void setNama(String nama) {
         this.nama = nama;
    }
    public void setTglMulaiKerja(LocalDate tmk) {
         this.tgl_mulai_kerja = tmk;
    }
    public void setAlamat(String alamat) {
         this.alamat = alamat;
    }
    public void setPendapatan(double pendapatan) {
         this.pendapatan = pendapatan;
    }

    public void cetakInfo() {
        System.out.println("Nama                : " + this.getNama());
        System.out.println("Tanggal Mulai Kerja : " + this.getTglMulaiKerja());
        System.out.println("Alamat              : " + this.getAlamat());
        System.out.println("Pendapatan          : " + this.getPendapatan());
    }

    public abstract int hitungMasaKerja();

}
