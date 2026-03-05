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
    private static int counterMhs;
    
    /***************METHOD***************/
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

    public void addMatkul(MataKuliah namaMatkul){
        listMatkul.add(namaMatkul);
    }
}
