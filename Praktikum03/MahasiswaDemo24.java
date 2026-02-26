package Praktikum03;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa24[] arrayOfMahasiswa24 = new Mahasiswa24[3];
        String dummy;
        
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa24[i] = new Mahasiswa24();
            System.out.println("Masukkan Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM     : ");
            arrayOfMahasiswa24[i].nim = sc.nextLine();
            System.out.print("Nama    : ");
            arrayOfMahasiswa24[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrayOfMahasiswa24[i].kelas = sc.nextLine();
            System.out.print("IPK     : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa24[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.println("NIM   : " + arrayOfMahasiswa24[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa24[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa24[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa24[i].ipk);
            System.out.println("-----------------------------------");
        }
    }
}