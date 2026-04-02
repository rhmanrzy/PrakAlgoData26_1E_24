package Praktikum05;

import java.util.Scanner;

public class DosenMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen list = new DataDosen();

        int pilih;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Masukkan Kode                : ");
                    String kd = sc.nextLine();

                    System.out.print("Masukkan Nama                : ");
                    String nama = sc.nextLine();

                    System.out.print("Masukkan Jenis Kelamin (L/P) : ");
                    String jkInput = sc.nextLine();
                    boolean jk;
                    if (jkInput.equalsIgnoreCase("L")) {
                        jk = true;
                    } else {
                        jk = false;
                    }

                    System.out.print("Masukkan Usia                : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen d = new Dosen(kd, nama, jk, usia);
                    list.tambah(d);
                    break;

                case 2:
                    list.tampil();
                    break;

                case 3:
                    list.sortingASC();
                    System.out.println("Data diurutkan ASC (termuda ke tertua)");
                    list.tampil();
                    break;

                case 4:
                    list.sortingDSC();
                    System.out.println("Data diurutkan DSC (tertua ke termuda)");
                    list.tampil();
                    break;

                case 0:
                    System.out.println("Keluar");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while(pilih != 0);
    }
}
