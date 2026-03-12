/* Nama File    : MBangunDatar.Java 
 * Deskripsi    : berisi objek implementasi dari class BangunDatar, Lingkaran, dan Persegi
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {

        // ======= OBJEK BangunDatar =======
        System.out.println("===== Bangun Datar =====");
        BangunDatar BD1 = new BangunDatar(6, "Merah", "Hitam");
        System.out.println("BD1");
        BD1.printInfo();
        System.out.println();
        
        BangunDatar BD2 = new BangunDatar();
        System.out.println("BD2");
        BD2.setJmlSisi(3);
        BD2.setWarna("Biru");
        BD2.setBorder("Putih");
        BD2.printInfo();
        System.out.println();
        
        // ======= OBJEK Persegi dari BangunDatar =======
        System.out.println("===== Persegi dari BangunDatar =====");
        BangunDatar P3 = new Persegi(5, "Kuning", "Putih");
        System.out.println("P3");
        P3.printInfo();
        System.out.println("Keliling    : " + ((Persegi)(P3)).getKeliling());
        System.out.println("Luas        : " + ((Persegi)(P3)).getLuas());
        System.out.println("Diagonal    : " + ((Persegi)(P3)).getDiagonal());
        System.out.println();
        
        // ======= OBJEK Lingkaran dari BangunDatar =======
        System.out.println("===== Lingkaran dari BangunDatar =====");
        BangunDatar L3 = new Lingkaran(5, "Kuning", "Putih");
        System.out.println("L3");
        P3.printInfo();
        System.out.println("Keliling    : " + ((Lingkaran)(L3)).getKeliling());
        System.out.println("Luas        : " + ((Lingkaran)(L3)).getLuas());
        System.out.println();
        
        
        // ======= OBJEK Persegi =======
        System.out.println("===== Persegi =====");
        Persegi P1 = new Persegi(5.0, "Hijau", "Merah");
        System.out.println("P1");
        P1.printInfo();
        System.out.println("Keliling    : " + P1.getKeliling());
        System.out.println("Luas        : " + P1.getLuas());
        System.out.println("Diagonal    : " + P1.getDiagonal());
        System.out.println();
        
        Persegi P2 = new Persegi();
        System.out.println("P2");
        P2.setSisi(10.0);
        P2.setWarna("Kuning");
        P2.setBorder("Biru");
        P2.printInfo();
        System.out.println("Keliling    : " + P2.getKeliling());
        System.out.println("Luas        : " + P2.getLuas());
        System.out.println("Diagonal    : " + P2.getDiagonal());
        System.out.println();

        // ======= OBJEK Lingkaran =======
        System.out.println("===== Lingkaran =====");
        Lingkaran L1 = new Lingkaran(7.0, "Ungu", "Hitam");
        System.out.println("L1");
        L1.printInfo();
        System.out.println("Keliling    : " + L1.getKeliling());
        System.out.println("Luas        : " + L1.getLuas());
        System.out.println();
        
        Lingkaran L2 = new Lingkaran();
        System.out.println("L2");
        L2.setJari(4);
        L2.setWarna("Cokelat");
        L2.setBorder("Abu-abu");
        L2.printInfo();
        System.out.println("Keliling    : " + L2.getKeliling());
        System.out.println("Luas        : " + L2.getLuas());
        System.out.println();

        // ======= COUNTER TOTAL OBJEK =======
        System.out.println("===== Counter =====");
        BangunDatar.printCounterBangunDatar();
    }
}
