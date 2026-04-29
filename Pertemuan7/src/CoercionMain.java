/* Nama File    : CoercionMain.java 
 * Deskripsi    : Program implementasi dari polimorfisme coercion
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 23 April 2026
 */

public class CoercionMain {
    public static void main(String[] args) throws Exception {
        int a = 65;
        System.out.println("Nilai 65 sebagai integer : " + a);

        // int to char
        System.out.println("Nilai 65 setelah dikonversi ke char : " + (char) a);

        // int to real
        System.out.println("Nilai 65 setelah dikonversi ke double : " + (double) a);
        
        // int to real to int
        double a_real = a;
        int a_int = (int) a_real;
        System.out.println("Nilai 65 real : " + a_real);
        System.out.println("Nilai 65 setelah dikonversi kembali ke int dari real : " + a_int);


        
        /* === String === */
        System.out.println("\n=== String ===");
        // String to int
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        int Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("Konkatenasi X dan Y : " + S);
        System.out.println("Penjumlahan angka X dan Y : " + Z);

        // String to real
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("Konkatenasi P dan Q : " + R);
        System.out.println("Penjumlahan angka P dan Q : " + D);

        // String to int dan int to String
        Integer A = Integer.parseInt(S);
        System.out.println("Nilai S dikonversi ke integer A : " + A);
        System.out.println("Tipe A : " + A.getClass().getSimpleName());
        
        String T = A.toString();
        System.out.println("Nilai A dikonversi kembali ke String T : " + T);
        System.out.println("Tipe T : " + T.getClass().getSimpleName());
    }
}
