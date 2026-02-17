package P1;

import java.util.Scanner;

public class Tugas2 {

    static Scanner lia = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah jadwal kuliah (n) : ");
        int n = lia.nextInt();
        lia.nextLine();

        String[][] jadwal = new String[n][4];

        inputData(jadwal);
        tampilkanSemua(jadwal);
        cariBerdasarkanHari(jadwal);
        cariBerdasarkanMatkul(jadwal);
    }

    public static void inputData(String[][] array) {
        System.out.println("\n=== INPUT DATA JADWAL ===");
        for (int i = 0; i < array.length; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Mata Kuliah : ");
            array[i][0] = lia.nextLine();
            System.out.print("Ruang       : ");
            array[i][1] = lia.nextLine();
            System.out.print("Hari        : ");
            array[i][2] = lia.nextLine();
            System.out.print("Jam         : ");
            array[i][3] = lia.nextLine();
        }
    }

    public static void tampilkanSemua(String[][] array) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");

        System.out.printf("%-20s %-15s %-10s %-15s\n",
        "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-20s %-15s %-10s %-15s\n",
            array[i][0], array[i][1], array[i][2], array[i][3]);
        }
    }

    public static void cariBerdasarkanHari(String[][] array) {
        System.out.print("\nMasukkan hari yang ingin dicari : ");
        String cari = lia.nextLine();

        int jumlah = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i][2].equalsIgnoreCase(cari)) {
                System.out.println("- " + array[i][0] +
                " | Ruang: " + array[i][1] +
                " | Jam: " + array[i][3]);
                jumlah++;
            }
        }

        if (jumlah == 0) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariBerdasarkanMatkul(String[][] array) {
        System.out.print("\nMasukkan nama mata kuliah yang dicari : ");
        String cari = lia.nextLine();

        int jumlah = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i][0].equalsIgnoreCase(cari)) {
                System.out.println("Mata Kuliah : " + array[i][0]);
                System.out.println("Ruang       : " + array[i][1]);
                System.out.println("Hari        : " + array[i][2]);
                System.out.println("Jam         : " + array[i][3]);
                jumlah++;
            }
        }

        if (jumlah == 0) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}