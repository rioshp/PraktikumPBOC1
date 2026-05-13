/* Nama File    : MainTeman.java
 * Deskripsi    : Kelas utama untuk menguji kelas Teman
 * Pembuat      : Rio Setiawan Hastanu Putra / 24060124130068
 * Tanggal      : 7 Mei 2026
 */
public class MainTeman {
    public static void main(String[] args) {
        Teman teman = new Teman();
        teman.addNama("rofad");
        teman.addNama("john");
        teman.addNama("andrew");
        teman.addNama("mikel");
        teman.addNama("sofyan");
        teman.showTeman();

        teman.setNama(3, "purwanto");
        teman.showTeman();

        teman.delNama("sofyan");
        teman.showTeman();

        teman.gantiNama("rofad","rofadhamdani");
        teman.showTeman();

        if(teman.isMember("john")) {
            System.out.println("Apakah john adalah teman : john adalah teman");
        } else {
            System.out.println("Apakah john adalah teman : john bukan teman");
        }

        System.out.println("Jumlah teman: " + teman.getNbelm());
        System.out.println("Nama teman ke-2: " + teman.getNama(2));

        teman.addNama("andrew");
        teman.showTeman();
        System.out.println("jumlah teman bernama andrew: " + teman.countNama("andrew"));
    }
}
