package minggu5;

public class MainMahasiswa {
    public static void main(String[] args) {

        int uts[] = {78, 85, 90, 76, 92, 88, 80, 82};
        int uas[] = {82, 88, 87, 79, 95, 85, 83, 84};

        Mahasiswa m = new Mahasiswa();

        int max = m.maxUTS(uts, 0, uts.length - 1);
        int min = m.minUTS(uts, 0, uts.length - 1);
        double rata = m.rataUAS(uas);

        System.out.println("Nilai UTS tertinggi : " + max);
        System.out.println("Nilai UTS terendah : " + min);
        System.out.println("Rata-rata nilai UAS : " + rata);
    }
}