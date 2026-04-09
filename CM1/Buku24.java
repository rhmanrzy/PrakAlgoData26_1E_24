package CM1;

public class Buku24 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku24(String kodeBuku, String judul, int tahunTerbit){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    void tampilBuku(){
        System.out.println("Kode : " + kodeBuku + " | Judul : " + judul + " | Tahun Terbit : " + tahunTerbit);
    }
}
