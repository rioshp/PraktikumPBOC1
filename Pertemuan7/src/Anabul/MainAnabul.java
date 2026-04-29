/* Nama File    : MainAnabul.java 
 * Deskripsi    : Kelas untuk menjalankan program anabul
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

package Anabul;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul Anabul1 = new Anjing("Lug");
        Anabul Anabul2 = new Burung("Papilo");
        Anabul Anabul3 = new Kucing("Owen");

        System.out.println("=== Anabul 1 ===");
        System.out.println(Anabul1.getNama());
        Anabul1.Gerak();
        Anabul1.Bersuara();

        System.out.println("=== Anabul 2 ===");
        System.out.println(Anabul2.getNama());
        Anabul2.Gerak();
        Anabul2.Bersuara();

        System.out.println("=== Anabul 3 ===");
        System.out.println(Anabul3.getNama());
        Anabul3.Gerak();
        Anabul3.Bersuara();
    }
}
