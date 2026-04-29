/* Nama File    : Anjing.java 
 * Deskripsi    : Kelas untuk merepresentasikan anjing
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

package Anabul;
public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
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
