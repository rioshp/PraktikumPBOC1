/* Nama File    : Kucing.java 
 * Deskripsi    : Kelas untuk merepresentasikan kucing
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

package Anabul;
public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak : lompat");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Meow!");
    }
    
}
