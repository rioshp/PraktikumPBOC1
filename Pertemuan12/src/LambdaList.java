/**
 * Nama File    : LambdaList.java
 * Deskripsi    : Implementasi lambda pada List, digunakan sebagai parameter pada method.
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068 / C1
 * Tanggal      : 3 Juni 2026
*/

import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Joko");
        mahasiswaList.add("Sulis");
        mahasiswaList.add("Karno");
        mahasiswaList.add("Didit");

        //lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}