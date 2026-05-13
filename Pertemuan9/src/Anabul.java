/* Nama File    : Anabul.java 
 * Deskripsi    : kelas parent anabul
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Anabul {
    private String nama;
    private String panggilan;

    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }

    public String getNama() {
        return nama;
    }

    public String getPanggilan() {
        return panggilan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }

    public void Gerak() {};

    public void Bersuara() {};
}
