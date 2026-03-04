/* Nama File    : Garis.Java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Februari 2026
 */

public class Garis {
    /***************ATRIBUT***************/
    private Titik awal;
    private Titik akhir;
    static int counterGaris = 0;

    /***************METHOD***************/
    // konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        this.awal = new Titik();
        this.akhir = new Titik(1,1);
        counterGaris++;
    }
    // konstruktor untuk membuat garis dengan titik awal dan titik akhir yang diberikan
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // mengembalikan Titik awal garis
    public Titik getTitikAwal() {
        return awal;
    }

    // mengembalikan Titik akhir garis
    public Titik getTitikAkhir() {
        return akhir;
    }

    // mengembalikan jumlah objek garis yang telah dibuat
    public static int getCounterGaris() {
        return counterGaris;
    }


    // mengubah titik awal garis dengan titik awal baru
    public void setTitikAwal(Titik awal) {
        this.awal = awal;
    }

    // mengubah titik akhir garis dengan titik akhir baru
    public void setTitikAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    public double getPanjang() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public double getGradien() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        return dy / dx;
    }

    public Titik getTitikTengah() {
        double midAbsis = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double midOrdinat = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(midAbsis, midOrdinat);
    }

    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    public boolean isTegakLurus(Garis g) {
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        return gradien1 * gradien2 == -1;
    }

    public void printGaris() {
        System.out.println("Titik awal = (" + awal.getAbsis() + "," + awal.getOrdinat() + ") Titik akhir = (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
