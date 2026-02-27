package Praktikum03;

public class DataDosen24 {
    void dataSemuaDosen(Dosen24[] arrayOfDosen24){
        for (int i = 0; i < arrayOfDosen24.length; i++) {
            arrayOfDosen24[i].cetakInfo();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen24){
        int pria = 0, wanita = 0;
        for (Dosen24 d : arrayOfDosen24) {
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

    void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen24){
        int totalPria = 0, totalWanita = 0, jumlahPria = 0, jumlahWanita = 0;
        for (Dosen24 d : arrayOfDosen24) {
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

    void infoDosenPalingTua(Dosen24[] arrayOfDosen24){
        Dosen24 tertua = arrayOfDosen24[0];
        for (Dosen24 d : arrayOfDosen24) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("=== Dosen Paling Tua ===");
        tertua.cetakInfo();
    }

    void infoDosenPalingMuda(Dosen24[] arrayOfDosen24){
        Dosen24 termuda = arrayOfDosen24[0];
        for (Dosen24 d : arrayOfDosen24) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("=== Dosen Paling Muda ===");
        termuda.cetakInfo();
    }
}
