/* Nama File    : IResize.java 
 * Deskripsi    : berisi method-method dalam interface IResize
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Maret 2026
 */

public interface IResize {
    /*Method */
    // menambah ukuran objek sebesar 10%
    public void zoomIn();
    // mengurangi ukuran objek sebesar 10%
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom(int percent);
}
