package CM2;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoubleLinkedListPembeli24 listPembeli = new DoubleLinkedListPembeli24();
        DoubleLinkedListPesanan24 listPesanan = new DoubleLinkedListPesanan24();

        int pilih;
        int nomorAntrian = 1;
        do {
            System.out.println();
            System.out.println("================================");
            System.out.println("   SISTEM ANTRIAN ROYAL DELISH  ");
            System.out.println("================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.println("================================");
            System.out.print("Pilih Menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println();
                    System.out.println("===== TAMBAH ANTRIAN =====");
                    System.out.print("Nama Pembeli : ");
                    String namaPembeli = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();
                    Pembeli24 pembeliBaru = new Pembeli24(nomorAntrian, namaPembeli, noHp);
                    listPembeli.addLast(pembeliBaru);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor : " + nomorAntrian);
                    nomorAntrian++;
                    break;
                case 2:
                    System.out.println();
                    listPembeli.print();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("===== HAPUS ANTRIAN =====");
                    Pembeli24 pembeliKeluar = listPembeli.removeFirst();
                    if (pembeliKeluar != null) {
                        System.out.println("Pembeli dipanggil : " + pembeliKeluar.namaPembeli24);
                        System.out.print("Kode Pesanan : ");
                        int kodePesanan = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine();
                        Pesanan24 pesananBaru = new Pesanan24(kodePesanan, namaPesanan, harga);
                        listPesanan.addLast(pesananBaru);
                        System.out.println(pembeliKeluar.namaPembeli24 + " telah memesan " + namaPesanan);
                    }
                    break;
                case 4:
                    System.out.println();
                    listPesanan.sortByNamaPesanan();
                    listPesanan.print();
                    break;
                case 0:
                    System.out.println();
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Menu tidak tersedia (Pilih 1-4)");
            }
        } while (pilih != 0);
    }
}