package Jobsheet12;

public class Mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa24(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
            "NIM     : " + nim +
            "\n Nama   : " + nama +
            "\nKelas   : " + kelas +
            "\nIPK     : " + ipk
        );
    }
}