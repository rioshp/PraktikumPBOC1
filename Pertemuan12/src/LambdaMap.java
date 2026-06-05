/**
 * Nama File    : LambdaMap.java
 * Deskripsi    : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068 / C1
 * Tanggal      : 3 Juni 2026
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        //deklarasi Map
        Map<String, String> mahasiswaMap = new HashMap<>();

        //menambahkan data mahasiswa ke Map
        mahasiswaMap.put("24060124130011", "Joko");
        mahasiswaMap.put("24060124130012", "Sulis");
        mahasiswaMap.put("24060124130013", "Karno");
        mahasiswaMap.put("24060124130014", "Didit");

        //lambda digunakan sebagai parameter
        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM : " + nim + ", Nama : " + nama));
    }
}