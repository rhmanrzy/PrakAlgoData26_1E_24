package P1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {

        Scanner lia = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = lia.nextDouble();

        System.out.print("Masukkan Nilai Kuis  : ");
        double kuis = lia.nextDouble();

        System.out.print("Masukkan Nilai UTS   : ");
        double uts = lia.nextDouble();

        System.out.print("Masukkan Nilai UAS   : ");
        double uas = lia.nextDouble();

        System.out.println("==============================");
        System.out.println("==============================");

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {

            System.out.println("Nilai Tidak Valid");
            System.out.println("==============================");
            System.out.println("==============================");
        } else {

            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            String nilaiHuruf;
            String keterangan;

            if (nilaiAkhir > 80 && nilaiAkhir <=100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir > 73 && nilaiAkhir <=80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir > 65 && nilaiAkhir <=73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir > 60 && nilaiAkhir <=65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir > 50 && nilaiAkhir <=60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir > 39 && nilaiAkhir <=50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
                keterangan = "SELAMAT ANDA LULUS";
            } else {
                keterangan = "ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println(keterangan);
        }
    }
}