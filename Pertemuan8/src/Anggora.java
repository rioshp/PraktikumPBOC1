/* Nama File    : Anggora.java 
 * Deskripsi    : Kelas untuk merepresentasikan Anggora
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Anggora extends Kucing {
    private String jenisBulu;

    public Anggora(String nama, int bobot, String jenisBulu) {
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
        System.out.println("Gerak : kibas manja");
    }

    @Override
    public void Bersuara() {
        System.out.println("Suara : Meow Lembut...");
    }


}