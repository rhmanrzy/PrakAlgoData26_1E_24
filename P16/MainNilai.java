package P16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MainNilai {
    static ArrayList<Mahasiswa> daftarMhs = new ArrayList<>();
static ArrayList<MataKuliah> daftarMK = new ArrayList<>();
static ArrayList<Nilai> daftarNilai = new ArrayList<>();
static Queue<Mahasiswa> queueMhs = new LinkedList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        daftarMhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));
        queueMhs.addAll(daftarMhs);
        daftarMK.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih;
        do {
            System.out.println("************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("************************************************");
            System.out.println();
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Data Mahasiswa (Queue)");
            System.out.println("6. Keluar");
            System.out.println("************************************************");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("\nMasukkan data");
                    System.out.print("Kode     : ");
                    String kode = sc.next();
                    System.out.print("Nilai    : ");
                    String nilaiStr = sc.next();
                    nilaiStr = nilaiStr.replace(",", ".");
                    double nilai = Double.parseDouble(nilaiStr);
                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-10s\n", "NIM", "Nama", "Telf");
                    for (Mahasiswa m : daftarMhs) {
                        System.out.printf("%-8s %-15s %-10s\n", m.nim, m.nama, m.notelp);
                    }
                    System.out.print("\nPilih mahasiswa by NIM : ");
                    String nim = sc.next();
                    Mahasiswa mhsDipilih = null;
                    for (Mahasiswa m : daftarMhs) {
                        if (m.nim.equals(nim)) {
                            mhsDipilih = m;
                            break;
                        }
                    }
                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliah mk : daftarMK) {
                        System.out.printf("%-8s %-40s %-5d\n", mk.kodeMK, mk.namaMK, mk.sks);
                    }
                    System.out.print("\nPilih MK by kode : ");
                    String kodeMK = sc.next();
                    MataKuliah mkDipilih = null;
                    for (MataKuliah mk : daftarMK) {
                        if (mk.kodeMK.equals(kodeMK)) {
                            mkDipilih = mk;
                            break;
                        }
                    }
                    daftarNilai.add(new Nilai(mhsDipilih, mkDipilih, nilai));
                    break;
                case 2:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-40s %-5s %-8s\n","NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n",
                                n.mahasiswa.nim,
                                n.mahasiswa.nama,
                                n.mataKuliah.namaMK,
                                n.mataKuliah.sks,
                                n.nilai);
                    }
                    break;
                case 3:
                    System.out.println("\nDAFTAR NILAI MAHASISWA");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-40s %-5s %-8s\n",
                            "NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n", n.mahasiswa.nim, n.mahasiswa.nama, n.mataKuliah.namaMK, n.mataKuliah.sks, n.nilai);
                    }
                    System.out.print("\nMasukkan NIM mahasiswa : ");
                    String cari = sc.next();
                    int totalSKS = 0;
                    System.out.println("\nHASIL PENCARIAN");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-40s %-5s %-8s\n","NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        if (n.mahasiswa.nim.equals(cari)) {
                            System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n", n.mahasiswa.nim, n.mahasiswa.nama, n.mataKuliah.namaMK, n.mataKuliah.sks, n.nilai);
                            totalSKS += n.mataKuliah.sks;
                        }
                    }
                    System.out.println("Total SKS yang diambil: " + totalSKS);
                    break;
                case 4:
                    Collections.sort(daftarNilai, Comparator.comparingDouble(n -> n.nilai));
                    System.out.println("\nDAFTAR NILAI MAHASISWA (TERURUT)");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-40s %-5s %-8s\n","NIM", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    for (Nilai n : daftarNilai) {
                        System.out.printf("%-8s %-15s %-40s %-5d %-8.2f\n", n.mahasiswa.nim, n.mahasiswa.nama, n.mataKuliah.namaMK, n.mataKuliah.sks, n.nilai);
                    }
                    break;
                case 5:
                if (queueMhs.isEmpty()) {
                    System.out.println("Data mahasiswa kosong!");
                } else {
                    Mahasiswa hapus = queueMhs.poll();
                    daftarMhs.removeIf(m -> m.nim.equals(hapus.nim));
                    daftarNilai.removeIf(n -> n.mahasiswa.nim.equals(hapus.nim));
                    System.out.println("\nDATA MAHASISWA YANG DIHAPUS (FIFO)");
                    System.out.println("************************************************");
                    System.out.printf("%-8s %-15s %-10s\n", "NIM", "Nama", "Telf");
                    System.out.printf("%-8s %-15s %-10s\n", hapus.nim, hapus.nama, hapus.notelp);
                }
                break;
                case 6:
                    System.out.println("Program selesai...");
                    break;
                default:
                    System.out.println("Menu tidak tersedia!");
            }
            System.out.println();
        } while (pilih != 6); 
    }
}