/* Nama File    : KembangTelon.java 
 * Deskripsi    : Kelas untuk merepresentasikan KembangTelon
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class KembangTelon extends Kucing {
    private String jenisBulu;

    public KembangTelon(String nama, int bobot, String jenisBulu) {
        super(nama, bobot);
        this.jenisBulu = jenisBulu;
    }

    public String getJenisBulu() {
        return jenisBulu;
    }

    public void setJenisBulu(String jenisBulu) {
        this.jenisBulu = jenisBulu;
    }

    @Override
    public void Gerak() {
        System.out.println("Gerak : Maju mundur cantik");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Meow manja....");
    }
}