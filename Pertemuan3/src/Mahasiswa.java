/* Nama File    : Mahasiswa.Java
 * Deskripsi    : berisi atribut dan method dalam class Mahasiswa
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 05 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {
    /***************ATRIBUT***************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;
    private static int counterMhs = 0;
    
    /***************METHOD***************/
    // Konstruktor
    public Mahasiswa(){
        this.nim = "404";
        this.nama = "anon";
        this.prodi = "unknown";
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMhs++;
    }

    public Mahasiswa(String NIM, String Nama, String Prodi){
        this.nim = NIM;
        this.nama = Nama;
        this.prodi = Prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
        counterMhs++;
    }

    // Selektor
    public String getNim(){
        return nim;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }
    
    public ArrayList<MataKuliah> getListMatkul(){
        return listMatkul;
    }

    public Dosen getDosenWali(){
        return dosenWali;
    }

    public Kendaraan getKendaraan(){
        return kendaraan;
    }

    public int getCounterMhs(){
        return counterMhs;
    }
    
    // Mutator
    public void setNim(String NIM){
        this.nim = NIM;
    }

    public void setNama(String Nama){
        this.nama = Nama;
    }

    public void setProdi(String Prodi){
        this.prodi = Prodi;
    }

    public void setListMatkul(ArrayList<MataKuliah> listMatkul){
        this.listMatkul = listMatkul;
    }

    public void setDosenWali(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // METHOD LAIN
    // menambahkan mata kuliah ke dalam daftar mata kuliah yang diambil mahasiswa
    public void addMatKul(MataKuliah namaMatkul){
        listMatkul.add(namaMatkul);
    }

    // Menghitung total SKS dari semua mata kuliah yang diambil
    public int getJumlahSKS() {
        int totalSks = 0;
        for (MataKuliah matkul : listMatkul) {
        totalSks += matkul.getSks();
        }
        return totalSks;
    }

    // Mengembalikan jumlah mata kuliah yang diambil
    public int getJumlahMatKul() {
        return listMatkul.size();
    }

    // menampilkan informasi dasar tentang mahasiswa, termasuk NIM, nama, dan prodi
    public void printMhs() {
        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Prodi   : " + prodi);
    }

    // menampilkan detail informasi tentang mahasiswa, termasuk NIM, nama, prodi, dosen wali, kendaraan, dan daftar mata kuliah yang diambil beserta SKS-nya
  public void printDetailMhs() {
    printMhs();
    System.out.println("Daftar Mata Kuliah : ");
    for (MataKuliah matkul : this.listMatkul) {
      System.out.println("  - " + matkul.getNamaMatkul() + " (" + matkul.getSks() + " SKS)");
    }
    System.out.println("Dosen Wali : ");
    System.out.println("  - NIP     : " + dosenWali.getNip());
    System.out.println("  - Nama    : " + dosenWali.getNama());
    System.out.println("  - Prodi   : " + dosenWali.getProdi());
    System.out.println("Kendaraan : ");
    System.out.println("  - No. Plat    : " + kendaraan.getNoPlat());
    System.out.println("  - Jenis       : " + kendaraan.getJenis());
  }
}
