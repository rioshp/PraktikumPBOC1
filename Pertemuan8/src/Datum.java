/* Nama File    : Datum.java 
 * Deskripsi    : Datum adalah kelas generik
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Datum<T> {
    // Atribut Generik
    private T isi;

    // Konstruktor
    public Datum(T isi) {
        this.isi = isi;
    }

    // Selektor
    public T getIsi() {
        return isi;
    }

    // Mutator
    public void setIsi(T isi) {
        this.isi = isi;
    }
}