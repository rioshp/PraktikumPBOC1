/* Nama File    : Main.java 
 * Deskripsi    : Kelas untuk menjalankan program CivitasAkademika, Dosen, Mahasiswa, dan Seminar
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

public class Main {
    public static void main(String[] args) {

        Seminar S1 = new Seminar();

        CivitasAkademika D1 = new Dosen("Dr. Smith", "12345");
        CivitasAkademika D2 = new Dosen("Dr. Johnson", "67890");

        CivitasAkademika M1 = new Mahasiswa("Alice", "2021001", (Dosen) D1);
        CivitasAkademika M2 = new Mahasiswa("Bob", "2021002", (Dosen) D2);
        CivitasAkademika M3 = new Mahasiswa("Charlie", "2021003", (Dosen) D1);
        CivitasAkademika M4 = new Mahasiswa("David", "2021004", (Dosen) D2);
        CivitasAkademika M5 = new Mahasiswa("Eve", "2021005", (Dosen) D1);
        
        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);

        S1.tampilPeserta();
        System.out.println("Jumlah Peserta Seminar: " + S1.countPeserta());
        System.out.println("Jumlah Mahasiswa yang mengikuti Seminar: " + S1.countMahasiswa());

        ((Mahasiswa) M1).tampilDataMahasiswa();
        ((Mahasiswa) M2).tampilDataMahasiswa();
        ((Mahasiswa) M1).setDoswal((Dosen)D2);
        ((Mahasiswa) M1).tampilDataMahasiswa();
    }
}
