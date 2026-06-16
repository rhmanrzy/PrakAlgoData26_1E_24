package P16;

public class Nilai {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilai;

    public Nilai(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilai = nilai;
    }

    @Override
    public String toString() {
        return mahasiswa.nim + "\t" + mahasiswa.nama + "\t" + mataKuliah.namaMK + "\t" + mataKuliah.sks + "\t" + nilai;
    }
}