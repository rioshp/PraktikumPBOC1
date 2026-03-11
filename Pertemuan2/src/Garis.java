/* Nama File    : Garis.Java 
 * Deskripsi    : berisi atribut dan method dalam class Garis
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Lab          : C1
 * Tanggal      : 26 Februari 2026
 */

public class Garis {
    /***************ATRIBUT***************/
    private Titik awal;
    private Titik akhir;
    static int counterGaris = 0;

    /***************METHOD***************/
    // KONSTRUKTOR

    // konstruktor untuk membuat garis dengan titik awal (0,0) dan titik akhir (1,1)
    public Garis() {
        awal = new Titik();
        akhir = new Titik(1,1);
        counterGaris++;
    }
    // konstruktor untuk membuat garis dengan titik awal dan titik akhir yang diberikan
    public Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }

    // SELEKTOR

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


    // MUTATOR

    // mengubah titik awal garis dengan titik awal baru
    public void setTitikAwal(Titik awal) {
        this.awal = awal;
    }

    // mengubah titik akhir garis dengan titik akhir baru
    public void setTitikAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // METHOD LAIN
    
    // menghitung panjang garis menggunakan rumus jarak antara dua titik
    public double getPanjang() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        return Math.sqrt(dx*dx + dy*dy);
    }

    // menghitung gradien garis menggunakan rumus (y2 - y1) / (x2 - x1)
    public double getGradien() {
        double dx = akhir.getAbsis() - awal.getAbsis();
        double dy = akhir.getOrdinat() - awal.getOrdinat();
        return dy / dx;
    }

    // menghitung titik tengah garis menggunakan rumus ((x1 + x2) / 2, (y1 + y2) / 2)
    public Titik getTitikTengah() {
        double midAbsis = (awal.getAbsis() + akhir.getAbsis()) / 2;
        double midOrdinat = (awal.getOrdinat() + akhir.getOrdinat()) / 2;
        return new Titik(midAbsis, midOrdinat);
    }

    // menentukan apakah garis ini sejajar dengan garis lain dengan membandingkan gradien kedua garis
    public boolean isSejajar(Garis g) {
        return this.getGradien() == g.getGradien();
    }

    // menentukan apakah garis ini tegak lurus dengan garis lain dengan memeriksa apakah hasil perkalian gradien kedua garis adalah -1
    public boolean isTegakLurus(Garis g) {
        double gradien1 = this.getGradien();
        double gradien2 = g.getGradien();
        return gradien1 * gradien2 == -1;
    }

    // menampilkan informasi tentang garis, termasuk titik awal, titik akhir, panjang, gradien, dan titik tengah
    public void printGaris() {
        System.out.println("Titik awal = (" + awal.getAbsis() + "," + awal.getOrdinat() + ") Titik akhir = (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")");
    }

    // menampilkan persamaan garis dalam bentuk y = mx + c, di mana m adalah gradien dan c adalah intersep y yang dihitung menggunakan titik awal garis
    public void printPersamaanGaris() {
        double m = this.getGradien();
        double c = awal.getOrdinat() - m * awal.getAbsis();
        System.out.println("Persamaan garis: y = " + m + "x + " + c);
    }
}
