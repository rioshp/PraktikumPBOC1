/* Nama File    : Main.Java
 * Deskripsi    : berisi class Main untuk program Latihan_1
 * Pembuat      : Rio Setiawan Hastanu Putra
 * Tanggal      : 18 Maret 2026
 */

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		// ======= OBJEK DosenTetap =======
		System.out.println("===== Dosen Tetap =====");
		DosenTetap DT1 = new DosenTetap(
			"9545647548",
			"Kakashi Hatake",
			LocalDate.of(1980, 5, 12),
			LocalDate.of(2010, 3, 1),
			5500000,
			"Fakultas Sains dan Matematika",
			"78647324"
		);
		System.out.println("DT1");
		DT1.printInfo();
		System.out.println("Tanggal Pensiun : " + DT1.hitungTglPensiun());
		System.out.println();

		// ======= OBJEK DosenTetap dari Pegawai =======
		System.out.println("===== Dosen Tetap dari Pegawai =====");
		Pegawai P1 = new DosenTetap(
			"1234567890",
			"Jiraiya",
			LocalDate.of(1979, 11, 9),
			LocalDate.of(2008, 2, 1),
			6200000,
			"Fakultas Teknik",
			"99887766"
		);
		System.out.println("P1");
		P1.printInfo();
		System.out.println("Tanggal Pensiun : " + ((DosenTetap) P1).hitungTglPensiun());
		System.out.println();

		// ======= OBJEK DosenTamu =======
		System.out.println("===== Dosen Tamu =====");
		DosenTamu DT2 = new DosenTamu();
		System.out.println("DT2");
		DT2.setNip("8573837849");
		DT2.setNama("Iruka Umino");
		DT2.setTglLahir(LocalDate.of(1987, 8, 21));
		DT2.setTmt(LocalDate.of(2020, 9, 1));
		DT2.setGaji(4500000);
		DT2.setFakultas("Fakultas Teknik");
		DT2.setNidk("23876412");
		DT2.setAkhirKontrak(LocalDate.of(2026, 12, 31));
		DT2.printInfo();
		System.out.println();

		// ======= OBJEK DosenTamu dari Pegawai =======
		System.out.println("===== Dosen Tamu dari Pegawai =====");
		Pegawai P2 = new DosenTamu(
			"2233445566",
			"Shikamaru Nara",
			LocalDate.of(1990, 6, 18),
			LocalDate.of(2021, 1, 1),
			4800000,
			"Fakultas Ekonomika dan Bisnis",
			"77665544",
			LocalDate.of(2027, 1, 31)
		);
		System.out.println("P2");
		P2.printInfo();
		System.out.println("Akhir Kontrak   : " + ((DosenTamu) P2).getAkhirKontrak());
		System.out.println();

		// ======= OBJEK Tendik =======
		System.out.println("===== Tendik =====");
		Tendik T1 = new Tendik();
		System.out.println("T1");
		T1.setNip("1987654321");
		T1.setNama("Naruto Uzumaki");
		T1.setTglLahir(LocalDate.of(1985, 2, 2));
		T1.setTmt(LocalDate.of(2012, 7, 1));
		T1.setGaji(4000000);
		T1.setBidang("Akademik");
		T1.setBup(55);
		T1.printInfo();
		System.out.println();

		// ======= OBJEK Tendik dari Pegawai =======
		System.out.println("===== Tendik dari Pegawai =====");
		Pegawai P3 = new Tendik(
			"1098765432",
			"Hinata Hyuga",
			LocalDate.of(1984, 1, 25),
			LocalDate.of(2011, 8, 1),
			4300000,
			"Sumber Daya"
		);
		System.out.println("P3");
		P3.printInfo();
		System.out.println("Tanggal Pensiun : " + ((Tendik) P3).hitungTglPensiun());
	}
}
