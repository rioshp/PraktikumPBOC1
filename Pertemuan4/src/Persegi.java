/* Nama File    : Persegi.java 
 * Deskripsi    : berisi atribut dan method dalam class Persegi
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 12 Maret 2026
 */

public class Persegi extends BangunDatar {
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
}
