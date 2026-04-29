package Jobsheet9;

import java.util.Scanner;

public class MainSurat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat24 stack = new StackSurat24();

        int pilih;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat         : ");
                    String id = sc.nextLine();

                    System.out.print("Nama Mahasiswa   : ");
                    String nama = sc.nextLine();

                    System.out.print("Kelas            : ");
                    String kelas = sc.nextLine();

                    System.out.print("Jenis Izin (S/I) : ");
                    char jenis = sc.next().charAt(0);

                    System.out.print("Durasi (hari)    : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    Surat24 s = new Surat24(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat24 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Surat diproses : ");
                        proses.tampilSurat();
                    }
                    break;

                case 3:
                    Surat24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir : ");
                        lihat.tampilSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama : ");
                    String cari = sc.nextLine();
                    stack.cari(cari);
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);
    }
}