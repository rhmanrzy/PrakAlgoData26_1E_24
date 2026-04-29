package TugasJobsheet10;

import java.util.Scanner;

public class MainKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian KRS - DPA ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Panggil Antrian (2 Mahasiswa)");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Paling Akhir");
            System.out.println("6. Jumlah Antrian Saat Ini");
            System.out.println("7. Jumlah yang Sudah KRS");
            System.out.println("8. Jumlah yang Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM     : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama    : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi   : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas   : ");
                    String kelas = sc.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.panggilAntrian();
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.tampilkan2Depan();
                    break;

                case 5:
                    antrian.LihatAkhir();
                    break;

                case 6:
                    System.out.println("Jumlah antrian saat ini : " + antrian.getJumlah());
                    break;

                case 7:
                    System.out.println("Jumlah yang sudah KRS : " + antrian.getSudahKRS());
                    break;

                case 8:
                    System.out.println("Jumlah yang belum KRS : " + antrian.getBelumKRS());
                    break;

                case 9:
                    antrian.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;
            
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}