/* Nama File    : BangunDatar.Java 
 * Deskripsi    : berisi atribut dan method dalam class BangunDatar
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 12 Maret 2026
 */

public class BangunDatar {
    // ======= ATRIBUT =======
    private int JmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    // ======= METHOD =======
    // Konstruktor
    public BangunDatar(){
        counterBangunDatar++;
    }

    public BangunDatar(int JmlSisi, String warna, String border){
        this.JmlSisi = JmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    // Selektor
    public int getJmlSisi() {
        return JmlSisi;
    }
    
    public String getBorder() {
        return border;
    }
    
    public String getWarna() {
        return warna;
    }

    // Mutator
    public void setJmlSisi(int JmlSisi) {
        this.JmlSisi = JmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // ======= METHOD LAIN =======
    public void printInfo(){
        System.out.println("Jumlah Sisi : " + JmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }
}

