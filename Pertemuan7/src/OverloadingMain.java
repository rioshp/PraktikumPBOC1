/* Nama File    : OverloadingMain.java 
 * Deskripsi    : Berisi implementasi dari polimorfisme overloading atau class Mahasiswa
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

public class OverloadingMain {
    public static void main(String[] args) {
        System.out.println("=== Aplikasi kelas Mahasiswa ===");

        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Mahasiswa 1:");
        m1.cetak();
        
        Mahasiswa m2 = new Mahasiswa("24060124130068", "Rio Setiawan Hastanu Putra", "Teknik Informatika");
        System.out.println("Mahasiswa 2:");
        m2.cetak();
        
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Mahasiswa 3:");
        m3.cetak();
        
        System.out.println("\n=== setProgramStudi Overloading ===");
        System.out.println("Mengubah Program Studi M2 (tanpa parameter) :");
        m2.setProgramStudi();
        m2.cetak();

        System.out.println("Mengubah Program Studi M2 (dengan parameter String : 'Sistem Informasi') :");
        m2.setProgramStudi("Sistem Informasi");
        m2.cetak();
        
        System.out.println("Mengubah Program Studi M1 (dengan parameter objek Mahasiswa M2) :");
        m1.setProgramStudi(m2);
        m1.cetak();
    }
}
