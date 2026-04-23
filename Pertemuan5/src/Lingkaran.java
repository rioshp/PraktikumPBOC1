/* Nama File    : Lingkaran.java 
 * Deskripsi    : berisi atribut dan method dalam class Lingkaran
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 26 Maret 2026
 */


public class Lingkaran extends BangunDatar implements IResize {
    // ======= ATRIBUT =======
    private double jari;

    // ======= METHOD =======
    // Konstruktor
    public Lingkaran(){
        setJmlSisi(1);
    }

    public Lingkaran(double jari, String warna, String border){
        super(1, warna, border);
        this.jari = jari;
    }

    // Selektor
    public double getJari(){
        return jari;
    }

    // Mutator
    public void setJari(double jari){
        this.jari = jari;
    }

    // ======= METHOD LAIN =======
    public double getLuas(){
        return Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling(){
        return Math.PI * (jari*2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari    : " + jari);
    }

    @Override
    public void zoomIn() {
        this.jari *= 1.1;
    }

    @Override
    public void zoomOut() {
        this.jari *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.jari *= (1 + percent/100.0);
    }
}
