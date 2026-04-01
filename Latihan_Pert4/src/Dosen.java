/* Nama File    : Dosen.Java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

import java.time.LocalDate;

public abstract class Dosen extends Pegawai {
    /***************ATRIBUT***************/
    private String fakultas;

    /***************METHOD***************/
    // Konstruktor
    public Dosen() {
        super("", "", LocalDate.now(), LocalDate.now(), 0.0);
        this.fakultas = "";
    }
    
    public Dosen(String nip, String nama, LocalDate tgl_lahir, LocalDate tmt, double gaji, String fakultas) {
        super(nip, nama, tgl_lahir, tmt, gaji);
        this.fakultas = fakultas;
    }

    // Selektor
    public String getFakultas() {
        return fakultas;
    }

    // Mutator
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // Method lain
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fakultas        : " + getFakultas());
    }
}
