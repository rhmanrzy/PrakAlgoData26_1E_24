package Jobsheet9;

public class Surat24 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat24(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    void tampilSurat(){
        System.out.println("ID Surat           : " + idSurat);
        System.out.println("Nama Mahasiswa     : " + namaMahasiswa);
        System.out.println("Kelas              : " + kelas);
        System.out.println("Jenis Izin         : " + jenisIzin);
        System.out.println("Durasi             : " + durasi + " hari");
        System.out.println("---------------------------------------");
    }
}