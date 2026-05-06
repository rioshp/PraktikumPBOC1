/* Nama File    : Main.java
 * Deskripsi    : Kelas untuk menjalankan dan mengaplikasikan program
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Main {
    public static void main(String[] args) {
        // KUCING
        System.out.println("=== KUCING ===");
        Kucing kucing1 = new Anggora("Kitty", 5, "halus");
        System.out.println("Nama Kucing: " + kucing1.getNama());
        System.out.println("Bobot Kucing: " + kucing1.getBobot());
        System.out.println("Jenis Bulu Kucing: " + ((Anggora) kucing1).getJenisBulu());
        kucing1.Gerak();
        kucing1.Bersuara();
        // DATUM
        // Membuat Datum untuk menyimpan Integer
        System.out.println("\n=== DATUM ===");
        System.out.println("=== Contoh Penggunaan Datum dengan Integer ===");
        Datum<Integer> datumInteger = new Datum<>(42);
        System.out.println("Isi Datum Integer: " + datumInteger.getIsi());
        datumInteger.setIsi(100);
        System.out.println("Isi Datum Integer setelah diubah: " + datumInteger.getIsi());

        // Membuat Datum untuk menyimpan String
        System.out.println("=== Contoh Penggunaan Datum dengan String ===");
        Datum<String> datumString = new Datum<>("Hello, World!");
        System.out.println("Isi Datum String: " + datumString.getIsi());
        datumString.setIsi("Selamat Belajar!");
        System.out.println("Isi Datum String setelah diubah: " + datumString.getIsi());

        // Membuat Datum untuk menyimpan real
        System.out.println("=== Contoh Penggunaan Datum dengan Double ===");
        Datum<Double> datumDouble = new Datum<>(3.14);
        System.out.println("Isi Datum Double: " + datumDouble.getIsi());
        datumDouble.setIsi(2.718);
        System.out.println("Isi Datum Double setelah diubah: " + datumDouble.getIsi());

        // Membuat Datum untuk menyimpan Anabul
        System.out.println("=== Contoh Penggunaan Datum dengan Anabul ===");
        Datum<Anabul> datumAnabul = new Datum<>(new Anjing("budi"));
        System.out.println("Nama Anabul: " + datumAnabul.getIsi().getNama());
        datumAnabul.getIsi().Gerak();
        datumAnabul.getIsi().Bersuara();

        // OperatorGenerik
        System.out.println("\n=== OPERATOR GENERIK ===");
        // Contoh penggunaan Tukar dengan Datum Integer
        Datum<Integer> datumInteger1 = new Datum<>(42);
        Datum<Integer> datumInteger2 = new Datum<>(100);
        System.out.println("Sebelum ditukar:");
        System.out.println("Isi datumInteger1: " + datumInteger1.getIsi());
        System.out.println("Isi datumInteger2: " + datumInteger2.getIsi());
        OperatorGenerik.Tukar(datumInteger1, datumInteger2);
        System.out.println("Setelah ditukar:");
        System.out.println("Isi datumInteger1: " + datumInteger1.getIsi());
        System.out.println("Isi datumInteger2: " + datumInteger2.getIsi());

        // Contoh penggunaan Tukar dengan objek Anabul
        Datum<Anabul> datumAnabul1 = new Datum<>(new Anjing("budi"));
        Datum<Anabul> datumAnabul2 = new Datum<>(new Kucing("suli", 5));
        System.out.println("\nSebelum ditukar:");
        System.out.println("Isi datumAnabul1: " + datumAnabul1.getIsi().getNama());
        System.out.println("Isi datumAnabul2: " + datumAnabul2.getIsi().getNama());
        OperatorGenerik.Tukar(datumAnabul1, datumAnabul2);
        System.out.println("Setelah ditukar:");
        System.out.println("Isi datumAnabul1: " + datumAnabul1.getIsi().getNama());
        System.out.println("Isi datumAnabul2: " + datumAnabul2.getIsi().getNama());

        // Contoh penggunaan Bobot2 untuk menghitung jumlah bobot dua kucing
        Anggora anggora1 = new Anggora("Kitty", 5, "halus");
        KembangTelon kembangTelon1 = new KembangTelon("Mimi", 4, "lebat");
        double totalBobot = OperatorGenerik.Bobot2(anggora1, kembangTelon1);
        System.out.println("\nAnggora " + anggora1.getNama() + " Bobot : " + anggora1.getBobot() + " kg");
        System.out.println("Kembang Telon " + kembangTelon1.getNama() + " Bobot : " + kembangTelon1.getBobot() + " kg");
        System.out.println("\nTotal bobot kedua kucing: " + totalBobot + " kg");

        // DATA
        System.out.println("\n=== IMPLEMENTASI DATA ===");
        // Membuat Data untuk menyimpan Integer
        System.out.println("=== Contoh Penggunaan Data dengan Integer ===");
        Data<Integer> dataInteger = new Data<>();
        System.out.println("Kapasitas   : " + dataInteger.getKapasitas());
        System.out.println("ukuran Awal : " + dataInteger.getSize());

        dataInteger.setIsi(1, 42);
        dataInteger.setIsi(2, 67);
        dataInteger.setIsi(3, 99);
        dataInteger.setIsi(4, 60);
        dataInteger.setIsi(5, 50);

        System.out.println("Isi Data Integer:");
        for (int i = 1; i <= dataInteger.getSize(); i++) {
            System.out.println("Elemen di posisi " + i + ": " + dataInteger.getIsi(i));
        }

        // Membuat Data untuk menyimpan String
        System.out.println("\n=== Contoh Penggunaan Data dengan String ===");
        Data<String> dataString = new Data<>();
        System.out.println("Kapasitas   : " + dataString.getKapasitas());
        System.out.println("ukuran Awal : " + dataString.getSize());
        dataString.setIsi(1, "Hello");
        dataString.setIsi(2, "World");
        dataString.setIsi(3, "Java");
        System.out.println("Isi Data String:");
        for (int i = 1; i <= dataString.getSize(); i++) {
            System.out.println("Elemen di posisi " + i + ": " + dataString.getIsi(i));
        }

        // Membuat Data untuk menyimpan Anabul
        System.out.println("\n=== Contoh Penggunaan Data dengan Anabul ===");
        Data<Anabul> dataAnabul = new Data<>();
        System.out.println("Kapasitas   : " + dataAnabul.getKapasitas());
        System.out.println("ukuran Awal : " + dataAnabul.getSize());
        dataAnabul.setIsi(1, new Anjing("budi"));
        dataAnabul.setIsi(2, new Kucing("suli", 5));
        dataAnabul.setIsi(3, new Burung("Owl"));
        System.out.println("Isi Data Anabul:");
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            System.out.println("Nama Anabul di posisi " + i + ": " + dataAnabul.getIsi(i).getClass().getName() + " - " + dataAnabul.getIsi(i).getNama());
        }
    }
}
