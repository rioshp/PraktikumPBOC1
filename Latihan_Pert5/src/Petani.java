/* Nama File    : Petani.Java 
 * Deskripsi    : berisi atribut dan method dalam class Petani
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Petani extends Manusia implements Pajak {
    
    /*Atribut */

    private String asal_kota;
    private static int counterPetani = 0;


    /*Method */
    /*Konstruktor */
    public Petani() {
        counterPetani++;
    }
    public Petani(String nama, LocalDate tmk, String alamat, double pendapatan, String asal_kota) {
        super(nama,tmk,alamat,pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    /*Selektor */
    public String getAsalKota() {
        return this.asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    /*Mutator */
    public void setAsalKota(String asal_kota) {
         this.asal_kota = asal_kota;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 0;
    }

    public double hitungPajak() {
        return 0;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal Kota           : " + this.asal_kota);
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja() + " tahun") ;
        System.out.println("Pajak               : " + this.hitungPajak()) ;
    }
}