package Praktikum03;

public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Mahasiswa24[] arrayOfMahasiswa24 = new Mahasiswa24[3];
        arrayOfMahasiswa24[0] = new Mahasiswa24();
        arrayOfMahasiswa24[0].nim = "244107060033";
        arrayOfMahasiswa24[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa24[0].kelas = "SIB - 1E";
        arrayOfMahasiswa24[0].ipk = (float) 3.75;

        arrayOfMahasiswa24[1] = new Mahasiswa24();
        arrayOfMahasiswa24[1].nim = "2341720172";
        arrayOfMahasiswa24[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa24[1].kelas = "TI - 2A";
        arrayOfMahasiswa24[1].ipk = (float) 3.36;

        arrayOfMahasiswa24[2] = new Mahasiswa24();
        arrayOfMahasiswa24[2].nim = "244107023006";
        arrayOfMahasiswa24[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa24[2].kelas = "TI - 2E";
        arrayOfMahasiswa24[2].ipk = (float) 3.80;

        System.out.println("NIM            : " + arrayOfMahasiswa24[0].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa24[0].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa24[0].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa24[0].ipk);
        System.out.println("---------------------------------------------");
        System.out.println("NIM            : " + arrayOfMahasiswa24[1].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa24[1].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa24[1].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa24[1].ipk);
        System.out.println("---------------------------------------------");
        System.out.println("NIM            : " + arrayOfMahasiswa24[2].nim);
        System.out.println("Nama           : " + arrayOfMahasiswa24[2].nama);
        System.out.println("Kelas          : " + arrayOfMahasiswa24[2].kelas);
        System.out.println("IPK            : " + arrayOfMahasiswa24[2].ipk);
        System.out.println("---------------------------------------------");
    }
}