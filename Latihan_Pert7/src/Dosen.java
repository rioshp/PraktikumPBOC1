/* Nama File    : Dosen.java 
 * Deskripsi    : Kelas untuk merepresentasikan dosen
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */


public class Dosen extends CivitasAkademika {
    // Atribut
    private String NIP;

    // Method
    // Konstruktor
    public Dosen() {
        super("");
        NIP = "";
    }

    public Dosen(String nama, String NIP) {
        super(nama); // Call the constructor of the parent class
        this.NIP = NIP;
    }

    // Setter dan Getter
    public void setNip(String NIP) {
        this.NIP = NIP;
    }

    @Override
    public String getNomor() {
        return NIP;
    }
}
