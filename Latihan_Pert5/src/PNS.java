/* Nama File    : PNS.Java 
 * Deskripsi    : berisi atribut dan method dalam class PNS
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PNS extends Manusia implements Pajak {
   /*Atribut */

    private String nip;
    private static int counterPNS = 0;


    /*Method */
    /*Konstruktor */
    public PNS() {
        counterPNS++;
    }
    public PNS(String nama, LocalDate tmk, String alamat, double pendapatan, String nip) {
        super(nama,tmk,alamat,pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    /*Selektor */
    public String getNpwp() {
        return this.nip;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    /*Mutator */
    public void setNpwp(String nip) {
         this.nip = nip;
    }

    @Override
    public int hitungMasaKerja() {
        return (int) ChronoUnit.YEARS.between(tgl_mulai_kerja, LocalDate.now()) + 9;
    }

    public double hitungPajak() {
        return 0.10 * this.getPendapatan();
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("nip                 : " + this.nip);
        System.out.println("Masa Kerja          : " + this.hitungMasaKerja() + " tahun") ;
        System.out.println("Pajak               : " + this.hitungPajak()) ;
    }
}
