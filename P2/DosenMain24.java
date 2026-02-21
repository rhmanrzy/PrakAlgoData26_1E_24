package P2;

public class DosenMain24 {
    public static void main(String[] args) {

        Dosen24 dsn1 = new Dosen24();
        dsn1.idDosen = "DS001";
        dsn1.nama = "Dr. Andi Pratama";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";

        Dosen24 dsn2 = new Dosen24("DS002","Prof. Siti Rahma",false,2010,"Basis Data");

        dsn1.tampilInformasi();
        dsn2.tampilInformasi();

        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Kecerdasan Buatan");
        System.out.println("Masa Kerja: " + dsn1.hitungMasaKerja(2026) + " tahun");
        dsn1.tampilInformasi();

        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Sistem Informasi");
        System.out.println("Masa Kerja: " + dsn2.hitungMasaKerja(2026) + " tahun");
        dsn2.tampilInformasi();
    }
}