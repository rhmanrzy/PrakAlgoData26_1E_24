package P6;

import java.util.Scanner;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24(jumMhs);

        for(int i = 0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            System.out.println("------------------------------------------");
            list.tambah(new Mahasiswa24(nim, nama, kelas, ipk));
        }
        
        list.tampil();
        System.out.println("------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("------------------------------------------");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();
        System.out.println("Menggunakan Sequential Searching");
        int posisi = list.sequentialSearching(cari);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}