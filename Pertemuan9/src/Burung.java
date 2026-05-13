/* Nama File    : Burung.java 
 * Deskripsi    : Kelas untuk merepresentasikan burung
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Burung extends Anabul {
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak : terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Kicau!");
    }
}
