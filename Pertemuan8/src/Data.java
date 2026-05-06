/* Nama File    : Data.java 
 * Deskripsi    : Kelas generik Data
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 30 April 2026
 */

public class Data<T> {
    private static final int kapasitas = 100;
    private T[] ruang;
    private int banyak;

    // konstruktor
    @SuppressWarnings("unchecked")
    public Data() {
        ruang = (T[]) new Object[kapasitas];
        banyak = 0;
    }

    @SuppressWarnings("unchecked")
    public T getIsi(int posisi){
        if(posisi >= 1 && posisi <= kapasitas && posisi <= banyak){
            return (T) ruang[posisi-1];
        }
        return null;
    }

    public void setIsi(int posisi, T isi){
        if(posisi >= 1 && posisi <= kapasitas){
            ruang[posisi-1] = isi;
            if(posisi > banyak){
                banyak = posisi;
            }
        }
    }

    public int getSize(){
        return banyak;
    }

    public int getKapasitas(){
        return kapasitas;
    }
}
