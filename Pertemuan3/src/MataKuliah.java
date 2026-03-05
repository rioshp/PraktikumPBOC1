/* Nama File    : MataKuliah.Java 
 * Deskripsi    : berisi atribut dan method dalam class MataKuliah
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 05 Maret 2026
 */

public class MataKuliah {
    /***************ATRIBUT***************/
    private String IdMatkul;
    private String nama;
    private int sks;
    private static int counterMatkul;

    /***************METHOD***************/
    // Konstruktor
    public MataKuliah(){
        this.IdMatkul = "404";
        this.nama = "unknown";
        this.sks = 0;
        counterMatkul++;
    }

    public MataKuliah(String IdMatkul, String nama, int sks){
        this.IdMatkul = IdMatkul;
        this.nama = nama;
        this.sks = sks;
        counterMatkul++;
    }

    // selektor
    public String getIdMatkul(){
        return IdMatkul;
    }

    public String getNamaMatkul(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public int getCounterMatkul(){
        return counterMatkul;
    }

    // mutator
    public void setIdMatkul(String IdMatkul){
        this.IdMatkul = IdMatkul;
    }

    public void setNamaMatkul(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}
