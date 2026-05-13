/* Nama File    : Teman.java 
 * Deskripsi    : Kelas Teman yang menyimpan daftar nama teman
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 7 Mei 2026
 */

import java.util.ArrayList;
import java.util.List;

public class Teman {
    private int nbelm;
    private List<String> Lnama;

    // Konstruktor
    public Teman(){
        this.nbelm = 0;
        this.Lnama = new ArrayList<>();
    }

    // Method
    // selektor
    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int indeks) {
        if(indeks >= 0 && indeks <= nbelm){
            return Lnama.get(indeks);
        }
        return null;
    }

    // mutator
    public void setNama(int indeks, String nama) {
        if(indeks >= 0 && indeks <= nbelm){
            Lnama.set(indeks, nama);
        }
    }

    public void addNama(String nama){
        nbelm++;
        Lnama.add(nama);
    }

    public void delNama(String nama){
        if(Lnama.remove(nama)){
            nbelm--;
        }else{
            System.out.println("Nama tidak ada");
        }
    }

    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public void gantiNama(String nama, String namaBaru){
        int indeks = Lnama.indexOf(nama);
        this.setNama(indeks, namaBaru);
    }

    public int countNama(String nama){
        int count = 0;
        for(String n : Lnama){
            if(n.equals(nama)){
                count++;
            }
        }
        return count;
    }

    public void showTeman(){
        System.out.println("Daftar Teman:");
        for(int i = 0; i < nbelm; i++){
            System.out.println((i + 1) + ". " + Lnama.get(i));
        }
    }

    
}
