/* Nama File    : Dosen.Java 
 * Deskripsi    : berisi atribut dan method dalam class Dosen
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 05 Maret 2026
 */

public class Dosen {
    /***************ATRIBUT***************/
    private String nip;
    private String nama;
    private String prodi;
    private static int counterDosen;

    /***************METHOD***************/
    // Konstruktor
    public Dosen(){
        this.nip = "404";
        this.nama = "anon";
        this.prodi = "unknown";
        counterDosen++;
    }

    public Dosen(String Nip, String Nama, String Prodi){
        this.nip = Nip;
        this.nama = Nama;
        this.prodi = Prodi;
        counterDosen++;
    }

    // Selektor
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    public int getCounterDosen(){
        return counterDosen;
    }

    // Mutator
    public void setNip(String Nip){
        this.nip = Nip;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }
}