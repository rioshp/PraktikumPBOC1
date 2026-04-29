/* Nama File    : Mahasiswa.java 
 * Deskripsi    : Kelas untuk merepresentasikan data mahasiswa
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String ProgramStudi;

    // c. Konstruktor tanpa parameter
    public Mahasiswa(){
        this.NIM = "999";
        this.nama = "n/a";
        this.ProgramStudi = "n/a";
    }

    // d. Konstruktor dengan 3 parameter
    public Mahasiswa(String NIM, String nama, String ProgramStudi){
        this.NIM = NIM;
        this.nama = nama;
        this.ProgramStudi = ProgramStudi;
    }

    // e. Konstruktor dengan 1 parameter bertipe Mahasiswa (cloning)
    public Mahasiswa(Mahasiswa m){
        this.NIM = m.NIM;
        this.nama = m.nama;
        this.ProgramStudi = m.ProgramStudi;
    }

    // varian 1 : tanpa parameter
    public void setProgramStudi(){
        this.ProgramStudi = "Kosong";
    }

    // varian 2 : dengan parameter bertipe String
    public void setProgramStudi(String ProgramStudi){
        this.ProgramStudi = ProgramStudi;
    }

    // varian 3 : dengan parameter bertipe Mahasiswa
    public void setProgramStudi(Mahasiswa m){
        this.ProgramStudi = m.ProgramStudi;
    }

    // Selektor dan Mutator
    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProgramStudi() {
        return ProgramStudi;
    }

    // method cetak
    public void cetak(){
        System.out.println("NIM             : " + this.NIM);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Program Studi   : " + this.ProgramStudi);
        System.out.println("==============================");
    }
}
