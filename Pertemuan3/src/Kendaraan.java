/* Nama File    : Kendaraan.Java 
 * Deskripsi    : berisi atribut dan method dalam class Kendaraan
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 05 Maret 2026
 */

public class Kendaraan {
    /***************ATRIBUT***************/
    private String noPlat;
    private String jenis;
    private static int counterKendaraan = 0;

    /***************METHOD***************/
    // Konstruktor
    public Kendaraan(){
        this.noPlat = "404";
        this.jenis = "UFO";
        counterKendaraan++;
    }

    public Kendaraan(String NoPlat, String Jenis){
        if (Jenis == "motor"){
            
        }
        this.noPlat = NoPlat;
        this.jenis = Jenis;
        counterKendaraan++;
    }

    // Selektor
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public int getCounterKendaraan(){
        return counterKendaraan;
    }

    // Mutator
    public void setNoPlat(String NoPlat){
        this.noPlat = NoPlat;
    }

    public void setJenis(String Jenis){
        this.jenis = Jenis;
    }
}
