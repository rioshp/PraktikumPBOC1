/* Nama File    : Asersi1.Java 
 * Deskripsi    : Program untuk menunjukkan penggunaan asersi dalam Java
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 14 April 2026
 */

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if ( x > 0 ){
            System.out.println("x bilangan positif");
        }
        else {
            assert (x < 0) : "ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
