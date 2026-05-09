package Pertemuan12.AntrianLayananUnitKemahasiswaan;

public class Mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa24(String nim, String nama, String kelas, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}