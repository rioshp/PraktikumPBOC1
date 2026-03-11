/* Nama File    : MTitik.Java 
 * Deskripsi    : berisi objek implementasi dari class Titik
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Lab          : C1
 * Tanggal      : 26 Februari 2026
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); // Membuat objek titik T1 (0,0)
        
        // error karena atribut absis bersifat private
        // System.out.println("absis T1 = " + T1.absis); 

        // solusinya mengakses absis T1 dengan method getAbsis()
        System.out.println("absis T1 = " + T1.getAbsis()); 
        
        T1.setAbsis(3);   // mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); // mengubah ordinat T1 dengan nilai 4
        T1.printTitik();  // mencetak koordinat T1 ke layar
        T1.geser(3,4);    // menggeser T1 sejauh (3,4)
        T1.printTitik();  // menampilkan koordinat T1 setelah digeser
        
        // Titik T2 = T1;
        Titik T2 = new Titik(3,5);
        T2.printTitik();
        // T1.setAbsis(10);
        // T1.setOrdinat(10);
        // T2.printTitik();

        T1.refleksiX();
        T1.refleksiY();
        T1.printTitik();
        System.out.println(T1.getKuadran());

        Titik T3 = T2.getRefleksiX();
        Titik T4 = T2.getRefleksiY();
        T3.printTitik();
        T4.printTitik();

        System.out.println("jarak T1 ke T2 = " + T1.getJarak(T2));
        System.out.println("jarak T1 ke pusat = " + T1.getJarakPusat());


        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        // System.out.println("Jumlah Objek Titik = " + T2.getCounterTitik()); Tidak bisa diakses dengan cara ini
        T1.printCounterTitik();
    }
}