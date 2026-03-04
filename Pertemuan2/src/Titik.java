/* Nama File    : Titik Java 
 * Deskripsi    : berisi atribut dan method dalam class Titik
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 26 Februari 2026
 */

public class Titik {
    /***************ATRIBUT***************/
    private double absis;
    private double ordinat;
    static int counterTitik = 0;

    /***************METHOD***************/
    //konstruktor untuk membuat titik (absis,ordinat) dengan nilai absis dan ordinat yang diberikan
    public Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    // konstruktor untuk membuat titik dengan absis dan ordinat default (0,0)
    public Titik() {
        this(0,0);
    }

    // mengembalikan jumlah objek titik yang telah dibuat
    public static int getCounterTitik(){
        return counterTitik;
    }

    //mengembalikan nilai absis
    public double getAbsis() {
        return absis;
    }
    //mengembalikan nilai ordinat
    public double getOrdinat() {
        return ordinat;
    }

    //mengeset absis titik dengan nilai baru x
    public void setAbsis(double x) {
        absis = x;
    }

    //mengeset ordinat titik dengan nilai baru y
    public void setOrdinat(double y) {
        ordinat = y;
    }

    //menggeser nilai absis dan ordinat titik masing-masing sejauh x dan y
    public void geser(double x, double y) {
        absis = absis + x;
        ordinat = ordinat + y;
    }

    // mengembalikan nilai kuadran titik
    public int getKuadran(){
        if (this.absis > 0 && this.ordinat > 0){
            return 1;
        } else if (this.absis < 0 && this.ordinat > 0){
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        } else if (this.absis > 0 && this.ordinat < 0){
            return 4;
        } else {
            return 0; //titik berada pada sumbu x atau y
        }
    }

    // mengembalikan jarak titik ke pusat koordinat (0,0)
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
    }

    // mengembalikan jarak titik ke titik T
    public double getJarak(Titik T){
        return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
    }

    // merefleksikan titik terhadap sumbu x
    public void refleksiX(){
        this.ordinat = -this.ordinat;
    }

    // merefleksikan titik terhadap sumbu y
    public void refleksiY(){
        this.absis = -this.absis;
    }

    // mengembalikan titik hasil refleksi terhadap sumbu x
    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    // mengembalikan titik hasil refleksi terhadap sumbu y
    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }

    //mencetak koordinat titik
    public void printTitik() {
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    public void printCounterTitik(){
        System.out.println(counterTitik);
    }
} //end class Titik