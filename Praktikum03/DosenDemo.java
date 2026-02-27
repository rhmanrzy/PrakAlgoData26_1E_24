package Praktikum03;

import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy, input;
        Boolean jenisKelamin;

        System.out.print("Masukkan jumlah dosen : ");
        dummy = sc.nextLine();
        int jumlah = Integer.parseInt(dummy);
        Dosen24[] arrayOfDosen24 = new Dosen24[jumlah];
        int usia;
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode                : ");
            kode = sc.nextLine();
            System.out.print("Nama                : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (p/w) : ");
            input = sc.nextLine();
            System.out.print("Usia                : ");
            dummy = sc.nextLine();
            if (input.equals("p")) {
                jenisKelamin = true;
            } else {
                jenisKelamin = false;
            }
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------");
            arrayOfDosen24[i] = new Dosen24(kode, nama, jenisKelamin, usia);
        }

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen24[i].cetakInfo();
        }
    }
}