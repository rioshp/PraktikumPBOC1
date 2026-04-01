/* Nama File    : MBangunDatar.Java 
 * Deskripsi    : berisi objek implementasi dari class BangunDatar, Lingkaran, dan Persegi
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

public class MBangunDatar {
    public static void main(String[] args) {
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

        // ======= PERBANDINGAN LUAS OBJEK =======
        System.out.println("===== Perbandingan Luas Objek =====");
        if(P1.isEqualLuas(P2)){
            System.out.println("Luas P1 dan P2 sama");
        } else {
            System.out.println("Luas P1 dan P2 berbeda");
        }

        // penerapan IResize
        System.out.println("===== Penerapan IResize =====");
        System.out.println("P1 sebelum zoom in:");
        P1.printInfo();
        P1.zoomIn();
        System.out.println("P1 setelah zoom in:");
        P1.printInfo();
        System.out.println("L1 sebelum zoom out:");
        L1.printInfo();
        L1.zoomOut();
        System.out.println("L1 setelah zoom out:");
        L1.printInfo();
        System.out.println("P1 sebelum zoom to 150%:");
        P1.printInfo();
        P1.zoom(50);
        System.out.println("P1 setelah zoom to 150%:");
        P1.printInfo();
        System.err.println("L1 sebelum zoom to 150%:");
        L1.printInfo();
        L1.zoom(50);
        System.out.println("L1 setelah zoom to 150%:");
        L1.printInfo();

        // ======= COUNTER TOTAL OBJEK =======
        System.out.println("===== Counter =====");
        BangunDatar.printCounterBangunDatar();
    }
}
