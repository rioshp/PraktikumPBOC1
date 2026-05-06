/* Nama File    : OperatorGenerik.java 
 * Deskripsi    : Kelas untuk merepresentasikan operator generik
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class OperatorGenerik {
   /*
    * Prosedur generik Tukar untuk menukar nilai dua parameter
    * menggunakan array untuk memungkinkan penukaran nilai aktual
    * @param <T> Tipe data generik
    */

    public static <T> void Tukar(Datum<T> a, Datum<T> b) {
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    /*
     * Fungsi generik Bobot2 untuk menghitung jumlah bobot dua kucing
     * @param K1 Kucing pertama
     * @param K2 Kucing kedua
     * @return Jumlah bobot kedua kucing
     */
    public static double Bobot2(Kucing K1, Kucing K2){
        return K1.getBobot() + K2.getBobot();
    }
}
