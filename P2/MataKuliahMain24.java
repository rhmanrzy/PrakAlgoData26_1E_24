package P2;

public class MataKuliahMain24 {
    public static void main(String[] args) {
        MataKuliah24 mk1 = new MataKuliah24();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        MataKuliah24 mk2 = new MataKuliah24();
        mk2.kodeMK = "IF202";
        mk2.nama = "Basis Data";
        mk2.sks = 2;
        mk2.jumlahJam = 4;

        mk1.tampilkanInformasi();
        mk2.tampilkanInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilkanInformasi();

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
        mk2.tampilkanInformasi();
    }
}