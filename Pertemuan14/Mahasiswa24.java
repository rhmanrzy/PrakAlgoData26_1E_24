package Pertemuan14;

public class Mahasiswa24 {
    String nim24;
    String nama24;
    String kelas24;
    double ipk24;

    public Mahasiswa24() {
    }

    public Mahasiswa24(String nim24, String nama24, String kelas24, double ipk24) {
        this.nim24 = nim24;
        this.nama24 = nama24;
        this.kelas24 = kelas24;
        this.ipk24 = ipk24;
    }

    public void tampilInformasi() {
        System.out.println("NIM   : " + this.nim24 + " " +
        "Nama : " + this.nama24 + " " +
        "Kelas : " + this.kelas24 + " " +
        "IPK : " + this.ipk24);
    }
}