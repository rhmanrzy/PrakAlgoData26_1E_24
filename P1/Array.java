package P1;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner lia = new Scanner(System.in);

        String[] namaMK = {"Pancasila",
        "Konsep Teknologi Informasi",
        "Critical Thinking dan Problem Solving",
        "Matematika Dasar",
        "Bahasa Inggris",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Keselamatan dan Kesehatan Kerja"};

        double[] nilaiAngka = new double[namaMK.length];
        String[] nilaiHuruf = new String[namaMK.length];
        double[] bobotNilai = new double[namaMK.length];

        int[] sks = {2, 2, 2, 3, 2, 3, 2, 2};

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");

        for (int i = 0; i < namaMK.length; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + namaMK[i] + " : ");
            nilaiAngka[i] = lia.nextDouble();
        }

        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.printf("%-40s %-13s %-13s %-12s\n",
        "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        double total = 0;
        int totalSKS = 0;

        for (int i = 0; i < namaMK.length; i++) {

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            System.out.printf("%-40s %-13.2f %-13s %-12.2f\n",
            namaMK[i],
            nilaiAngka[i],
            nilaiHuruf[i],
            bobotNilai[i]);

            total += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = total / totalSKS;

        System.out.println("================================");
        System.out.printf("IP : %.2f\n", ip);
    }
}