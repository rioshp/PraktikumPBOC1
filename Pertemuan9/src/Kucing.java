/* Nama File    : Kucing.java 
 * Deskripsi    : Kelas untuk merepresentasikan kucing
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Kucing extends Anabul {
    private int bobot;

    public Kucing(String nama, String panggilan, int bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }

    public int getBobot() {
        return bobot;
    }

    public void setBobot(int bobot) {
        this.bobot = bobot;
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
