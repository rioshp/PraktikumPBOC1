/* Nama File    : Piaraan.java
 * Deskripsi    : Kelas Piaraan yang menyimpan daftar nama piaraan
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 7 Mei 2026
 */

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    // Konstruktor
    public Piaraan(){
        this.nbelm = 0;
        this.Lanabul = new LinkedList<>();
    }

    // Method
    // Selektor
    public int getNbelm() {
        return nbelm;
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.offer(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    public Anabul dequeueAnabul() {
        if (!Lanabul.isEmpty()) {
            nbelm--;
            return Lanabul.poll();
        }
        return null;
    }

    public void showAnabul() {
        int i = 1;
        for (Anabul anabul : Lanabul) {
            System.out.println(i + ". Panggilan: " + anabul.getPanggilan());
            i++;
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                count++;
            }
        }
        return count;
    }

    public int bobotKucing() {
        int bobot = 0;
        for (Anabul anabul : Lanabul) {
            if (anabul instanceof Kucing) {
                bobot += ((Kucing) anabul).getBobot();
            }
        }
        return bobot;
    }

    public void showJenisAnabul() {
        int i = 1;
        for (Anabul anabul : Lanabul) {
            System.out.println(i + ". " + anabul.getPanggilan() + " adalah " + anabul.getClass().getName());
            i++;
        }
    }

}
