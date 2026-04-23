/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 26 Maret 2026
 */

public class Persegi extends BangunDatar implements IResize {
    // ======= ATRIBUT =======
    private double sisi;

    // ======= METHOD =======
    // Konstruktor
    public Persegi(){
        setJmlSisi(4);
    }


    public Persegi(double sisi, String warna, String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // Selektor
    public double getSisi(){
        return sisi;
    }

    // Mutator
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // ======= METHOD LAIN =======
    public double getKeliling(){
        return 4*sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
    }

    @Override
    public void zoomIn() {
        this.sisi *= 1.1;
    }

    @Override
    public void zoomOut() {
        this.sisi *= 0.9;
    }

    @Override
    public void zoom(int percent) {
        this.sisi *= (1 + percent/100.0);
    }
}
