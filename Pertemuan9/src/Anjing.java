/* Nama File    : Anjing.java 
 * Deskripsi    : Kelas untuk merepresentasikan anjing
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Anjing extends Anabul {
    public Anjing(String nama, String panggilan) {
        super(nama, panggilan);
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak : lari");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Woof!");
    }
    
}
