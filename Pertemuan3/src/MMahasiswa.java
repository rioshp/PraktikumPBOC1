/* Nama File    : MMahasiswa.Java
 * Deskripsi    : berisi objek implementasi dari class Mahasiswa, Dosen, Kendaraan, MataKuliah
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 05 Maret 2026
 */

public class MMahasiswa {
    public static void main(String[] args) {

        // 1. Konstruktor default
        System.out.println("===== Konstruktor Default =====");
        Mahasiswa M0 = new Mahasiswa();
        M0.printMhs();

        // 2. Konstruktor berparameter
        System.out.println("\n===== Konstruktor Berparameter =====");
        Mahasiswa M1 = new Mahasiswa("22416255201001", "Rio Setiawan", "IF");
        M1.printMhs();

        // 3. Selektor (Getter)
        System.out.println("\n===== Selektor (Getter) =====");
        System.out.println("NIM       : " + M1.getNim());
        System.out.println("Nama      : " + M1.getNama());
        System.out.println("Prodi     : " + M1.getProdi());
        System.out.println("Jumlah Mahasiswa (counter) : " + M1.getCounterMhs());

        // 4. Mutator (Setter)
        System.out.println("\n===== Mutator (Setter) =====");
        M1.setNim("22416255201099");
        M1.setNama("Rio Setiawan Hastanu Putra");
        M1.setProdi("Informatika");
        System.out.println("NIM setelah diubah   : " + M1.getNim());
        System.out.println("Nama setelah diubah  : " + M1.getNama());
        System.out.println("Prodi setelah diubah : " + M1.getProdi());

        // 5. setDosenWali & getDosenWali
        System.out.println("\n===== Dosen Wali =====");
        Dosen D1 = new Dosen("198501012010121001", "Dr. Budi Santoso", "Informatika");
        M1.setDosenWali(D1);
        System.out.println("Dosen Wali NIP   : " + M1.getDosenWali().getNip());
        System.out.println("Dosen Wali Nama  : " + M1.getDosenWali().getNama());
        System.out.println("Dosen Wali Prodi : " + M1.getDosenWali().getProdi());

        // 6. setKendaraan & getKendaraan
        System.out.println("\n===== Kendaraan =====");
        Kendaraan K1 = new Kendaraan("D 1234 ABC", "motor");
        M1.setKendaraan(K1);
        System.out.println("Jenis Kendaraan : " + M1.getKendaraan().getJenis());
        System.out.println("Nomor Plat      : " + M1.getKendaraan().getNoPlat());

        // 7. addMatKul & getListMatkul
        System.out.println("\n===== Tambah Mata Kuliah =====");
        MataKuliah PBO = new MataKuliah("PBO", "Pemrograman Berorientasi Objek", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        MataKuliah ALPRO = new MataKuliah("ALPRO", "Algoritma dan Pemrograman", 4);
        M1.addMatKul(PBO);
        M1.addMatKul(MBD);
        M1.addMatKul(ALPRO);
        System.out.println("Daftar mata kuliah yang diambil:");
        for (MataKuliah mk : M1.getListMatkul()) {
            System.out.println("  [" + mk.getIdMatkul() + "] " + mk.getNamaMatkul() + " - " + mk.getSks() + " SKS");
        }

        // 8. getJumlahMatKul & getJumlahSKS
        System.out.println("\n===== Jumlah Mata Kuliah & SKS =====");
        System.out.println("Jumlah Mata Kuliah : " + M1.getJumlahMatKul());
        System.out.println("Total SKS          : " + M1.getJumlahSKS());

        // 9. setListMatkul (mengganti seluruh daftar matkul)
        System.out.println("\n===== setListMatkul =====");
        java.util.ArrayList<MataKuliah> listBaru = new java.util.ArrayList<>();
        listBaru.add(new MataKuliah("KB", "Kecerdasan Buatan", 3));
        listBaru.add(new MataKuliah("JARKOM", "Jaringan Komputer", 2));
        M1.setListMatkul(listBaru);
        System.out.println("Daftar matkul setelah diganti:");
        for (MataKuliah mk : M1.getListMatkul()) {
            System.out.println("  [" + mk.getIdMatkul() + "] " + mk.getNamaMatkul() + " - " + mk.getSks() + " SKS");
        }
        System.out.println("Jumlah Mata Kuliah : " + M1.getJumlahMatKul());
        System.out.println("Total SKS          : " + M1.getJumlahSKS());

        // 10. printMhs & printDetailMhs
        System.out.println("\n===== printMhs =====");
        M1.printMhs();

        System.out.println("\n===== printDetailMhs =====");
        M1.printDetailMhs();

        // 11. Counter static (jumlah objek Mahasiswa dibuat)
        System.out.println("\n===== Counter Static Mahasiswa =====");
        System.out.println("Total objek Mahasiswa yang telah dibuat: " + M1.getCounterMhs());
    }
}