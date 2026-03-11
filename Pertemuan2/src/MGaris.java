/* Nama File    : MGaris.Java 
 * Deskripsi    : berisi objek implementasi dari class Garis
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Lab          : C1
 * Tanggal      : 26 Februari 2026
 */

public class MGaris {
    public static void main(String[] args){
        Garis G1 = new Garis(); // membuat objek G1 dari class Garis dengan nilai default
        G1.printGaris(); // mencetak informasi tentang G1 ke layar

        // error karena atribut awal dari class garis bersifat private
        // Titik T1 = G1.awal;
        
        // solusi untuk mengakses titik awal G1 dengan method getTitikAwal()
        Titik T1 = G1.getTitikAwal(); 
        T1.printTitik(); // mencetak informasi tentang T1 ke layar
        
        // membuat objek G2 dengan titik awal (1,2) dan titik akhir (4,6)
        Garis G2 = new Garis(new Titik(1,2), new Titik(4,6)); 
        // mencetak informasi tentang G2 ke layar
        G2.printGaris(); 
        
        // Mutator
        G1.setTitikAwal(new Titik(2,3)); // mengubah titik awal G1 menjadi (2,3)
        G1.setTitikAkhir(new Titik(5,7)); // mengubah titik akhir G1 menjadi (5,7)
        G1.printGaris();

        // GetPanjang
        System.out.println("Panjang G1 = " + G1.getPanjang());
        System.out.println("Panjang G2 = " + G2.getPanjang());

        // GetGradien
        System.out.println("Gradien G1 = " + G1.getGradien());
        System.out.println("Gradien G2 = " + G2.getGradien());

        // Titik Tengah
        System.out.println("Garis G1 memiliki titik tengah di = (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat() + ")");
        // G1.getTitikTengah().printTitik(); cara lain untuk mencetak titik tengah G1
        
        // Sejajar dan Tegak Lurus
        System.out.println("apakah G1 dan G2 sejajar? " + G1.isSejajar(G2));
        System.out.println("apakah G1 dan G2 tegak lurus? " + G1.isTegakLurus(G2));
        
        // Persamaan Garis
        G1.printPersamaanGaris();
        G2.printPersamaanGaris();

        // counterGaris
        System.out.println("Jumlah Objek Garis = " + Garis.getCounterGaris());
    }
}
