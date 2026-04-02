package Praktikum05;

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

    void bubbleSort(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa24 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}