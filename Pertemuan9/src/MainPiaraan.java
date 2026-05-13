/* Nama File    : MainPiaraan.java
 * Deskripsi    : Kelas MainPiaraan yang berisi method main untuk menguji kelas Piaraan dan kelas-kelas Anabul
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 7 Mei 2026
 */
public class MainPiaraan {
    public static void main(String[] args) {
        Piaraan piaraan = new Piaraan();

        Anabul anabul1 = new Anjing("Mimi", "Mi");
        Anabul anabul2 = new Burung("Kiki", "Ki");
        Anabul anabul3 = new Kucing("Tomyu", "Tom", 5);
        Anabul anabul4 = new Kucing("Jerry", "Jerry", 3);
        Anabul anabul5 = new Anggora("Luna", "Lucy", 4, "Bulu Panjang");

        piaraan.enqueueAnabul(anabul1);
        piaraan.enqueueAnabul(anabul2);
        piaraan.enqueueAnabul(anabul3);
        piaraan.enqueueAnabul(anabul4);
        piaraan.enqueueAnabul(anabul5);
        System.out.println("Daftar Anabul:");
        piaraan.showAnabul();


        System.out.println("\nJumlah Anabul: " + piaraan.getNbelm());
        System.out.println("\nAnabul pertama: " + piaraan.getAnabul().getPanggilan());
        System.out.println("\nApakah Mimi ada? " + (piaraan.isMember(anabul1) ? "Ya" : "Tidak"));
        System.out.println("\nJumlah Kucing: " + piaraan.countKucing());
        System.out.println("\nTotal Bobot semua Kucing: " + piaraan.bobotKucing());
        System.out.println("\nMengeluarkan Anabul pertama: " + piaraan.dequeueAnabul().getNama());
        System.out.println("\nDaftar Anabul setelah dequeue:");
        piaraan.showAnabul();
        System.out.println("\nJenis masing-masing Anabul:");
        piaraan.showJenisAnabul();

    }
}
