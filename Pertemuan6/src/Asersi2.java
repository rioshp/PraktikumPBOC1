/* Nama File    : Asersi2.Java 
 * Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 14 April 2026
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

// konsep nya kurang tepat karena jika dijalankan tidak menggunakan command -ea, maka asersi tidak di eksekusi dan program tetap berjalan walaupun 
// input jariJari=0, solusinya bisa menggunakan if else agar perintah untuk menjalankan programnya tidak memerlukan -ea(enableassertions), 
// jadi sifat asersi yang menggunakan if else ini mutlak akan selalu dijalankan jika tidak memenuhi kondisi
// contoh Solusi menggunakan if else
/*
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        if (jariJari > 0) {
            Lingkaran l = new Lingkaran(jariJari);
            double kelilingLingkaran = l.hitungKeliling();
            System.out.println("Keliling lingkaran = " + kelilingLingkaran);
        } else {
            System.out.println("Jari-jari tidak boleh nol!!!");
        }
    }
}
*/