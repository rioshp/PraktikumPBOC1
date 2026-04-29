/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Kelas untuk merepresentasikan data mahasiswa
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa extends CivitasAkademika {
    // Atribut
    private String NIM;
    private Dosen Doswal;

    // Method
    // Konstruktor
    public Mahasiswa() {
        super("");
        NIM = "";
        Doswal = new Dosen("", "");
    }

    public Mahasiswa(String nama,String NIM, Dosen Doswal) {
        super(nama);
        this.NIM = NIM;
        this.Doswal = Doswal;
    }

    // setter dan getter
    public Dosen getDoswal() {
        return Doswal;
    }
    public void setDoswal(Dosen Doswal) {
        this.Doswal = Doswal;
    }

    public void setNim(String NIM) {
        this.NIM = NIM;
    }
    @Override
    public String getNomor() {
        return NIM;
    }

    // method lain
    public void tampilDataMahasiswa(){
        System.out.println("Nama        : " + getNama());
        System.out.println("NIM         : " + getNomor());
        System.out.println("Dosen Wali  : " + Doswal.getNama());
        System.out.println("================================");
    }
    
}
