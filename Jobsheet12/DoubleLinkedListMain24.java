package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain24 {
    public static Mahasiswa24 inputMahasiswa(Scanner scan) {
    System.out.print("Masukkan NIM   : ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama  : ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas : ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK   : ");
    double ipk = scan.nextDouble();
    scan.nextLine();
    return new Mahasiswa24(nim, nama, kelas, ipk);
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList24 list = new DoubleLinkedList24();
        int pilihan;
        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data setelah NIM tertentu");
            System.out.println("4. Tambah data pada index tertentu");
            System.out.println("5. Hapus data di awal");
            System.out.println("6. Hapus data di akhir");
            System.out.println("7. Hapus data setelah NIM tertentu");
            System.out.println("8. Hapus data berdasarkan index");
            System.out.println("9. Tampilkan data");
            System.out.println("10. Tampilkan data terbalik");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data berdasarkan index");
            System.out.println("14. Tampilkan jumlah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data mahasiswa");
                    Mahasiswa24 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    System.out.println("Masukkan data mahasiswa");
                    Mahasiswa24 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();
                    System.out.println("Masukkan data baru : ");
                    Mahasiswa24 dataBaru = inputMahasiswa(scan);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    System.out.print("Masukkan index : ");
                    int indexTambah = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Masukkan data mahasiswa : ");
                    Mahasiswa24 dataIndex = inputMahasiswa(scan);
                    list.add(indexTambah, dataIndex);
                    break;
                case 5:
                    list.removeFirst();
                    break;
                case 6:
                    list.removeLast();
                    break;
                case 7:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String nimHapus = scan.nextLine();
                    list.removeAfter(nimHapus);
                    break;
                case 8:
                    System.out.print("Masukkan index yang ingin dihapus : ");
                    int indexHapus = scan.nextInt();
                    scan.nextLine();
                    list.remove(indexHapus);
                    break;
                case 9:
                    System.out.println("Isi linked list : ");
                    list.print();
                    break;
                case 10:
                    System.out.println("Isi linked list reverse : ");
                    list.printReverse();
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan index : ");
                    int indexCari = scan.nextInt();
                    scan.nextLine();
                    list.getIndex(indexCari);
                    break;
                case 14:
                    System.out.println("Jumlah data : " + list.size());
                    break;  
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
    }
}