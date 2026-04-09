package CM1;

import java.util.Scanner;

public class CMMain24 {

    static void sortDenda(Peminjaman24[] data) {
        for (int i = 1; i < data.length; i++) {
            Peminjaman24 key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].denda < key.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    static void sortNIM(Peminjaman24[] data) {
       
    }

    static void cariNIM(Peminjaman24[] data, String nim) {
        boolean ditemukan = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].mhs.nim.equals(nim)) {
                data[i].tampilPeminjaman();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Mahasiswa24[] mhs = {
            new Mahasiswa24("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa24("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa24("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku24[] buku = {
            new Buku24("B001", "Algoritma", 2020),
            new Buku24("B002", "Basis Data", 2019),
            new Buku24("B003", "Pemrograman", 2021),
            new Buku24("B004", "Fisika", 2024)
        };

        Peminjaman24[] pinjam = {
            new Peminjaman24(mhs[0], buku[0], 7),
            new Peminjaman24(mhs[1], buku[1], 3),
            new Peminjaman24(mhs[2], buku[2], 10),
            new Peminjaman24(mhs[2], buku[3], 6),
            new Peminjaman24(mhs[0], buku[1], 4)
        };

        int pilih;

        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Daftar Mahasiswa :");
                    for (Mahasiswa24 m : mhs) m.tampilMahasiswa();
                    break;

                case 2:
                    System.out.println("Daftar Buku :");
                    for (Buku24 b : buku) b.tampilBuku();
                    break;

                case 3:
                    System.out.println("Data Peminjaman :");
                    for (Peminjaman24 p : pinjam) p.tampilPeminjaman();
                    break;

                case 4:
                    sortDenda(pinjam);
                    System.out.println("Setelah diurutkan (Denda terbesar) : ");
                    for (Peminjaman24 p : pinjam) p.tampilPeminjaman();
                    break;

                case 5:
                    sortNIM(pinjam);
                    System.out.print("Masukkan NIM : ");
                    String nim = sc.next();
                    cariNIM(pinjam, nim);
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}