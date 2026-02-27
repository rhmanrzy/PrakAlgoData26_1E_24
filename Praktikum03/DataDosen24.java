package Praktikum03;

public class DataDosen24 {
    void dataSemuaDosen(Dosen24[] arrayOfDosen24s){
        for (int i = 0; i < arrayOfDosen24s.length; i++) {
            arrayOfDosen24s[i].cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen24s){
        int pria = 0, wanita = 0;
        for (Dosen24 d : arrayOfDosen24s) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
        System.out.println("------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen24s){
        int totalPria = 0, totalWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen24 d : arrayOfDosen24s) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        if (jumlahPria > 0) {
            System.out.println("Rata - rata usia dosen pria : " + (double) totalPria / jumlahPria);
        }

        if (jumlahWanita > 0) {
            System.out.println("Rata - rata usia dosen wanita : " + (double) totalWanita / jumlahWanita);
        }
    }

    void infoDosenPalingTua(Dosen24[] arrayOfDosen24s){
        Dosen24 tertua = arrayOfDosen24s[0];
        for (Dosen24 d : arrayOfDosen24s) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen24[] arrayOfDosen24s){
        Dosen24 termuda = arrayOfDosen24s[0];
        for (Dosen24 d : arrayOfDosen24s) {
            if (d.usia > termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}
