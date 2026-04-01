/* Nama File    : Pengusaha.Java 
 * Deskripsi    : berisi atribut dan method dalam class Pengusaha
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pengusaha  extends Manusia implements Pajak{
    /*Atribut */

    private String npwp;
    private static int counterPengusaha = 0;


    /*Method */
    /*Konstruktor */
    public Pengusaha() {
        counterPengusaha++;
    }
    public Pengusaha(String nama, LocalDate tmk, String alamat, double pendapatan, String npwp) {
        super(nama,tmk,alamat,pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    /*Selektor */
    public String getNpwp() {
        return this.npwp;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    /*Mutator */
    public void setNpwp(String npwp) {
         this.npwp = npwp;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 7;
    }

    public double hitungPajak() {
        return 0.15 * this.getPendapatan();
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("npwp                : " + this.npwp);
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja() + " tahun") ;
        System.out.println("Pajak               : " + this.hitungPajak()) ;
    }

    
}