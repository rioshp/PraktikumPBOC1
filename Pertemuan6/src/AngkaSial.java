/* Nama File    : AngkaSial.java 
 * Deskripsi    : Program penggunaan exception buatan sendiri, Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 14 April 2026
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        } else {
            System.out.println(angka + " bukan angka sial");
        }
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        } finally {
            System.out.println("program selesai"); // bukti lihat video
        }
    }
}

// jawab pertanyaan :
// ketika eksepsi terjadi baris 12 tidak dieksekusi, baris 12 dieksekusi jika angka input bukan 13.
// baris 21 tidak dieksekusi karena pada baris 20 terjadi eksepsi, sehingga program langsung lompat ke blok catch yang kemudian mengirimkan pesan eksepsi 
// ke variabel ase, lalu mengeksekusi perintah pada blok catch, dan lanjut ke blok finally untuk mengeksekusi perintah pada blok finally, setelah itu
// program selesai.

