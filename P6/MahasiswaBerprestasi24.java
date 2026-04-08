package P6;

public class MahasiswaBerprestasi24 {
    Mahasiswa24[] listMhs;
    int idx = 0;

    MahasiswaBerprestasi24(int n){
        listMhs = new Mahasiswa24[n];
    }

    void tambah(Mahasiswa24 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++){
            listMhs[i].tampilInformasi();
            System.out.println("---------------------------------");
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK : " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("nim   : " + listMhs[pos].nim);
            System.out.println("nama  : " + listMhs[pos].nama);
            System.out.println("kelas : " + listMhs[pos].kelas);
            System.out.println("ipk   : " + x);
        } else {
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}